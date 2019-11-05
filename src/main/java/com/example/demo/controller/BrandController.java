package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"品牌操作接口"})
@RestController
@RequestMapping("/brand")
public class BrandController {

    /*
     * 品牌
     */
    @GetMapping("")
    @ApiOperation("查看所有品牌")
    public Object getAllBrands(){return new Object();}
    @GetMapping("{category-id}")
    @ApiOperation("查看指定分类下的品牌")
    public Object getBrandsByCategoryId(){return new Object();}
    @GetMapping("{key-word}")
    @ApiOperation("获取指定关键字下的品牌")
    public Object getBrandsByKeyWord(){return new Object();}
    @GetMapping("{brand-id}")
    @ApiOperation("获取指定品牌相关信息")
    public Object getOneBrand(){return new Object();}
    @PostMapping("")
    @ApiOperation("添加品牌")
    public Object addBrand(){return new Object();}
    @DeleteMapping("{brandId}")
    @ApiOperation("删除品牌")
    public Object deleteBrand(){return new Object();}
    @PutMapping("{brandId}")
    @ApiOperation("修改品牌信息")
    public Object updateBrand(){return new Object();}



    /*
     * 品牌商品
     */
    @GetMapping("/{brand-id}/goods")
    @ApiOperation("获取指定品牌下的商品")
    public Object getGoodsByBrandId(){return new Object();}
    @PostMapping("/{brand-id}/goods")
    @ApiOperation("添加指定品牌下的商品")
    public Object addGoodsOfSpecifiedBrand(){return new Object();}
    @DeleteMapping("/{brand-id}/goods")
    @ApiOperation("删除指定品牌下的商品")
    public Object deleteGoodsOfSpecifiedBrand(){return new Object();}
    @PutMapping("/{brand-id}/goods")
    @ApiOperation("修改指定品牌下的商品信息")
    public Object updateGoodsOfSpecifiedBrand(){return new Object();}

}
