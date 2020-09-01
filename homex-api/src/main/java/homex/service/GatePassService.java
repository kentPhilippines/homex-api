package homex.service;

import cn.hutool.core.util.StrUtil;
import homex.bean.GatePassEntity;
import homex.bean.GatePassEntityExample;
import homex.bean.WorkPermitEntity;
import homex.bean.WorkPermitEntityExample;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.GatePassEntityMapper;
import homex.util.GenerateOrderNo;
import homex.util.StaticConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class GatePassService extends BaseService {

    @Autowired
    GatePassEntityMapper gatePassEntityMapper;

    public List<GatePassEntity> findGatePassList(String tower, String unit, String status, String userID) {
        GatePassEntityExample example = new GatePassEntityExample();
        GatePassEntityExample.Criteria criteria = example.createCriteria();
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
        List<GatePassEntity> list = gatePassEntityMapper.selectByExample(example);
        return list;
    }

    public Result addGatePassEntity(GatePassEntity gatePassEntity) {
        gatePassEntity.setCreateTime(new Date());
        gatePassEntity.setId(GenerateOrderNo.getInstance().Generate(StaticConstants.GATE_PASS_ORDER));
        int i = gatePassEntityMapper.insertSelective(gatePassEntity);
        if (i == 0){
            return Result.buildFailMessage("Failed to add maintenance record");
        }
        return Result.buildSuccess();
    }

    public Result deleteGatePassEntity(String formID) {
        int i = gatePassEntityMapper.deleteByPrimaryKey(formID);
        if(i == 0){
            return Result.buildFailMessage("Delete Failed");
        }
        return Result.buildSuccess();
    }

    public Result changeGatePassStatus(String formID, String userID, String oldstatus, String newstatus, String reason) {
        if (StrUtil.isBlank(formID)){
            return Result.buildFailMessage("formID is null");
        }
        GatePassEntity gatePassEntity = new GatePassEntity();
        GatePassEntityExample example = new GatePassEntityExample();
        GatePassEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andStatusEqualTo(oldstatus);
        if (StrUtil.isNotBlank(newstatus)){
            gatePassEntity.setStatus(newstatus);
        }
        if (StrUtil.isNotBlank(reason)){
            gatePassEntity.setRemark(reason);
        }
        int i = gatePassEntityMapper.updateByExampleSelective(gatePassEntity,example);
        if(i == 0){
            return Result.buildFailMessage("Failed to change status");
        }
        return Result.buildSuccess();
    }
}
