package com.acline.common.test;

import com.acline.common.test.billtest.BillComparator;
import com.acline.common.test.billtest.BillOrderDetailDTO;
import com.acline.common.test.billtest.ComparisonResult;
import com.acline.common.test.billtest.DataComparator;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/3/14 14:21
 * @Description:TODO
 */

public class TestMain {
        public static void main(String[] args) throws IllegalAccessException {
            List<String> fieldsToCompare = Arrays.asList("billDate", "qty", "price", "field1", "field2");

            List<BillOrderDetailDTO> billA = Arrays.asList(
                    new BillOrderDetailDTO("1", "2023-01-01", 10, 100.0, "A1", "A2", "A3", "A4", "A5", "A6"),
                    new BillOrderDetailDTO("2", "2023-01-02", 20, 200.0, "B1", "B2", "B3", "B4", "B5", "B6"),
                    new BillOrderDetailDTO("4", "2023-01-04", 30, 300.0, "C1", "C2", "C3", "C4", "C5", "C6") // 新增
            );

            List<BillOrderDetailDTO> billB = Arrays.asList(
                    new BillOrderDetailDTO("1", "2023-01-03", 15, 150.0, "A1", "A2", "A3", "A4", "A5", "A6"), // 不同
                    new BillOrderDetailDTO("2", "2023-01-02", 25, 250.0, "B1", "B2", "B3", "B4", "B5", "B6"),
                    new BillOrderDetailDTO("3", "2023-01-05", 35, 350.0, "D1", "D2", "D3", "D4", "D5", "D6") // 丢失
            );

            DataComparator comparator = new DataComparator();
            BillComparator comparator2 = new BillComparator();
//            List<ComparisonResult> results = comparator.compareLists(billA, billB, fieldsToCompare);
            List<BillOrderDetailDTO> compareBills = comparator2.compareBills(billA, billB);

//            for (ComparisonResult result : results) {
//                System.out.println(result);
//            }
            for (BillOrderDetailDTO result : compareBills) {
                System.out.println(result);
            }
        }

}
