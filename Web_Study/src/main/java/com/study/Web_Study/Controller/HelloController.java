package com.study.Web_Study.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Api(tags = "DemoController")
@Controller
@RequestMapping("/template")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/hello")
    public String hello() {
        return "안녕하세요. 현재 서버 시간은 " + new Date() + "입니다 \n";
    }

    @ApiOperation("test")
    @RequestMapping(value="", method = RequestMethod.GET)
    @ResponseBody
    public Object getTest(){
        return null;
    }
}
