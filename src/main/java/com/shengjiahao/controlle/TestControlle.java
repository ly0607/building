package com.shengjiahao.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sjh0822
 * @Date 2020/9/30 8:37
 * @Version 1.0
 */
@RestController
public class TestControlle {

    @RequestMapping("Test")
    public String Test(){
        return "Hello";
    }
}
