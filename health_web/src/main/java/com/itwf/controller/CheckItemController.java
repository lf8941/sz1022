package com.itwf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itwf.constant.MessageConstant;
import com.itwf.pojo.CheckItem;
import com.itwf.pojo.Result;
import com.itwf.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author LiuFeng
 * @Date 2020/10/22 17:46
 */
@RestController
@RequestMapping("checkitems")
public class CheckItemController {
    //查所有项目
    @Reference
    private CheckItemService checkItemService;
   @GetMapping("findAll")
    public Result findAll(){
       System.out.println("进来了");
       List<CheckItem>checkItem=checkItemService.findAll();
       if(checkItem!=null){
           return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,checkItem);
       }
       return new Result(false,MessageConstant.QUERY_CHECKITEM_FAIL);
    }
    //增加项目
    @PostMapping("add")
    public Result add(@RequestBody CheckItem checkItem){
        boolean add = checkItemService.add(checkItem);
        if(add){
            return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
        }
        return new Result(false,MessageConstant.ADD_CHECKGROUP_FAIL);
    }
    //修改项目
    @PostMapping("update")
    public Result update(@RequestBody CheckItem checkItem){
        boolean update = checkItemService.update(checkItem);
        if(update){
            return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
        }
        return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
    }
    //根据id找项目
    @GetMapping("findByid")
    public Result findByid (Integer id ){
            CheckItem checkItem =checkItemService.findByid(id);
            if(checkItem!=null){
                return new Result(true,MessageConstant.QUERY_CHECKGROUP_SUCCESS,checkItem);
            }
                return new Result(false,MessageConstant.QUERY_CHECKITEM_FAIL);
    }

    @GetMapping("delete")
    public Result delete (Integer id ){
        boolean flag =checkItemService.delete(id);
        if(flag){
            return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
        }
       return new Result(false,MessageConstant.DELETE_CHECKITEM_FAIL);
    }

}
