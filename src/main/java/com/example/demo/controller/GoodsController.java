package com.example.demo.controller;

import com.example.demo.model.Goods;
import com.example.demo.model.GoodsList;
import com.example.demo.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value="商品controller",tags={"商品操作接口"})
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @GetMapping("")
    @ApiOperation(value = "获得所有商品", response = GoodsList.class)
    public GoodsList getAllGoods(){
        GoodsList list=new GoodsList();
       return list;
    }
}
