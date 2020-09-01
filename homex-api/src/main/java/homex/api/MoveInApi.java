package homex.api;

import homex.bean.MoveInEntity;
import homex.common.bean.Result;
import homex.common.framework.BaseController;
import homex.common.page.TableDataInfo;
import homex.service.MoveInService;
import homex.util.GenerateOrderNo;
import homex.util.ImageBase64Utils;
import homex.util.StaticConstants;
import homex.util.vo.TenantInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/form")
public class MoveInApi extends BaseController {

    @Autowired
    MoveInService moveInServiceImpl;

    @GetMapping("/getMoveInList")
    public TableDataInfo getCondoList(String tower, String unit, String status, String userID, Boolean isHisTory) {
        startPage();
        List<MoveInEntity> findMoveInList = moveInServiceImpl.findFormList(tower, unit, status, userID);
        return getDataTable(findMoveInList);
    }

    /**
     * <p>修改MOVEIN的某条记录状态</p>
     *
     * @param formID 修改主键
     *                newstatus
     * @return
     */
    @PostMapping("/changeMoveInStatus")
    Result updateFormStatus(String userID, String oldstatus, String newstatus, String formID, String reason) {
        log.info("【进入修改moveIn状态】");
        Result result = moveInServiceImpl.changeMoveInStatus(formID,userID,oldstatus,newstatus,reason);
        return result;
    }

    /**
     * <p>新增MoveIn</p>
     *
     * @return RESULT
     */
    @PostMapping("/addMoveIn")
    Result add(String userID, String tower, String unit, String condo, TenantInfoVO tenantInfoVO, List<String> nameList, List<String> pictureList) {
        log.info("【进入新增moveIn的方法】");
        MoveInEntity moveInEntity = new MoveInEntity();
        moveInEntity.setId(GenerateOrderNo.getInstance().Generate(StaticConstants.MOVE_IN_ORDER));
        moveInEntity.setUserId(userID);
        moveInEntity.setTower(tower);
        moveInEntity.setCondo(condo);
        moveInEntity.setUnit(unit);
        moveInEntity.setName(String.join(",",nameList));
        moveInEntity.setPhone(tenantInfoVO.getPhone());
        moveInEntity.setBroker(tenantInfoVO.getBroker());
        moveInEntity.setBrokerPhone(tenantInfoVO.getBrokerphone());
        moveInEntity.setEmail(tenantInfoVO.getEmail());
        moveInEntity.setMoveIn(tenantInfoVO.getMovein());
        moveInEntity.setMoveOut(tenantInfoVO.getMoveout());
        moveInEntity.setCreateTime(new Date());
        moveInEntity.setStatus("pending");
        List list = new ArrayList<String>();
        for (String str:pictureList) {
            try{
                String path = StaticConstants.PHOTO_FILE_PATH + UUID.randomUUID().toString().replace("-","");
                ImageBase64Utils.base64ToImageFile(str, path);
                list.add(path);
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        moveInEntity.setPhotoList(String.join(",", list));
        Result result = moveInServiceImpl.insertMoveIn(moveInEntity);
        return result;
    }

    /**
     * <p>delete MoveIn</p>
     *
     * @return RESULT
     */
    @PostMapping("/deleteMoveIn")
    public Result deleteMoveIn(String userID, String formID){
        Result result = moveInServiceImpl.deleteMoveInEntity(formID);
        return result;
    }


}
