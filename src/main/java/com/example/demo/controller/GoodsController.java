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

    //商品api
    @GetMapping("")
    @ApiOperation(value = "获得所有商品信息")
    public Object getAllGoods(){
        return new LitemallGoods();
    }

    @GetMapping("{id}")
    @ApiOperation(value = "根据id获得某种商品的所有信息")
    public Object getGoods(@PathVariable("id") Integer id){
        return new LitemallGoods();
    }

    @GetMapping("search")
    @ApiOperation(value = "根据商品名获得某种商品的所有信息")
    public Object searchGoods(@NotNull @RequestParam String name) {
        return new LitemallGoods();
    }

    @PostMapping("")
    @ApiOperation(value = "创建新商品")
    public Object createGoods(@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @PutMapping("{id}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(@PathVariable("id") Integer id,@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "删除特定商品")
    public Object deleteGoods(@PathVariable("id") Integer id){
        return true;
    }

    @GetMapping("{id}/specification")
    @ApiOperation(value = "根据商品id获得某种商品的所有规格信息")
    public Object getGoodsSpecification(@PathVariable("id") Integer id){
        return new LitemallGoods();
    }

    @GetMapping("{id}/specification/{sId}")
    @ApiOperation(value = "根据商品id获得某种商品的特定id的规格信息")
    public Object getGoodsSpecification(@PathVariable("id") Integer id,@PathVariable("sId") Integer sId){
        return new LitemallGoods();
    }

    @PostMapping("{id}/specification")
    @ApiOperation(value = "创建商品新规格")
    public Object createGoodsSpecification(@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @PutMapping("{id}/specification/{sId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateGoodsSpecification(@PathVariable("id") Integer id,@RequestBody Goods goods,@PathVariable("sId") Integer sId){
        return new LitemallGoods();
    }

    @DeleteMapping("{id}/specification/{sId}")
    @ApiOperation(value = "删除特定商品规格")
    public Object deleteGoodsSpecification(@PathVariable("id") Integer id,@PathVariable("sId") Integer sId){
        return true;
    }


    //预售商品api
    @GetMapping("pre-sale")
    @ApiOperation(value = "获得所有预售商品信息")
    public Object getAllPreSaleGoods(){
        return new LitemallGoods();
    }

    @GetMapping("pre-sale/{id}")
    @ApiOperation(value = "根据id获得某种预售商品的所有信息")
    public Object getPreSaleGoods(@PathVariable("id") Integer id){
        return new LitemallGoods();
    }

    @GetMapping("pre-sale/{name}")
    @ApiOperation(value = "根据商品名获得某种预售商品的所有信息")
    public Object searchPreSaleGoods(@PathVariable("name") String name) {
        return new LitemallGoods();
    }

    @PostMapping("pre-sale")
    @ApiOperation(value = "创建新预售商品")
    public Object createPreSaleGoods(@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @PutMapping("pre-sale/{id}")
    @ApiOperation(value = "修改特定预售商品信息")
    public Object updatePreSaleGoods(@PathVariable("id") Integer id,@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @DeleteMapping("pre-sale/{id}")
    @ApiOperation(value = "删除特定预售商品")
    public Object deletePreSaleGoods(@PathVariable("id") Integer id){
        return true;
    }

    //团购商品api
    @GetMapping("groupon-goods")
    @ApiOperation(value = "获得所有团购商品信息")
    public Object getAllGrouponGoods(){
        return new LitemallGoods();
    }

    @GetMapping("groupon-goods/{id}")
    @ApiOperation(value = "根据id获得某种团购商品的所有信息")
    public Object getGrouponGoods(@PathVariable("id") Integer id){
        return new LitemallGoods();
    }

    @GetMapping("groupon-goods/search")
    @ApiOperation(value = "根据商品名获得某种团购商品的所有信息")
    public Object searchGrouponGoods(@NotNull @RequestParam String name) {
        return new LitemallGoods();
    }

    @PostMapping("groupon-goods")
    @ApiOperation(value = "创建新团购商品")
    public Object createGrouponGoods(@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @PutMapping("groupon-goods/{id}")
    @ApiOperation(value = "修改团购商品信息")
    public Object updateGrouponGoods(@PathVariable("id") Integer id,@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @DeleteMapping("groupon-goods/{id}")
    @ApiOperation(value = "删除特定团购商品")
    public Object deleteGrouponGoods(@PathVariable("id") Integer id){
        return true;
    }
}
