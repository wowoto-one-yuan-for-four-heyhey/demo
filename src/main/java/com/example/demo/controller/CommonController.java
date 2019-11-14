package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="CommonController",tags={"公用操作接口"})
@RestController
@RequestMapping("")
public class CommonController {

    @GetMapping("goods/{goodsId}/grouponRule")
    @ApiOperation(value = "查询特定商品上的团购规则")
    public Object findRuleForGoods(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }

    /*
     * 商品
     */
    @GetMapping("goods")
    @ApiOperation(value = "查看所有商品")
    public Object getAllGoods(){ return new Object(); }
    @GetMapping("goods/{goodsId}")
    @ApiOperation(value = "查看特定商品")
    public Object getOneGoods(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @GetMapping("goods/search")
    @ApiOperation(value = "根据商品名称查看商品")
    public Object getGoodsOfName(@ApiParam(name="goodsName",value="商品名",required=true) String goodsName) { return new Object(); }

    /*
     * 品牌
     */
    @GetMapping("brands")
    @ApiOperation("查看所有品牌")
    public Object getAllBrands(){return new Object();}
    @GetMapping("brands/{brandId}/goods")
    @ApiOperation("查看指定品牌下的商品")
    public Object getGoodsByBrandId(@ApiParam(name="brandId",value="品牌ID",required=true) @PathVariable("brandId") String brandId){return new Object();}

    /*
     * 分类
     */
    @GetMapping("categories")
    @ApiOperation("查看所有分类")
    public Object getAllCategories(){return new Object();}

    @GetMapping("categories/{categoryId}/subcategories")
    @ApiOperation("查看特定一级分类下二级分类")
    public Object getSubCategories(@ApiParam(name="categoryId",value="种类ID",required=true) @PathVariable("categoryId") String categoryId){return new Object();}

    /*
     * 预售商品
     */
    @GetMapping("pre-sale-goods")
    @ApiOperation(value = "查看所有预售商品")
    public Object getAllPreSaleGoods(){ return new Object(); }
    @GetMapping("pre-sale-goods/{goodsId}")
    @ApiOperation(value = "查看特定预售商品")
    public Object getOnePreSaleGoods(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @GetMapping("pre-sale-goods/search")
    @ApiOperation(value = "根据名称查看相关预售商品")
    public Object getPreSaleGoodsByName(@ApiParam(name="goodsName",value="商品名",required=true) @PathVariable("goodsName") String goodsName) { return new Object(); }


    /*
     * 团购商品
     */
    @GetMapping("groupon-goods")
    @ApiOperation(value = "查看所有团购商品")
    public Object getAllGrouponGoods(){ return new Object(); }
    @GetMapping("groupon-goods/{goodId}")
    @ApiOperation(value = "查看特定团购商品")
    public Object getGrouponGoods(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @GetMapping("groupon-goods/search")
    @ApiOperation(value = "根据名称查看相关团购商品")
    public Object getGrouponGoodsByName(@ApiParam(name="goodsName",value="商品名",required=true) @PathVariable("goodsName") String goodsName) { return new Object(); }


    /*
     * 专题
     */
    @GetMapping("topics")
    @ApiOperation("获得所有专题")
    public void getAllTopics(){ }

    @GetMapping("topics/{topicId}")
    @ApiOperation("查看特定专题")
    public void getOneTopic(){ }
}
