package com.cf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName MenuVO
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
