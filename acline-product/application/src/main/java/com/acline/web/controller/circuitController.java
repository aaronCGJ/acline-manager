package com.acline.web.controller;

import cn.hutool.core.util.StrUtil;
import com.acline.core.service.device.CircuitCoreService;
import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.web.circuit.response.CrossConnectQueryRequest;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.github.pagehelper.PageInfo;
import com.zenlayer.wukong.common.utils.model.ResultInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.stream.Collectors;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "circuit")
public class circuitController {
    private static final Logger LOGGER = LoggerFactory.getLogger(circuitController.class);

    @Autowired
    CircuitCoreService circuitCoreService;

    @GetMapping("/page")
    @ApiOperation(value = "列表", notes = "获取跳线列表")
    public ResultInfo<PageInfo<CrossConnectPageDTO>> pageCrossConnect(@Valid CrossConnectQueryRequest queryRequest) {
        LOGGER.info("pageCrossConnect method start, params: {}", queryRequest);
        CrossConnectQueryDTO queryDTO = new CrossConnectQueryDTO();
         BeanUtils.copyProperties(queryRequest,queryDTO );
        if (StrUtil.isNotBlank(queryRequest.getStatus())) {
            queryDTO.setStatus(StrUtil.split(queryRequest.getStatus(), ',').stream().map(Integer::parseInt).collect(Collectors.toList()));
        }
        PageInfo<CrossConnectPageDTO> page = circuitCoreService.queryListPage(queryDTO);
        LOGGER.info("pageCrossConnect method end, result: {}", page);
        return new ResultInfo<PageInfo<CrossConnectPageDTO>>().succeed(page);
    }


}
