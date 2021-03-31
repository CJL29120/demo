package com.cjl.demo.entity;

import org.junit.Test;

public class PersonTest {

    static String name = new String("123");

    @Test
    public void saySomething() {
        Person person = new Person();
        person.saySomething();
    }

    @Test
    public void contextLoads() {

    }
}