package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
public class CommonController {
    @GetMapping("goods/{goodsid}/grouponRule")
    @ApiOperation(value = "查询特定商品上的团购规则")
    public Object findRuleForGoods(){ return new Object(); }

}
