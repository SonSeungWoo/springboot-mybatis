package com.github.ssw.springbootmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CityMapper {
    City selectCityById(Long cityId);

    List<CityDto.CityData> selectAllCity(CityDto.CityData city);

    int totalCount();

    void insertCity(City city);

    void update(City city);

    void mergeCity(City city);
}
