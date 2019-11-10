package com.cf.controller;

import com.cf.entity.Menu;
import com.cf.entity.MenuVO;
import com.cf.entity.Type;
import com.cf.repository.MenuRepository;
import com.cf.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/findAll/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        MenuVO menuVO = new MenuVO();
        menuVO.setCode(0);
        menuVO.setMsg("");
        menuVO.setCount(menuRepository.count());
        menuVO.setData(menuRepository.findAll((page-1)*limit,limit));
        return menuVO;
    }

    @GetMapping("/findAll")
    public List<Type> findAll(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }
}
