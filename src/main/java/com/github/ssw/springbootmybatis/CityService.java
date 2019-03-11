package com.github.ssw.springbootmybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CityService {

    private final CityMapper cityMapper;

    public City getCityById(Long cityId) {
        return cityMapper.selectCityById(cityId);
    }

    public CityDto.CityListData getAllCity(CityDto.CityData city) {
        city.setStartPage(city.getLimit().get(0));
        city.setEndPage(city.getLimit().get(1));
        CityDto.CityListData cityList = new CityDto.CityListData();
        cityList.setTotal(cityMapper.totalCount());
        cityList.setList(cityMapper.selectAllCity(city));
        return cityList;
    }

    @Transactional
    public void addCity(List<City> cityList) {
        cityList.forEach(city -> cityMapper.insertCity(city));
    }

    @Transactional
    public void mergeCity(List<City> cityList){
        cityList.forEach(city -> cityMapper.mergeCity(city));
    }
}
