package com.github.ssw.springbootmybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class CityServiceTest {
    @Autowired
    CityService service;

    @Test
    public void getCityById() {
        //City city = service.getCityById(1L);
        //log.info("city : {}", city);
    }

    @Test
    public void getAllCity() {
        //List<City> cities = service.getAllCity();
        //log.info("cities : {}", cities);
    }


    @Test
    public void addCities() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("뉴욕", "미국", 1_000_000L));
        cityList.add(new City("런던", "영국", 2_000_000L));
        cityList.add(new City("파리", "프랑스", 3_000_000L));
        service.addCity(cityList);
    }

}
