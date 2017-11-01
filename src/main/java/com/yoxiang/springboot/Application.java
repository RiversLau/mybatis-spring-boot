package com.yoxiang.springboot;

import com.yoxiang.springboot.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Rivers
 * Date: 2017/11/1 21:08
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CountryMapper countryMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        countryMapper.selectAll();
    }
}
