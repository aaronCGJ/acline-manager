package com.acline.common.test.billtest;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.acline.enums.ComparisonType;

import java.util.Date;
import java.util.Map;

/**
 * @author Aaron Chen
 * @date：2025/3/21
 * @Description:TODO
 * @Version 1.0
 */
public class ComparisonResult {
    private String id;
    private Map<String, Object> fieldsA;
    private Map<String, Object> fieldsB;
    private ComparisonType type;

    public ComparisonResult(String id, Map<String, Object> fieldsA, Map<String, Object> fieldsB, ComparisonType type) {
        this.id = id;
        this.fieldsA = fieldsA;
        this.fieldsB = fieldsB;
        this.type = type;
    }

    // getter方法
    public String getId() { return id; }
    public Map<String, Object> getFieldsA() { return fieldsA; }
    public Map<String, Object> getFieldsB() { return fieldsB; }
    public ComparisonType getType() { return type; }

    @Override
    public String toString() {
        return "ComparisonResult{" +
                "id='" + id + '\'' +
                ", fieldsA=" + fieldsA +
                ", fieldsB=" + fieldsB +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {

            String strName="ApTest";
            if(strName.startsWith("-")){
                strName = strName.substring(1);
            }
            System.out.println(strName);
    }
}
