package com.ready2die;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private SungheeProperties sungheeProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=================");
        System.out.println(hello);
        System.out.println(sungheeProperties.getName());
        System.out.println(sungheeProperties.getFullName());
        System.out.println("=================");
    }
}
