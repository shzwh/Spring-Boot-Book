package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestOkController {

    @RequestMapping("/testok")
    @ResponseBody
    public Map<String, Object> onTestOk(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("msg","this is ok test!");

        return map;
    }

}
