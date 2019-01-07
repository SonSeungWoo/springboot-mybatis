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

    public City getCityById(Long id) {
        return cityMapper.selectCityById(id);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }

    public City findByName(String name) {
        return cityMapper.findByName(name);
    }

    public void addCity(City city) {
        cityMapper.insertCity(city);
    }
}
