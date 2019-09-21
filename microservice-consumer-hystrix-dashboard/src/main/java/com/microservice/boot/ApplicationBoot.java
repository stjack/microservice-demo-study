package com.microservice.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@ImportResource(locations = {"classpath:spring/*/*.xml"})
@EnableAutoConfiguration
@ComponentScan(
        basePackages = {"com.microservice.**"})
@Slf4j
@Configuration
@SpringBootApplication
public class ApplicationBoot {

}
