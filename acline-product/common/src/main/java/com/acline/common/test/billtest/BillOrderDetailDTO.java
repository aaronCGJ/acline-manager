package com.acline.common.test.billtest;
import com.acline.enums.ComparisonType;

import java.lang.reflect.Field;
import java.util.*;

public class BillOrderDetailDTO {
    private String id;
    private String billDate;
    private int qty;
    private double price;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;

    // 构造函数、getter和setter方法省略
    public BillOrderDetailDTO(String id, String billDate, int qty, double price, String field1, String field2, String field3, String field4, String field5, String field6) {
        this.id = id;
        this.billDate = billDate;
        this.qty = qty;
        this.price = price;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getBillDate() { return billDate; }
    public void setBillDate(String billDate) { this.billDate = billDate; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getField1() { return field1; }
    public void setField1(String field1) { this.field1 = field1; }
    public String getField2() { return field2; }
    public void setField2(String field2) { this.field2 = field2; }
    public String getField3() { return field3; }
    public void setField3(String field3) { this.field3 = field3; }
    public String getField4() { return field4; }
    public void setField4(String field4) { this.field4 = field4; }
    public String getField5() { return field5; }
    public void setField5(String field5) { this.field5 = field5; }
    public String getField6() { return field6; }
    public void setField6(String field6) { this.field6 = field6; }

    @Override
    public String toString() {
        return "BillOrderDetailDTO{" +
                "id='" + id + '\'' +
                ", billDate='" + billDate + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                ", field6='" + field6 + '\'' +
                '}';
    }
}

