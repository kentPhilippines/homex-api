package homex.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hutool.core.util.StrUtil;
import homex.common.bean.Common;
import homex.common.bean.Result;
import homex.config.exception.OtherErrors;
import homex.mapper.CodeEntityMapper;
@Component
public class CondoService {
	@Autowired CodeEntityMapper codeEntityDao;
	@Autowired LoginService loginServiceImpl;
	
	/**
	 * <p>添加公寓</p>
	 * @param email					邮箱
	 * @param password				密码
	 * @param condoName				昵称
	 * @param phone					电话号码
	 * @param tower					TOWER【栋】【不同的公寓有不同的tower别称】
	 * @return
	 */
	public Result addCondo(String email, String password, String condoName, String phone, String tower) {
		if(StrUtil.isBlank(tower))
			return Result.buildFailMessage("tower数据为空");
		/**
		 * #################################################
		 * 1,生成公寓账号数据
		 * 2,生成公寓标签数据
		 * 3,生成该公寓tower数据
		 * 4,生成公寓查询地图数据
		 * #################################################
		 */
		//1,生成公寓账号数据
		Result resiger = loginServiceImpl.resiger(condoName, phone, email, password, Common.Role.CONDO);
		if(!resiger.isSuccess())
			throw new OtherErrors("生成账户数据错误");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	Result addCondo(String condoName){
		
		
		return Result.buildFail();
	}
}
