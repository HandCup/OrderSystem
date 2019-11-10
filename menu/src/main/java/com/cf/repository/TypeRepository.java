package com.cf.repository;

import com.cf.entity.Type;

import java.util.List;

/**
 * @ClassName TypeRepository
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:30
 */
public interface TypeRepository {
    public List<Type> findAll();
}
