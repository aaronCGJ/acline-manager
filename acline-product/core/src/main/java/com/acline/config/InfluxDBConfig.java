package com.acline.config;

//import com.influxdb.client.InfluxDBClient;
//import com.influxdb.client.InfluxDBClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfluxDBConfig {


    @Value("${influxdb.url}")
    private String influxDbUrl;

    @Value("${influxdb.username}")
    private String username;

    @Value("${influxdb.password}")
    private String password;

    @Value("${influxdb.database}")
    private String databaseName;
    @Value("${influxdb.token}")
    private String token;

//    @Bean
//    public InfluxDB influxDB() {
//
//        return InfluxDBFactory.connect(influxDbUrl, username, password);
//    }


 /*   @Bean
    public void createDatabase() {

        InfluxDB influxDB = influxDB();
        influxDB.query(new Query("CREATE DATABASE " + databaseName));
        influxDB.setDatabase(databaseName);
    }*/
//    @Bean
//    public InfluxDBClient createClient(){
//
//      return InfluxDBClientFactory.create(influxDbUrl, token.toCharArray());
//
//    }
}
