package com.cf.entity;

import lombok.Data;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:20
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
