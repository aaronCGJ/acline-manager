package com.acline.web.productuser;

import acline.base.util.model.ResultInfo;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;
import com.acline.core.service.user.ProductUserCoreService;
import com.acline.web.request.UserRequestRO;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */

@RestController
@RequestMapping(value = "productUser")
@Api(tags = "productUser.Search", description = "项目测试用例")
public class ProductUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductUserController.class);

    @Autowired
    private ProductUserCoreService productUserCoreService;

    @GetMapping("/queryList")
    public ResultInfo<List<ProductUserDO>> queryList() {
        LOGGER.info("start:queryList");
        List<ProductUserDO> productUserDOS = productUserCoreService.selectUserList();
        LOGGER.info("queryList:productUserDOS:{}", productUserDOS);
        return new ResultInfo<List<ProductUserDO>>().succeed(productUserDOS);
    }

    @PostMapping("/update")
    public ResultInfo<Boolean> updateUser(@Valid @RequestBody UserRequestRO ro) {
        LOGGER.info("start:updateUser,RO:{}", ro);
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(ro, dto);
        LOGGER.info("start:updateUser,DTO:{}", dto);
        boolean result = productUserCoreService.updateUser(dto);
        LOGGER.info("updateUser:productUserDOS:{}", result);
        return new ResultInfo<Boolean>().succeed(result);
    }
}
