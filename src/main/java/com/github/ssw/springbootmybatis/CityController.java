package com.github.ssw.springbootmybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-02-22
 * Time: 21:37
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> select(){
        List<City> cityList = cityService.getAllCity();
        return ResponseEntity.ok(cityList);
    }

    @GetMapping("/{cityId}")
    public ResponseEntity<City> select(@PathVariable Long cityId){
        City city = cityService.getCityById(cityId);
        return ResponseEntity.ok(city);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody City city){
        cityService.update(city);
        return ResponseEntity.ok("성공");
    }
}
