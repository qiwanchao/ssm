package com.baizhi.controller;

import com.baizhi.entity.T_student;
import com.baizhi.service.T_StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class T_StudentController {



    @Autowired
    private T_StudentService t_StudentService;
    @RequestMapping("/selectAll")
    public String selectAll(Map map){
     List<T_student> list=t_StudentService.selectAll();
            map.put("list",list);
        return "index";



    }
}
