package com.github.ssw.springbootmybatis;

import lombok.Data;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-03-08
 * Time: 21:55
 */
@Data
public class RequestDto<T> {
    private T request;

}
