package com.github.ssw.springbootmybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CityService {

    private final CityMapper cityMapper;

    public City getCityById(Long cityId) {
        return cityMapper.selectCityById(cityId);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }

    @Transactional
    public void addCity(City city) {
        cityMapper.insertCity(city);
    }


    public void update(City city){
        addCity(city);
    }
}
