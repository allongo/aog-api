package com.aog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mingle on 2018/4/26.
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/hello",method= RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String hello(){
        log.info("logback init");
        return "hello SpringBoot";
    }
}
