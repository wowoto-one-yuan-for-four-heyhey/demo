package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户controller",tags={"品牌操作接口"})
@RestController
@RequestMapping("/brand")
public class BrandController {

    @GetMapping("")
    @ApiOperation("获得所有品牌")
    public Object getAllBrands(){return new Object();}

    @GetMapping("/{category_id}")
    @ApiOperation("获取指定分类下的品牌")
    public Object getBrandsOfGivenCategory(){return new Object();}

    @GetMapping("/{key_word}")
    @ApiOperation("获取指定关键字下的品牌")
    public Object getBrandsOfGivenKeyWord(){return new Object();}

    @GetMapping("/{brand_id}/information")
    @ApiOperation("获取指定品牌相关信息")
    public Object getInformationOfGivenBrand(){return new Object();}

    @GetMapping("/{brand_id}/products")
    @ApiOperation("获取指定品牌下的商品")
    public Object getProductsOfGivenBrand(){return new Object();}
}
