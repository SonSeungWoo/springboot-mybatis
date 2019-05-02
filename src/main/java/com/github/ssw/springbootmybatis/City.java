package com.github.ssw.springbootmybatis;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Data
@Alias("city")
public class City{

    private Long cityId;
    private String cityCode;
    private String name;
    private String country;
    private Long population;
    private Person person;
    //@JsonSerialize(using = LocalDateTimeSerializer.class)
    //@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime insertDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getInsertDate() {
        return this.insertDate;
    }

    public City() {
    }

    public City(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}