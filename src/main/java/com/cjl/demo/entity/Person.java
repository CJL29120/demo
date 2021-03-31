package com.cjl.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_person")
public class Person {

    @TableId
    private Long id;

    @TableField(value = "name")
    private String name;

    public void saySomething(){
        String alice;
        alice = "小强";
        System.out.println("hello"+alice);
    }
}
