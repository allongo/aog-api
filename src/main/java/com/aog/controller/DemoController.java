package com.aog.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by mingle on 2018/4/26.
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @RequestMapping(value = "/hello",method= RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String hello(){
        return "hello SpringBoot";
    }
}
