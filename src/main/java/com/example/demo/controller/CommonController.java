package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value="CommonController",tags={"公用操作接口"})
@RestController
@RequestMapping("")
public class CommonController {

    @GetMapping("goods/{id}/grouponRule")
    @ApiOperation(value = "查询特定商品上的团购规则")
    public Object findGrouponRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @GetMapping("goods/{id}/shareRule")
    @ApiOperation(value = "查询特定商品上的分享规则")
    public Object findShareRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    /*
     * 商品
     */
    @GetMapping("goods")
    @ApiOperation(value = "查看所有商品")
    public ArrayList<Object> getAllGoods(){ return new ArrayList<Object>(); }
    @GetMapping("goods/{id}")
    @ApiOperation(value = "查看特定商品")
    public Object getOneGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @GetMapping("goods/search")
    @ApiOperation(value = "根据商品名称查看商品")
    public ArrayList<Object> getGoodsOfName(@ApiParam(name="name",value="商品名",required=true) String name) { return new ArrayList<Object>(); }

    /*
     * 品牌
     */
    @GetMapping("brands")
    @ApiOperation("查看所有品牌")
    public ArrayList<Object> getAllBrands(){return new ArrayList<Object>();}
    @GetMapping("brands/{id}/goods")
    @ApiOperation("查看指定品牌下的商品")
    public ArrayList<Object> getGoodsByBrandId(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new ArrayList<Object>();}

    /*
     * 分类
     */
    @GetMapping("categories")
    @ApiOperation("查看所有分类")
    public ArrayList<Object> getAllCategories(){return new ArrayList<Object>();}

    @GetMapping("categories/{id}/subcategories")
    @ApiOperation("查看特定一级分类下二级分类")
    public ArrayList<Object> getSubCategories(@ApiParam(name="id",value="一级分类ID",required=true) @PathVariable("id") String id){return new ArrayList<Object>();}

    /*
     * 预售商品
     */
    @GetMapping("pre-sale-goods")
    @ApiOperation(value = "查看所有预售商品")
    public ArrayList<Object> getAllPreSaleGoods(){ return new ArrayList<Object>(); }
    @GetMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "查看特定预售商品")
    public Object getOnePreSaleGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @GetMapping("pre-sale-goods/search")
    @ApiOperation(value = "根据名称查看相关预售商品")
    public ArrayList<Object> getPreSaleGoodsByName(@ApiParam(name="name",value="商品名",required=true) String name) { return new ArrayList<Object>(); }


    /*
     * 专题
     */
    @GetMapping("topics")
    @ApiOperation("获得所有专题")
    public ArrayList<Object> getAllTopics(){ return new ArrayList<Object>(); }

    @GetMapping("topics/{id}")
    @ApiOperation("查看特定专题")
    public Object getOneTopic(@ApiParam(name="id",value="话题ID",required=true) @PathVariable("id") String id){ return new Object(); }
}
