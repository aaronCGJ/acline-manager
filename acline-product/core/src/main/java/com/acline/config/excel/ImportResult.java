package com.acline.config.excel;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ImportResult {
    private boolean success;
    private String message;
    private List<Map<String, Object>> data;

    // 静态工厂方法
    public static ImportResult success(List<Map<String, Object>> data) {
        ImportResult result = new ImportResult();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static ImportResult fail(String message) {
        ImportResult result = new ImportResult();
        result.setSuccess(false);
        result.setMessage(message);
        return result;
    }

}
