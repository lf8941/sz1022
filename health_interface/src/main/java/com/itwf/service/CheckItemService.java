package com.itwf.service;

import com.itwf.pojo.CheckItem;

import java.util.List;

/**
 * @Author LiuFeng
 * @Date 2020/10/22 17:54
 */
public interface CheckItemService {
    List<CheckItem> findAll();

    boolean add(CheckItem checkItem);

    boolean update(CheckItem checkItem);

    CheckItem findByid(Integer id);

    boolean delete(Integer id);
}
