package com.special.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangjian
 * @version 1.0
 * @date: 2019年11月19日 14:43
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/spin")
    public String spin(){
        return "spin/index";
    }

}
