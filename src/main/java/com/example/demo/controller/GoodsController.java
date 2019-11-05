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
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    /*
     * 商品
     */
    @GetMapping("")
    @ApiOperation(value = "查看所有商品")
    public Object getAllGoods(){ return new Object(); }
    @GetMapping("{id}")
    @ApiOperation(value = "查看特定商品")
    public Object getOneGoods(){ return new Object(); }
    @GetMapping("{key-word}}")
    @ApiOperation(value = "根据关键字查看商品")
    public Object getGoodsOfKeyWord() { return new Object(); }
    @PostMapping("")
    @ApiOperation(value = "添加商品")
    public Object addGoods(){ return new Object(); }
    @DeleteMapping("{id}")
    @ApiOperation(value = "删除商品")
    public Object deleteGoods(){ return new Object(); }
    @PutMapping("{id}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(){ return new Object(); }

    /*
     * 商品规格
     */
    @GetMapping("{id}/specification")
    @ApiOperation(value = "查看特定商品的的所有规格信息")
    public Object getAllSpecificationsByGoodsId(){ return new Object(); }
    @GetMapping("{id}/specifications/{specificationId}")
    @ApiOperation(value = "查看特定商品的的特定规格信息")
    public Object getOneSpecificationsByGoodsId(){ return new Object(); }
    @PostMapping("{id}/specifications")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(){ return new Object(); }
    @DeleteMapping("{id}/specifications/{specificationId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(){ return new Object(); }
    @PutMapping("{id}/specifications/{specificationId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(){ return new Object(); }

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
    @PostMapping("pre-sale-goods")
    @ApiOperation(value = "添加预售商品")
    public Object addPreSaleGoods(){ return new Object(); }
    @DeleteMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "删除预售商品")
    public Object deletePreSaleGoods(){ return new Object(); }
    @PutMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "修改预售商品信息")
    public Object updatePreSaleGoods(){ return new Object(); }

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
    @PostMapping("groupon-goods")
    @ApiOperation(value = "添加团购商品")
    public Object addGrouponGoods(){ return new Object(); }
    @DeleteMapping("groupon-goods/{id}")
    @ApiOperation(value = "删除团购商品")
    public Object deleteGrouponGoods(){ return new Object(); }
    @PutMapping("groupon-goods/{id}")
    @ApiOperation(value = "修改团购商品信息")
    public Object updateGrouponGoods(){ return new Object(); }

}
