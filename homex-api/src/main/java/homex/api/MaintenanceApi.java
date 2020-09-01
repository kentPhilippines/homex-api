package homex.api;

import homex.bean.MaintenanceEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/maint")
public class MaintenanceApi extends BaseController {

    @Autowired
    MaintenanceService maintenanceServiceImpl;

    /**
     * get maintenance list
     * @param tower
     * @param unit
     * @param status
     * @param userID
     * @param isHisTory
     * @return
     */
    @PostMapping("/getMaintenanceList")
    public TableDataInfo getMaintenanceList(String tower, String unit, String status, String userID, Boolean isHisTory){
        startPage();
        List<MaintenanceEntity> maintenanceList = maintenanceServiceImpl.findMaintenanceList(tower, unit, status, userID);
        return getDataTable(maintenanceList);
    }

    /**
     * ADD MAINTENANCE RECORD
     * @param maintenanceEntity
     * @return
     */
    @PostMapping("/addMoveOut")
    public Result addMoveOut(MaintenanceEntity maintenanceEntity){
        Result result = maintenanceServiceImpl.addMaintenanceEntity(maintenanceEntity);
        return result;
    }

    /**
     * delete MOVE-OUT RECORD
     * @param formID
     * @return
     */
    @PostMapping("/deleteMaintenance")
    public Result deleteMaintenance(String formID){
        Result result = maintenanceServiceImpl.deleteMaintenanceEntity(formID);
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
    @PostMapping("/changeMaintenanceStatus")
    public Result changeMaintenanceStatus(String formID, String userID, String oldstatus, String newstatus, String reason){
        log.info("【login into moveOut status method】");
        Result result = maintenanceServiceImpl.changeMaintenanceStatus(formID,userID,oldstatus,newstatus,reason);
        return result;
    }
}
