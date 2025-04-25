package com.acline.config.excel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/4/23
 * @Description:TODO
 * @Version 1.0
 */
@Getter
@Setter
public class TemplateColumn {
    /**
     * 列索引
     */
    private int columnIndex;
    /**
     * 列标题
     */
    private String headerName;
    /**
     * 对应字段名
     */
    private String fieldName;

    private String   ossFieldName;
    /**
     * 数据类型
     */
    private Class<?> dataType;

    public TemplateColumn(int columnIndex, String headerName, String fieldName,String ossFieldName,String dataType) {
        this.columnIndex = columnIndex;
        this.headerName = headerName;
        this.fieldName = fieldName;
        this.ossFieldName = ossFieldName;

        switch (dataType.toLowerCase()) {
            case "string":
                this.dataType= String.class;
                break;
            case "integer":
                this.dataType= Integer.class;
                break;
            case "double":
                this.dataType= Double.class;
                break;
            case "date":
                this.dataType= Date.class;
                break;
            case "boolean":
                this.dataType= Boolean.class;
                break;
            default:
                this.dataType= String.class; // 默认返回 String 类型
        }
    }
    }

