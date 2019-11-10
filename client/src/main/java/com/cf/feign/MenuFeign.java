package com.cf.feign;

import com.cf.entity.Menu;
import com.cf.entity.MenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @ClassName MenuFeign
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:53
 */
@FeignClient(value = "menu")
public interface MenuFeign {
    @GetMapping("/menu/findAll/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @GetMapping("/menu/findAll")
    public List<Type> findAll();

    @PostMapping("/menu/save")
    public void save(@RequestBody Menu menu);

    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable("id") long id);

    @PutMapping("/menu/update")
    public void update(@RequestBody Menu menu);

    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
