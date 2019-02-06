package com.github.ssw.springbootmybatis;

import lombok.Data;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-02-06
 * Time: 14:37
 */

@Data
public class CityDto {
    private Long id;
    private String name;
    private String country;
    private Long population;
}
