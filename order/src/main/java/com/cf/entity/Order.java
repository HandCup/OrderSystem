package com.cf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:18
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}
