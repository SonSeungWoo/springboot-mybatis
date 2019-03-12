package com.github.ssw.springbootmybatis;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-03-12
 * Time: 21:19
 */
@Data
@Alias("person")
public class Person {
    private long id;

    private String firstName;

    private String lastName;

    private String cityId;
}
