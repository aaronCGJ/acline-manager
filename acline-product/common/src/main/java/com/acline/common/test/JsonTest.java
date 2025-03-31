package com.acline.common.test;
import com.acline.common.dto.CrossConnectPageDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
public class JsonTest {
    public static void testFieldNameParsing() throws Exception {
        CrossConnectPageDTO dto = new CrossConnectPageDTO();
        dto.setADeviceName("aDeviceName");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dto);

        // 检查字段名是否正确
        assertTrue(json.contains("\"aDeviceName\":\"aDeviceName\""));
    }

    public static void main(String[] args) throws Exception {
        testFieldNameParsing();
    }
}
