package homex.api;

import homex.bean.MoveOutEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.MoveOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/moveOut")
public class MoveOutApi extends BaseController {

    @Autowired
    MoveOutService moveOutServiceImpl;

    /**
     * 查询move-out 订单列表
     * @param tower
     * @param unit
     * @param status
     * @param userID
     * @param isHisTory
     * @return
     */
    @GetMapping("/getMoveOutList")
    public TableDataInfo getCondoList(String tower, String unit, String status, String userID, Boolean isHisTory) {
        startPage();
        List<MoveOutEntity> moveOutList = moveOutServiceImpl.findMoveOutList(tower, unit, status, userID);
        return getDataTable(moveOutList);
    }

    /**
     * ADD MOVE-OUT RECORD
     * @param moveOutEntity
     * @return
     */
    @PostMapping("/addMoveOut")
    public Result addMoveOut(MoveOutEntity moveOutEntity){
        Result result = moveOutServiceImpl.addEntity(moveOutEntity);
        return result;
    }

    /**
     * delete MOVE-OUT RECORD
     * @param formID
     * @return
     */
    @PostMapping("/deleteMoveOut")
    public Result deleteMoveOut(String formID){
        Result result = moveOutServiceImpl.deleteMoveOutEntity(formID);
        return result;
    }

    /**
     * modify move-out status by wuye
     * @param formID
     * @param userID
     * @param oldstatus
     * @param newstatus
     * @param reason
     * @return
     */
    @PostMapping("/changeMoveOutStatus")
    public Result changeMoveOutStatus(String formID, String userID, String oldstatus, String newstatus, String reason){
        log.info("【login into moveOut status method】");
        Result result = moveOutServiceImpl.changeMoveOutStatus(formID,userID,oldstatus,newstatus,reason);
        return result;
    }

    /**
     * confirm move-out status by reception
     * @param formID
     * @param userID
     * @param oldstatus
     * @param newstatus
     * @return
     */
    @PostMapping("confirmMoveOutStatus")
    public Result confirmMoveOutStatus(String formID, String userID, String oldstatus, String newstatus){
        Result result = moveOutServiceImpl.confirmMoveOutStatus(formID,userID,oldstatus,newstatus);
        return result;
    }
}
