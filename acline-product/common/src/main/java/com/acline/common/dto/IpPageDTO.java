package com.acline.common.dto;/**
 * @author Aaron Chen
 * @date：2022/11/17 17:10
 * @Description:TODO
 * @Version 1.0
 */

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:10
 * @Description:TODO
 */
@Data
public class IpPageDTO implements Serializable {
    private static final long serialVersionUID = 878789722221214294L;

    private Integer id;
    private String name;
    private BigDecimal price;

    private transient String password;
    private transient String userName;

    @Override
    public String toString() {
        return "IpPageDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
