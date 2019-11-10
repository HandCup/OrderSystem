package com.cf.repository;

import com.cf.entity.User;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:00
 */
public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
