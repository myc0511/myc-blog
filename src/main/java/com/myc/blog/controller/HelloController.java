package com.myc.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc: HelloController
 * @author: myc
 * @time: 2020-07-15
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String toIndex(Model model){
        model.addAttribute("name","lisi");
        return "index";
    }
}
