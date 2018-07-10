package com.yonyou.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuai on 7/8/2018.
 */
@RestController
public class LonginWX {
    @RequestMapping("/loginWX")
    public String login(){
        return "";
    }
}
