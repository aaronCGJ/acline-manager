package com.acline.common.test.billtest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Aaron Chen
 * @date：2025/3/21
 * @Description:TODO
 * @Version 1.0
 */
public class BillComparator {


        public List<BillOrderDetailDTO> compareBills(List<BillOrderDetailDTO> billA, List<BillOrderDetailDTO> billB) {
            // 使用并行流创建 mapA 和 mapB
            Map<String, BillOrderDetailDTO> mapA = billA.parallelStream().collect(Collectors.toMap(
                    this::createKey,
                    bill -> bill,
                    (existing, replacement) -> existing
            ));

            Map<String, BillOrderDetailDTO> mapB = billB.parallelStream().collect(Collectors.toMap(
                    this::createKey,
                    bill -> bill,
                    (existing, replacement) -> existing
            ));

            // 比对数据
            List<BillOrderDetailDTO> differences = billA.parallelStream()
                    .filter(billAObj -> {
                        String key = createKey(billAObj);
                        BillOrderDetailDTO billBObj = mapB.get(key);
                        return billBObj == null || !billAObj.equals(billBObj);
                    })
                    .collect(Collectors.toList());

            differences.addAll(billB.parallelStream()
                    .filter(billBObj -> !mapA.containsKey(createKey(billBObj)))
                    .collect(Collectors.toList()));

            return differences;
        }

        private String createKey(BillOrderDetailDTO bill) {
            return bill.getField1() + ":" + bill.getField2() + ":" + bill.getField3() + ":" + bill.getField4() + ":" + bill.getField5() + ":" + bill.getField6();
        }

}
