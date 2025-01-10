package com.acline.core.service.influx;

/**
 * @author Aaron Chen
 * @date：2024/10/15
 * @Description:TODO
 * @Version 1.0
 */
public interface InfluxCoreService {
     void saveData(String measurement, String tag, String field, Object value);

    String queryData(String query);
}
