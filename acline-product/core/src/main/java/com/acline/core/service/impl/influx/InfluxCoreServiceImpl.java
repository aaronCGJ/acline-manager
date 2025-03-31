package com.acline.core.service.impl.influx;

import com.acline.config.InfluxDBConfig;
import com.acline.core.service.influx.InfluxCoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

/**
 * @author Aaron Chen
 * @date：2024/10/15
 * @Description:TODO
 * @Version 1.0
 */
@Service
public class InfluxCoreServiceImpl
//        implements InfluxCoreService
{

    @Autowired
    InfluxDBConfig influxDBConfig;

//    public  InfluxDBClient getInfluxDBclient(){
//      return InfluxDBClientFactory.create("http://localhost:8086", "4u_6v0749FxRS_vSa9XKrYAR8QxTKzSvgVdDuDZTHUfF_JzzJzhP_yvnf2Dv0_lXY5Ff-b7iFI8dDZnI0nTlhg==".toCharArray());
//
//    }
//
//    @Override
//    public void saveData(String measurement, String tag, String field, Object value) {
////        InfluxDBClient influxDBClient = influxDBConfig.createClient();
//        Point point = Point.measurement(measurement)
//                .addTag("tag", tag)
//                .addField(field,(String) value)
//                .time(Instant.now(), WritePrecision.NS);
//        WriteApi writeApi = getInfluxDBclient().getWriteApi();
//        writeApi.writePoint("product_influx", "influxdb",point);
//    }
//
//    @Override
//    public String queryData(String query) {
//        List<FluxTable> productInflux = getInfluxDBclient().getQueryApi().query(query, "influxdb");
//        List<FluxRecord> records = productInflux.get(0).getRecords();
//        System.out.println(  records.get(0).getValues());
//
//        return records.get(0).getValues().toString();
//
//    }
}
