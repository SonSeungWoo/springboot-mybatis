package com.github.ssw.springbootmybatis;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

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
        private LocalDateTime insertDate;
    }

    @Data
    public static class CityListData{
        private int total;
        private List<CityDto.CityData> list;
    }
}
