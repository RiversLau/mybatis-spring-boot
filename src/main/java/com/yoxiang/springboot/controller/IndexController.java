package com.yoxiang.springboot.controller;

import com.yoxiang.springboot.mapper.CountryMapper;
import com.yoxiang.springboot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: Rivers
 * Date: 2017/11/1 21:10
 */
@RestController
public class IndexController {

    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping("/")
    public String home() {
        List<Country> countryList = countryMapper.selectAll();
        return countryList.size() + "";
    }
}
