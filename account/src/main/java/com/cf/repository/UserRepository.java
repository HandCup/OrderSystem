package com.cf.repository;

import com.cf.entity.User;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 16:38
 */
public interface UserRepository {
    public User login(String username, String password);
}
