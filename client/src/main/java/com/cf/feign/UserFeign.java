package com.cf.feign;

import com.cf.entity.User;
import com.cf.entity.UserVO;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserFeign
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 16:04
 */
@FeignClient(value = "user")
public interface UserFeign {
    @GetMapping("/user/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @PostMapping("/user/save")
    public void save(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
