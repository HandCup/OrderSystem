package com.cf.repository;

import com.cf.entity.Menu;

import java.util.List;

public interface MenuRepository {
    public int count();
    public List<Menu> findAll(int index, int limit);
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
 }
