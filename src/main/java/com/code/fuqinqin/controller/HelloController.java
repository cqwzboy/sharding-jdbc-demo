package com.code.fuqinqin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fuqinqin on 2018/9/21.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+name;
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
