package com.cf.repository;

import com.cf.entity.Order;

import java.util.List;

/**
 * @ClassName OrderRepository
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:21
 */
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(long uid, int index, int limit);
    public int countByUid(long uid);
    public void deleteByMid(long mid);
    public void deleteByUid(long uid);
    public List<Order> findAllByState(int state, int index, int limit);
    public int countByState(int state);
    public void updateState(long id,long aid,int state);
}
