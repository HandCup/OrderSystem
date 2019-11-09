package com.cf.controller;

import com.cf.entity.Menu;
import com.cf.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
 * 服务消费者
 */
import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientHandler {
    @Autowired
    private MenuFeign menuFeign;
//    @GetMapping("/findAll")
//    public List<Menu> findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
//        int index = (page -1) * limit;
//        return menuFeign.findAll(index,limit);
//    }
    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index,@PathVariable("limit")int limit){
        return menuFeign.findAll(index,limit);
    }
    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }
}
