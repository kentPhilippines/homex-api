package homex.api;

import homex.bean.WorkPermitEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.WorkPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkPermitApi extends BaseController {

    @Autowired
    WorkPermitService workPermitServiceImpl;

    /**
     * get maintenance list
     * @param tower
     * @param unit
     * @param status
     * @param userID
     * @param isHisTory
     * @return
     */
    @PostMapping("/getWorkPermitList")
    public TableDataInfo getWorkPermitList(String tower, String unit, String status, String userID, Boolean isHisTory){
        startPage();
        List<WorkPermitEntity> list = workPermitServiceImpl.findWorkPermitList(tower, unit, status, userID);
        return getDataTable(list);
    }

    /**
     * ADD MAINTENANCE RECORD
     * @param workPermitEntity
     * @return
     */
    @PostMapping("/addWorkPermit")
    public Result addMoveOut(WorkPermitEntity workPermitEntity){
        Result result = workPermitServiceImpl.addWorkPermitEntity(workPermitEntity);
        return result;
    }

    /**
     * delete MOVE-OUT RECORD
     * @param formID
     * @return
     */
    @PostMapping("/deleteWorkPermit")
    public Result deleteWorkPermit(String formID){
        Result result = workPermitServiceImpl.deleteWorkPermitEntity(formID);
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
    @PostMapping("/changeWorkPermitStatus")
    public Result changeWorkPermitStatus(String formID, String userID, String oldstatus, String newstatus, String reason){
        log.info("【login into moveOut status method】");
        Result result = workPermitServiceImpl.changeWorkPermitStatus(formID,userID,oldstatus,newstatus,reason);
        return result;
    }
}
