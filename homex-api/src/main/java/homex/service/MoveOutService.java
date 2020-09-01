package homex.service;

import cn.hutool.core.util.StrUtil;
import homex.bean.MoveOutEntity;
import homex.bean.MoveOutEntityExample;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.MoveOutEntityMapper;
import homex.util.GenerateOrderNo;
import homex.util.StaticConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MoveOutService extends BaseService {

    @Autowired
    MoveOutEntityMapper moveOutEntityMapper;

    public List<MoveOutEntity> findMoveOutList(String tower, String unit, String status, String userID) {
        MoveOutEntityExample example = new MoveOutEntityExample();
        MoveOutEntityExample.Criteria criteria = example.createCriteria();
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
        List<MoveOutEntity> list = moveOutEntityMapper.selectByExample(example);
        return list;
    }

    public Result addEntity(MoveOutEntity moveOutEntity) {
        moveOutEntity.setCreateTime(new Date());
        moveOutEntity.setId(GenerateOrderNo.getInstance().Generate(StaticConstants.MOVE_OUT_ORDER));
        int i = moveOutEntityMapper.insertSelective(moveOutEntity);
        if (i == 0){
            return Result.buildFailMessage("Failed to add");
        }
        return Result.buildSuccess();
    }

    public Result deleteMoveOutEntity(String formID) {
        int i = moveOutEntityMapper.deleteByPrimaryKey(formID);
        if(i == 0){
            return Result.buildFailMessage("Delete Failed");
        }
        return Result.buildSuccess();
    }

    public Result changeMoveOutStatus(String formID, String userID, String oldstatus, String newstatus, String reason) {
        if (StrUtil.isBlank(formID)){
            return Result.buildFailMessage("formID is null");
        }
        MoveOutEntity moveOutEntity = new MoveOutEntity();
        MoveOutEntityExample example = new MoveOutEntityExample();
        MoveOutEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andStatusEqualTo(oldstatus);
        if (StrUtil.isNotBlank(newstatus)){
            moveOutEntity.setStatus(newstatus);
        }
        if (StrUtil.isNotBlank(reason)){
            moveOutEntity.setReason(reason);
        }
        int i = moveOutEntityMapper.updateByExampleSelective(moveOutEntity,example);
        if(i == 0){
            return Result.buildFailMessage("Failed to change status");
        }
        return Result.buildSuccess();
    }

    public Result confirmMoveOutStatus(String formID, String userID, String oldstatus, String newstatus) {
        if (StrUtil.isBlank(formID)){
            return Result.buildFailMessage("formID is null");
        }
        MoveOutEntity moveOutEntity = new MoveOutEntity();
        MoveOutEntityExample example = new MoveOutEntityExample();
        MoveOutEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andConfirmStatusEqualTo(oldstatus);
        if (StrUtil.isNotBlank(newstatus)){
            moveOutEntity.setConfirmStatus(newstatus);
        }
        int i = moveOutEntityMapper.updateByExampleSelective(moveOutEntity,example);
        if(i == 0){
            return Result.buildFailMessage("Failed to change status");
        }
        return Result.buildSuccess();
    }
}
