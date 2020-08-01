package homex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import homex.bean.QueryMapEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.QueryMapEntityMapper;

/**
 * <p>关于查询地图生成查询的操作业务</p>
 * @author kent
 */
@Component
public class QueryMapService extends BaseService{
	@Autowired QueryMapEntityMapper queryMapEntityDao;
	/**
	 * #############################################
	 * 关于不同角色调用查询地图的说明
	 * 1,condo调用时候,condo不同的查询类型均只有一条数据，在不同表中查询可以通过数据粒度最大的维度查询得到最多的数据,通过本身的数据ID调用查询地图
	 * 2,tower调用时,当前存入调用主键为tower,存入自己有关的数据维度，通过查询出来的数据维度可在数据存储表内查询到自己这个数据维度的数据
	 * 3,owner【房东】,可查询与自己有关的所有房子，当房子数据初始化的时候需要丰富查询地图的键
	 * 4,tenant【租客】,查询逻辑与房东查询逻辑一致
	 * #############################################
	 */
	Result addMapByCondo(String userId,String condoId){
		return addMap(userId,condoId,null,null);
	}
	Result addMapByTower(String userId,String condoId,String towerId){
		return addMap(userId,condoId,towerId,null);
	}
	private Result addMap(String userId ,String condoId,String towerId, String unit){
		QueryMapEntity queryMap = new QueryMapEntity();
		queryMap.setCondo(condoId);
		queryMap.setUserId(userId);
		if(StrUtil.isNotBlank(towerId))
			queryMap.setTower(towerId);
		if(StrUtil.isNotBlank(unit))
			queryMap.setUnit(unit);
		int insertSelective = queryMapEntityDao.insertSelective(queryMap);
		if(insertSelective > 0)
			return Result.buildSuccessMessage("is success");		
		return Result.buildFail();
	}
	/**
	 * <p>获取关于自己的查询地图</p>
	 * @param userId				自己的系统唯一编号
	 * @return
	 */
	Result findQueryMap (String userId) {
		List<QueryMapEntity> mapList = queryMapEntityDao.findMap( userId);
		if(CollUtil.isNotEmpty(mapList))
			return Result.buildSuccessResult(mapList);
		return Result.buildFail();
	}
	
	

}
