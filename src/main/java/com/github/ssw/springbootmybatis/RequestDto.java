package com.github.ssw.springbootmybatis;

import lombok.Data;

import java.util.List;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-03-08
 * Time: 21:55
 */
@Data
public class RequestDto<T> {
    private T data;
    private List<T> list;

}
