package com.cjl.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	static String name = new String("123");

	@Test
	public void contextLoads() {
		System.out.println(name == "123");
	}

}
