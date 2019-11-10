package com.cf.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName OrderVO
 * @Description  order relation  view info
 * @Author Caofei
 * @Date {2019/11/9} 14:30
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
