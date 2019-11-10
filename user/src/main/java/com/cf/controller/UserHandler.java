package com.cf.controller;

import com.cf.entity.User;
import com.cf.entity.UserVO;
import com.cf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName UserHandler
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:06
 */
@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        UserVO userVO = new UserVO();
        userVO.setCode(0);
        userVO.setMsg("");
        userVO.setCount(userRepository.count());
        userVO.setData(userRepository.findAll((page-1)*limit,limit));
        return userVO;
    }
    @PostMapping("/save")
    public void save(@RequestBody User user){
//        user.setRegisterdate(new Date());
        userRepository.save(user);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
