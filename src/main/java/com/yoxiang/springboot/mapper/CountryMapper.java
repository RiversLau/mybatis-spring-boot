package com.yoxiang.springboot.mapper;

import com.yoxiang.springboot.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: Rivers
 * Date: 2017/11/1 21:17
 */
@Mapper
public interface CountryMapper {

    List<Country> selectAll();
}
