package com.acline.common.test.billtest;

import com.acline.enums.ComparisonType;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @author Aaron Chen
 * @date：2025/3/21
 * @Description:TODO
 * @Version 1.0
 */
public class DataComparator {
    public List<ComparisonResult> compareLists(List<BillOrderDetailDTO> billA, List<BillOrderDetailDTO> billB, List<String> fieldsToCompare) throws IllegalAccessException {
        Map<String, BillOrderDetailDTO> mapA = new HashMap<>();
        Map<String, BillOrderDetailDTO> mapB = new HashMap<>();

        // 将billA中的数据存入mapA
        for (BillOrderDetailDTO dto : billA) {
            mapA.put(dto.getId(), dto);
        }

        // 将billB中的数据存入mapB
        for (BillOrderDetailDTO dto : billB) {
            mapB.put(dto.getId(), dto);
        }

        List<ComparisonResult> result = new ArrayList<>();

        // 获取字段
        Field[] fields = BillOrderDetailDTO.class.getDeclaredFields();
        Map<String, Field> fieldMap = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            if (fieldsToCompare.contains(field.getName())) {
                fieldMap.put(field.getName(), field);
            }
        }

        // 比对billA和billB
        for (Map.Entry<String, BillOrderDetailDTO> entry : mapA.entrySet()) {
            String id = entry.getKey();
            BillOrderDetailDTO dtoA = entry.getValue();

            if (mapB.containsKey(id)) {
                BillOrderDetailDTO dtoB = mapB.get(id);
                boolean different = false;
                Map<String, Object> fieldsA = new HashMap<>();
                Map<String, Object> fieldsB = new HashMap<>();

                for (String fieldName : fieldsToCompare) {
                    Field field = fieldMap.get(fieldName);
                    Object valueA = field.get(dtoA);
                    Object valueB = field.get(dtoB);

                    fieldsA.put(fieldName, valueA);
                    fieldsB.put(fieldName, valueB);

                    if (!Objects.equals(valueA, valueB)) {
                        different = true;
                    }
                }

                if (different) {
                    // 记录不同
                    result.add(new ComparisonResult(id, fieldsA, fieldsB, ComparisonType.DIFFERENT));
                }
            } else {
                // 记录新增
                Map<String, Object> fieldsA = new HashMap<>();
                for (String fieldName : fieldsToCompare) {
                    Field field = fieldMap.get(fieldName);
                    fieldsA.put(fieldName, field.get(dtoA));
                }
                result.add(new ComparisonResult(id, fieldsA, Collections.emptyMap(), ComparisonType.NEW));
            }
        }

        // 检查billB中是否存在billA中没有的记录
        for (Map.Entry<String, BillOrderDetailDTO> entry : mapB.entrySet()) {
            String id = entry.getKey();
            if (!mapA.containsKey(id)) {
                // 记录丢失
                BillOrderDetailDTO dtoB = entry.getValue();
                Map<String, Object> fieldsB = new HashMap<>();
                for (String fieldName : fieldsToCompare) {
                    Field field = fieldMap.get(fieldName);
                    fieldsB.put(fieldName, field.get(dtoB));
                }
                result.add(new ComparisonResult(id, Collections.emptyMap(), fieldsB, ComparisonType.LOST));
            }
        }

        return result;
    }

}
