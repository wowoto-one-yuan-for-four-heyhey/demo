package com.example.demo.controller;

import com.example.demo.entity.LitemallGoods;
import com.example.demo.model.Goods;
import com.example.demo.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;


@Api(value="商品controller",tags={"商品操作接口"})
@RestController
@RequestMapping("")
public class GoodsController {


    /*
     * 商品
     */
    @GetMapping("goods")
    @ApiOperation(value = "查看所有商品")
    public Object getAllGoods(){ return new Object(); }
    @GetMapping("goods/{id}")
    @ApiOperation(value = "查看特定商品")
    public Object getOneGoods(){ return new Object(); }
    @GetMapping("goods/{key-word}}")
    @ApiOperation(value = "根据关键字查看商品")
    public Object getGoodsOfKeyWord() { return new Object(); }


    /*
     * 评论
     */
    @PostMapping("goods/{id}/comments")
    @ApiOperation("添加评论")
    public Object addComment(){return new Object();}

    @GetMapping("goods/{id}/comments")
    @ApiOperation("查看评论")
    public Object getComment(){return new Object();}


    /*
     * 品牌
     */
    @GetMapping("brands")
    @ApiOperation("查看所有品牌")
    public Object getAllBrands(){return new Object();}
    @GetMapping("brands/{brand-id}/goods")
    @ApiOperation("查看指定品牌下的商品")
    public Object getGoodsByBrandId(){return new Object();}


    /*
     * 分类
     */
    @GetMapping("categories")
    @ApiOperation("查看所有分类")
    public Object getAllCategories(){return new Object();}

    @GetMapping("categories/{categoryId}/subcategories")
    @ApiOperation("查看特定一级分类下二级分类")
    public Object getSubCategories(){return new Object();}

    @GetMapping("categories/{categoryId}/subcategories/{subcategoryId}/goods")
    @ApiOperation("查看指定类别下的商品")
    public Object getGoodsBySubcategoryId(){return new Object();}


    /*
     * 商品规格
     */
    @GetMapping("goods/{id}/specification")
    @ApiOperation(value = "查看特定商品的的所有规格信息")
    public Object getAllSpecificationsByGoodsId(){ return new Object(); }
    @GetMapping("goods/{id}/specifications/{specificationId}")
    @ApiOperation(value = "查看特定商品的的特定规格信息")
    public Object getOneSpecificationsByGoodsId(){ return new Object(); }

    /*
     * 预售商品
     */
    @GetMapping("pre-sale-goods")
    @ApiOperation(value = "查看所有预售商品")
    public Object getAllPreSaleGoods(){ return new Object(); }
    @GetMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "查看特定预售商品")
    public Object getOnePreSaleGoods(){ return new Object(); }
    @GetMapping("pre-sale-goods/{key-word}")
    @ApiOperation(value = "根据关键字查看相关预售商品")
    public Object getPreSaleGoodsByKeyWord() { return new Object(); }


    /*
     * 团购商品
     */
    @GetMapping("groupon-goods")
    @ApiOperation(value = "查看所有团购商品")
    public Object getAllGrouponGoods(){ return new Object(); }
    @GetMapping("groupon-goods/{id}")
    @ApiOperation(value = "查看特定团购商品")
    public Object getGrouponGoods(){ return new Object(); }
    @GetMapping("groupon-goods/{key-word}}")
    @ApiOperation(value = "根据关键字查看相关团购商品")
    public Object getGrouponGoodsByKeyWord() { return new Object(); }


}
