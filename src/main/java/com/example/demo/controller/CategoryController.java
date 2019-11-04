package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户controller",tags={"分类操作接口"})
@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("")
    @ApiOperation("获得分类详情")
    public Object cat_get(){return new Object();}

}
