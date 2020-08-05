package homex.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import homex.bean.NoticeEntity;
import homex.bean.QueryMapEntity;
import homex.bean.UserEntity;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.common.util.IdUtil;
import homex.mapper.NoticeEntityMapper;
import homex.mapper.UserEntityMapper;

@Component
public class NoticeService extends BaseService{
	@Autowired NoticeEntityMapper noticeEntityDao;
	@Autowired UserEntityMapper userDao;
	@Autowired QueryMapService queryMapServiceImpl;
	/**
	 * <p>新增一个notice</p>
	 * 1,当前condo可以新增自己condo范围内的所有用户,并可以选取权限
	 * 2,当前tower管理员可以新增,并可以选择不同unit的用户可见
	 * @return
	 */
	/**
	 * 参数情况
	 * @param toTower			接收方的tower
	 * @param toUnit			接收方的unit【可选,数据用‘ - ’ 隔开】
	 * @param subject			标题
	 * @param content			内容
	 * @param userID			作者
	 * @return
	 */
	public Result addNotice(String toTower,String toUnit ,String  subject ,String content , String userID ) {
		if(StrUtil.isBlank(userID)) 
			return Result.buildFailMessage("author is null");
		if(StrUtil.isBlank(subject)) 
			return Result.buildFailMessage("subject is null");
		if(StrUtil.isBlank(content)) 
			return Result.buildFailMessage("content is null");
		log.info("【进入添加notice方法：添加主题："+subject+"，作者："+userID+"，condo："+content+"】");
		NoticeEntity notice = new NoticeEntity();
		notice.setAuthorId(userID);
		notice.setCondoId(userID);
		notice.setToTower(toTower);
		notice.setSubject(subject);
		notice.setContent(content);
		notice.setNoticeId(IdUtil.getNotice());
		int insertSelective = noticeEntityDao.insertSelective(notice);
		if(insertSelective> 0)
			return Result.buildSuccess();
		return Result.buildFail();
	}
	
	
	/**
	 * <p>根据自己的账号查询自己的notice</p>
	 * @param userId
	 * @return
	 */
	public Result  getNotice(String userId) {
		if(StrUtil.isBlank(userId)) 
			return Result.buildFailMessage("userId is null");
		UserEntity user = userDao.findUserId(userId);
		//首先任何账号都可以看到自己为作者的notice
		List <NoticeEntity> noticeList  = noticeEntityDao.findNoticeByAuthor(userId);
		
		
		/**
		 * #########################
		 * 1,如果是condo账号可以看到所有的数据
		 * 2,如果是tower账号可以看到发布有自己的notice 
		 * 3,如果是unit账号,可以看到有自己权限的 数据
		 */
		List <NoticeEntity> noticeListCondo = new ArrayList<NoticeEntity>();
		List <NoticeEntity> noticeListTower = new ArrayList<NoticeEntity>();
		List <NoticeEntity> noticeListUnit = new ArrayList<NoticeEntity>();
		if(user.getUserRole().toString().equals(Common.Role.CONDO))
			noticeListCondo  =	noticeEntityDao.findNoticeByCondo(user.getUserId());
		Result queryMap = queryMapServiceImpl.findQueryMap(user.getUserId());
		QueryMapEntity map = new QueryMapEntity();
		if(queryMap.isSuccess()) {
			List<QueryMapEntity> result =(List) queryMap.getResult();
			map = result.get(0);
		}
		if(user.getUserRole().toString().equals(Common.Role.RECEPTION))
			noticeListTower = noticeEntityDao.findNoticeByTower(user.getUserId(),map.getCondo(),map.getTower());
		if(user.getUserRole().toString().equals(Common.Role.OWNER) || user.getUserRole().toString().equals(Common.Role.TENANT)) 
			noticeListUnit = noticeEntityDao.findNoticeByUnit(map.getCondo(),map.getTower());
		if(CollUtil.isNotEmpty(noticeListCondo)) {
			return Result.buildSuccessResult(CollUtil.addAll(noticeListCondo, CollUtil.isEmpty(noticeListTower)?noticeListUnit:noticeListTower));
		}else {
			return Result.buildSuccessResult(CollUtil.isEmpty(noticeListTower)?noticeListUnit:noticeListTower);
		}
	}
	
	/**
	 * <p>删除一个notice</p>
	 * @param noticeID			notice系统编号
	 * @param userID			用户编号
	 * @return
	 */
	public Result deleteNotice(String noticeID , String userID) {
		log.info("【进入删除notice方法：删除notice系统唯一编号："+noticeID+"，操作人："+userID+"】");
		//这里要记录日志
		int i = noticeEntityDao.deleteNoticeId(noticeID);
		if(i>0)
			return Result.buildSuccessResult();
		return Result.buildFail();
	}

}
