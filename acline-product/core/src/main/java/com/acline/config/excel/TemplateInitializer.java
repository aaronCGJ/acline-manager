package com.acline.config.excel;

import cn.hutool.core.lang.Assert;
import com.acline.common.dal.dataobject.ResourceDicDO;
import com.acline.common.utils.ResourceDicUtil;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.acline.common.constants.CommonConstant.invoiceExcelTempParentCode;

/**
 * @author Aaron Chen
 * @date：2025/4/23
 * @Description:TODO
 * @Version 1.0
 */
//@Component
public class TemplateInitializer {
//    @Autowired
    ResourceDicUtil dicUtils;
    Logger logger = LoggerFactory.getLogger(TemplateInitializer.class);
    private static final Map<String, TemplateStructure> templateStructuresMap = new HashMap<>();
    private static final List<String> invoiceTempIds = new ArrayList<>();

    public static List<String> getTemplateStructureList() {
        return invoiceTempIds;
    }

    @PostConstruct
    public void initTemplates() {
        List<ResourceDicDO> byParentCodeAndCode = dicUtils.getByParentCodeAndCode(invoiceExcelTempParentCode, "");
        byParentCodeAndCode.forEach(resourceDicDO -> {
            try {
                TemplateStructure templateStructure = JSONObject.parseObject(resourceDicDO.getDescription(), TemplateStructure.class);
                registerTemplate(resourceDicDO.getCode(), templateStructure);
            } catch (JSONException ex) {
                logger.info("Temp json convert error {}", ex.getMessage());
            }

        });


    }

    /**
     * 注册模板结构
     *
     * @param templateId 模板ID
     * @param structure  模板结构
     */
    public void registerTemplate(String templateId, TemplateStructure structure) {
        templateStructuresMap.put(templateId, structure);
        invoiceTempIds.add(templateId);
    }

    public static TemplateStructure getTemplateStructure(String templateId) {
        Assert.notBlank(templateId, "templateId can't be null");
        return templateStructuresMap.get(templateId);
    }
    public static List<TemplateStructure> getTemplateStructure() {
        List<TemplateStructure> templateStructures = new ArrayList<>();
        invoiceTempIds.forEach(templateId -> {
            TemplateStructure templateStructure = templateStructuresMap.get(templateId);
            templateStructures.add(templateStructure);
        });
        return templateStructures;
    }
}
