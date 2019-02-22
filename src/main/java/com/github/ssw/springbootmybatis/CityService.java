package com.github.ssw.springbootmybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CityService {

    private final CityMapper cityMapper;

    public City getCityById(Long cityId) {
        return cityMapper.selectCityById(cityId);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }

    public void addCity(City city) {
        cityMapper.insertCity(city);
    }

    public void update(City city){
        cityMapper.update(city);
    }
}
