package com.github.ssw.springbootmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {
    City selectCityById(Long cityId);

    List<City> selectAllCity();

    void insertCity(City city);

    void update(City city);
}
