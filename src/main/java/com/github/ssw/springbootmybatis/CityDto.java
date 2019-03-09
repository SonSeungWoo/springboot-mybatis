package com.github.ssw.springbootmybatis;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-02-06
 * Time: 14:37
 */

@Data
public class CityDto {

    @NotNull(message = "{com.msg}")
    private Long id;
    private String name;
    private String country;
    private Long population;
}
