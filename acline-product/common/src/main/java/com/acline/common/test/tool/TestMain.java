package com.acline.common.test.tool;

import com.acline.common.dto.DevicePageDTO;
import com.acline.common.dto.IpPageDTO;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aaron Chen
 * @date：2023/3/14 14:21
 * @Description:TODO
 */

public class TestMain {
    @Test
    public void test1() {
        IpPageDTO dto = new IpPageDTO();
        dto.setId(1);
        dto.setName("switch");
        dto.setPassword("caiji777");
        dto.setUserName("层峰扛把子");
        System.out.println("序列化之前的toString:");
        System.out.println(dto.toString());
        DevicePageDTO test = new DevicePageDTO();
        test.setDto(dto);
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("/Users/aaron.chen/Desktop/IpPageDTO.doc"));

            //写流
            stream.writeUTF("UTF-8");
            stream.writeObject(test.toString());
            stream.flush();
            stream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/aaron.chen/Desktop/IpPageDTO.doc"));
            inputStream.readUTF();
            String o = (String) inputStream.readObject();

            inputStream.close();
            System.out.println("序列化之后的toString:");
            System.out.println(o);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    @Test
    public void test2() {

        //比对 订单明细行与资源明细行是否匹配
        List<Integer> quoteDetailIds = Arrays.asList(1,2,3,4,5,6,7,9,10);
        List<Integer> resourceQuoteDetailIds =  Arrays.asList(1,2,3,4,5,6,7,9);
        if (!quoteDetailIds.containsAll(resourceQuoteDetailIds)||(resourceQuoteDetailIds.size()!=quoteDetailIds.size())) {
            System.out.println("订单明细行与资源明细行不匹配");
        }


    }
}
