package com.cf.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName UserVO
 * @Description user view info
 * @Author Caofei
 * @Date {2019/11/9} 15:01
 */
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;

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

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
