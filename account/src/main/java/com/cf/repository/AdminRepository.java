package com.cf.repository;

import com.cf.entity.Admin;

/**
 * @ClassName AdminRepository
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 16:37
 */
public interface AdminRepository {
    public Admin login(String username, String password);
}
