package com.cf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:19
 */
@Data
public class Account {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
