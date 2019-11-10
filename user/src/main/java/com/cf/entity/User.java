package com.cf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName User
 * @Description user info
 * @Author Caofei
 * @Date {2019/11/9} 15:00
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
