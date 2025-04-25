package com.acline.config.excel;

import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/4/23
 * @Description:模版结构定义
 * @Version 1.0
 */
@Data
public class TemplateStructure {
    private String tempId;
    private int headerRowIndex=0;  // 标题行索引
    private int dataStartRowIndex=1; // 数据开始行索引
    private List<TemplateColumn> tempColumns;
}
