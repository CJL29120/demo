package com.cjl.demo;

import com.alibaba.fastjson.JSON;
import com.cjl.demo.entity.Person;
import com.cjl.demo.mapper.PersonMapper;
import com.cjl.demo.utils.Builder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@MapperScan("com.cjl.demo.mapper")
@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	PersonMapper personMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping({"/", "test"})
	public String test(){
		Person person = Builder.of(Person::new)
				.with(Person::setId,1L)
				.with(Person::setName,"123").build();
		return JSON.toJSONString(personMapper.selectById(1L));
	}

}
