package homex.service;

import cn.hutool.core.util.StrUtil;
import homex.bean.MaintenanceEntity;
import homex.bean.MaintenanceEntityExample;
import homex.bean.WorkPermitEntity;
import homex.bean.WorkPermitEntityExample;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.WorkPermitEntityMapper;
import homex.util.GenerateOrderNo;
import homex.util.StaticConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class WorkPermitService extends BaseService {

    @Autowired
    WorkPermitEntityMapper workPermitEntityMapper;

    public List<WorkPermitEntity> findWorkPermitList(String tower, String unit, String status, String userID) {
        WorkPermitEntityExample example = new WorkPermitEntityExample();
        WorkPermitEntityExample.Criteria criteria = example.createCriteria();
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
        List<WorkPermitEntity> list = workPermitEntityMapper.selectByExample(example);
        return list;
    }

    public Result addWorkPermitEntity(WorkPermitEntity workPermitEntity) {
        workPermitEntity.setCreateTime(new Date());
        workPermitEntity.setId(GenerateOrderNo.getInstance().Generate(StaticConstants.WORK_PERMIT_ORDER));
        int i = workPermitEntityMapper.insertSelective(workPermitEntity);
        if (i == 0){
            return Result.buildFailMessage("Failed to add maintenance record");
        }
        return Result.buildSuccess();
    }

    public Result deleteWorkPermitEntity(String formID) {
        int i = workPermitEntityMapper.deleteByPrimaryKey(formID);
        if(i == 0){
            return Result.buildFailMessage("Delete Failed");
        }
        return Result.buildSuccess();
    }

    public Result changeWorkPermitStatus(String formID, String userID, String oldstatus, String newstatus, String reason) {
        if (StrUtil.isBlank(formID)){
            return Result.buildFailMessage("formID is null");
        }
        WorkPermitEntity workPermitEntity = new WorkPermitEntity();
        WorkPermitEntityExample example = new WorkPermitEntityExample();
        WorkPermitEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andStatusEqualTo(oldstatus);
        if (StrUtil.isNotBlank(newstatus)){
            workPermitEntity.setStatus(newstatus);
        }
        if (StrUtil.isNotBlank(reason)){
            workPermitEntity.setRemark(reason);
        }
        int i = workPermitEntityMapper.updateByExampleSelective(workPermitEntity,example);
        if(i == 0){
            return Result.buildFailMessage("Failed to change status");
        }
        return Result.buildSuccess();
    }
}
