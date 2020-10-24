package com.itwf.dao;

import com.itwf.pojo.CheckItem;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author LiuFeng
 * @Date 2020/10/22 18:45
 */
public interface CheckItemDao {
    //查所有
    List<CheckItem> findAll();
    //增加项目
    int add( CheckItem checkItem);
    //修改项目
    int update(CheckItem checkItem);
    //根据id找项目
    CheckItem findByid(Integer id);

    int delete(Integer id);
}
