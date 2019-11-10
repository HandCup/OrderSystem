package com.cf.controller;

import com.cf.entity.User;
import com.cf.entity.UserVO;
import com.cf.feign.OrderFeign;
import com.cf.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserHandler
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 16:02
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserFeign userFeign;
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @PostMapping("/save")
    public String save(User user){
        userFeign.save(user);
        return "redirect:/account/redirect/user_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByUid(id);
        userFeign.deleteById(id);
        return "redirect:/account/redirect/user_manage";
    }
}
