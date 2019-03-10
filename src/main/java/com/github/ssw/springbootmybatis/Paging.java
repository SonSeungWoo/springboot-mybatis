package com.github.ssw.springbootmybatis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-03-10
 * Time: 12:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paging {

    private int startPage;

    private int endPage;

    private List<Integer> limit;

    public Paging(List<Integer> limit){
        this.startPage = limit.get(0);
        this.endPage = limit.get(1);
    }
}
