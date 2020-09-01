package homex.api;

import homex.bean.GatePassEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.GatePassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gate")
public class GatePassApi extends BaseController {

    @Autowired
    GatePassService gatePassServiceImpl;

    /**
     * get maintenance list
     * @param tower
     * @param unit
     * @param status
     * @param userID
     * @param isHisTory
     * @return
     */
    @PostMapping("/getGatePassList")
    public TableDataInfo getGatePassList(String tower, String unit, String status, String userID, Boolean isHisTory){
        startPage();
        List<GatePassEntity> list = gatePassServiceImpl.findGatePassList(tower, unit, status, userID);
        return getDataTable(list);
    }

    /**
     * ADD MAINTENANCE RECORD
     * @param gatePassEntity
     * @return
     */
    @PostMapping("/addGatePass")
    public Result addMoveOut(GatePassEntity gatePassEntity){
        Result result = gatePassServiceImpl.addGatePassEntity(gatePassEntity);
        return result;
    }

    /**
     * delete MOVE-OUT RECORD
     * @param formID
     * @return
     */
    @PostMapping("/deleteGatePass")
    public Result deleteGatePass(String formID){
        Result result = gatePassServiceImpl.deleteGatePassEntity(formID);
        return result;
    }

    /**
     * modify maintenance status by wuye
     * @param formID
     * @param userID
     * @param oldstatus
     * @param newstatus
     * @param reason
     * @return
     */
    @PostMapping("/changeGatePassStatus")
    public Result changeGatePassStatus(String formID, String userID, String oldstatus, String newstatus, String reason){
        log.info("【login into moveOut status method】");
        Result result = gatePassServiceImpl.changeGatePassStatus(formID,userID,oldstatus,newstatus,reason);
        return result;
    }
}
