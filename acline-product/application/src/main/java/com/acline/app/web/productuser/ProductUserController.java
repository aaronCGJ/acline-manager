package com.acline.app.web.productuser;

import acline.base.util.model.ResultInfo;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.core.core.service.user.ProductUserCoreService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        List<ProductUserDO> productUserDOS = productUserCoreService.selectUserList();
        LOGGER.info("/queryList,productUserDOS:{}", productUserDOS);
        return new ResultInfo<List<ProductUserDO>>().succeed(productUserDOS);
    }
}
