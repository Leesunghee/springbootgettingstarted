package com.ready2die;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleApplicationRunner.class);

    @Autowired
    private String hello;

    @Autowired
    private SungheeProperties sungheeProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("==================");
        logger.debug(hello);
        logger.debug(sungheeProperties.getName());
        logger.debug(sungheeProperties.getFullName());
        logger.debug("==================");

    }
}

