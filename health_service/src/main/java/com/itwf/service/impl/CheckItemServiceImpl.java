package com.itwf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itwf.dao.CheckItemDao;
import com.itwf.pojo.CheckItem;
import com.itwf.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author LiuFeng
 * @Date 2020/10/22 17:52
 */
@Service(interfaceClass=CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {
   @Autowired
    CheckItemDao checkItemDao;
    @Override
    public List<CheckItem> findAll() {
        List<CheckItem> all = checkItemDao.findAll();
        return all;
    }

    @Override
    public boolean add(CheckItem checkItem) {
        if(checkItemDao.add(checkItem)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(CheckItem checkItem) {
        if(checkItemDao.update(checkItem)>0){
            return true;
        }
        return false;
    }

    @Override
    public CheckItem findByid(Integer id) {
        return checkItemDao.findByid(id);
    }

    @Override
    public boolean delete(Integer id) {
        int delete = checkItemDao.delete(id);
        if(delete>0) {
            return true;
        }
        return false;
    }
}
