package com.example.demo.mapper;

import com.example.demo.entity.TbMsg;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITbMsgMapper {

    @Select("SELECT * FROM tb_msg")
    List<TbMsg> listAll();

    @Insert({"INSERT INTO tb_msg(msg_type,msg) VALUES(#{msg_type},#{msg})"})
    int add(TbMsg tbMsg);

}
