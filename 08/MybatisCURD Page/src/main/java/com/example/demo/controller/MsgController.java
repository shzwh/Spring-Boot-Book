package com.example.demo.controller;

import com.example.demo.entity.TbMsg;
import com.example.demo.mapper.ITbMsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    ITbMsgMapper iTbMsgMapper;

    @RequestMapping("/listall")
    List<TbMsg>  listAll(){
        return iTbMsgMapper.listAll();
    }

    @RequestMapping("/add")
    String add(TbMsg tbMsg){
        return iTbMsgMapper.add(tbMsg) == 1? "success" : "fail";
    }
}
