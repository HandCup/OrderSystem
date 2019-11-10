package com.cf.feign;

import com.cf.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName AccountFeign
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 14:35
 */
@FeignClient("account")
public interface AccountFeign {
    @GetMapping("/account/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("type") String type );
}
