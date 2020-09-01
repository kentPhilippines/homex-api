package homex.service;

import cn.hutool.core.util.StrUtil;
import homex.bean.MoveInEntity;
import homex.bean.MoveInEntityExample;
import homex.common.bean.Result;
import homex.common.framework.BaseService;
import homex.mapper.MoveInEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoveInService extends BaseService {

    @Autowired
    private MoveInEntityMapper moveInEntityMapper;

    public List<MoveInEntity> findFormList(String tower, String unit, String status, String userID) {
        MoveInEntityExample example = new MoveInEntityExample();
        MoveInEntityExample.Criteria criteria = example.createCriteria();
        if (StrUtil.isNotBlank(tower)) {
            criteria.andTowerEqualTo(tower);
        }
        if (StrUtil.isNotBlank(unit)) {
            criteria.andUnitEqualTo(unit);
        }
        if (StrUtil.isNotBlank(status)) {
            criteria.andStatusEqualTo(status);
        }
        if (StrUtil.isNotBlank(userID)) {
            criteria.andOwnerEqualTo(userID);
        }
        List<MoveInEntity> formList = moveInEntityMapper.selectByExample(example);
        return formList;
    }

    public Result changeMoveInStatus(String formID, String userID, String oldstatus, String newstatus, String reason) {
        if (StrUtil.isBlank(formID))
            return Result.buildFailMessage("formID is null");
        MoveInEntityExample example = new MoveInEntityExample();
        MoveInEntityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(formID);
        criteria.andStatusEqualTo(oldstatus);
        MoveInEntity moveIn = new MoveInEntity();
        if (StrUtil.isNotBlank(newstatus))
            moveIn.setStatus(newstatus);
        if (StrUtil.isNotBlank(reason))
            moveIn.setRemark(reason);
        int result = moveInEntityMapper.updateByExampleSelective(moveIn, example);
        if (result == 0)
            return Result.buildFailMessage("Modification failed");
        return Result.buildSuccessMessage("Finished successfully");
    }

    public Result insertMoveIn(MoveInEntity moveInEntity) {
        int i = moveInEntityMapper.insertSelective(moveInEntity);
        if (i == 0){
            return Result.buildFailMessage("Failed to add maintenance record");
        }
        return Result.buildSuccess();
    }

    public Result deleteMoveInEntity(String formID) {
        int i = moveInEntityMapper.deleteByPrimaryKey(formID);
        if(i == 0){
            return Result.buildFailMessage("Delete Failed");
        }
        return Result.buildSuccess();
    }
}
