package com.github.ssw.springbootmybatis;

import lombok.Data;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-03-10
 * Time: 13:35
 */
public class CityDto {

    @Data
    public static class CityData extends Paging{
        private Long cityId;
        private String cityCode;
        private String name;
        private String country;
        private Long population;
    }
}
