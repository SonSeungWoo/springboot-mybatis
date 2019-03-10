package com.github.ssw.springbootmybatis;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("city")
public class City{

    private Long cityId;
    private String cityCode;
    private String name;
    private String country;
    private Long population;

    public City() {
    }

    public City(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}