package com.cf.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName OrderVO
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:18
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Order> getData() {
        return data;
    }

    public void setData(List<Order> data) {
        this.data = data;
    }
}
