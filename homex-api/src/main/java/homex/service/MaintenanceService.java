package homex.service;

import cn.hutool.core.util.StrUtil;
import homex.bean.MaintenanceEntity;
import homex.bean.MaintenanceEntityExample;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.MaintenanceEntityMapper;
import homex.util.GenerateOrderNo;
import homex.util.StaticConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MaintenanceService extends BaseService {

    @Autowired
    MaintenanceEntityMapper maintenanceEntityMapper;

    public List<MaintenanceEntity> findMaintenanceList(String tower, String unit, String status, String userID) {
        MaintenanceEntityExample example = new MaintenanceEntityExample();
        MaintenanceEntityExample.Criteria criteria = example.createCriteria();
        if (StrUtil.isNotBlank(tower)) {
            criteria.andTowerEqualTo(tower);
        }
        if (StrUtil.isNotBlank(unit)) {
            criteria.andUnitEqualTo(unit);
        }
        if (StrUtil.isNotBlank(status) && !"all".equals(status)) {
            criteria.andStatusEqualTo(status);
        }
        if (StrUtil.isNotBlank(userID)) {
            criteria.andOwnerEqualTo(userID);
        }
        List<MaintenanceEntity> list = maintenanceEntityMapper.selectByExample(example);
        return list;
    }

    public Result addMaintenanceEntity(MaintenanceEntity maintenanceEntity) {
        maintenanceEntity.setCreateTime(new Date());
        maintenanceEntity.setId(GenerateOrderNo.getInstance().Generate(StaticConstants.MAINTENANCE_ORDER));
        int i = maintenanceEntityMapper.insertSelective(maintenanceEntity);
        if (i == 0){
            return Result.buildFailMessage("Failed to add maintenance record");
        }
        return Result.buildSuccess();
    }

    public Result deleteMaintenanceEntity(String formID) {
        int i = maintenanceEntityMapper.deleteByPrimaryKey(formID);
        if(i == 0){
            return Result.buildFailMessage("Delete Failed");
        }
        return Result.buildSuccess();
    }

    public Result changeMaintenanceStatus(String formID, String userID, String oldstatus, String newstatus, String reason) {
        if (StrUtil.isBlank(formID)){
            return Result.buildFailMessage("formID is null");
        }
        MaintenanceEntity maintenance = new MaintenanceEntity();
        MaintenanceEntityExample example = new MaintenanceEntityExample();
        MaintenanceEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andStatusEqualTo(oldstatus);
        if (StrUtil.isNotBlank(newstatus)){
            maintenance.setStatus(newstatus);
        }
        if (StrUtil.isNotBlank(reason)){
            maintenance.setRemark(reason);
        }
        int i = maintenanceEntityMapper.updateByExampleSelective(maintenance,example);
        if(i == 0){
            return Result.buildFailMessage("Failed to change status");
        }
        return Result.buildSuccess();
    }
}
