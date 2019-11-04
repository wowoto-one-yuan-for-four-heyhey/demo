package com.example.demo.controller;

import com.example.demo.entity.LitemallGoods;
import com.example.demo.model.Goods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Api(value="分享活动controller",tags={"分享活动操作接口"})
@RestController
@RequestMapping("/shares")
public class ShareController {
    @GetMapping("")
    @ApiOperation(value = "获得所有分享活动信息")
    public Object getAllShares(){
        return "分享活动信息";
    }

    @GetMapping("users/{userId}")
    @ApiOperation(value = "根据userId获得某个分享活动的信息")
    public Object getSharesByUser(@PathVariable("userId") Integer userId){
        return "分享活动信息";
    }

    @GetMapping("{id}")
    @ApiOperation(value = "根据shareId获得某个分享活动的信息")
    public Object getSharesById(@PathVariable("id") Integer id) { return "分享活动信息"; }

    @PostMapping("")
    @ApiOperation(value = "创建新分享活动")
    public Object createShares(){
        return "分享活动信息";
    }

    @PutMapping("{id}")
    @ApiOperation(value = "修改分享活动信息")
    public Object updateShares(@PathVariable("id") Integer id){
        return "分享活动信息";
    }

    @GetMapping("rules")
    @ApiOperation(value = "获得所有分享活动规则信息")
    public Object getAllRules(){
        return "分享活动信息";
    }

    @GetMapping("{id}/rules")
    @ApiOperation(value = "获得特定分享活动规则信息")
    public Object getRulesById(@PathVariable("id") Integer id){
        return "分享活动规则信息";
    }

    @GetMapping("rules/{goodsId}")
    @ApiOperation(value = "根据商品id获得某个商品支持的分享活动规则信息")
    public Object getRulesByGoods(@PathVariable("goodsId") Integer id) { return "分享活动规则信息"; }

    @PostMapping("rules")
    @ApiOperation(value = "创建新分享活动规则信息")
    public Object createRules(){
        return "分享活动规则信息";
    }

    @PutMapping("rules/{id}")
    @ApiOperation(value = "修改分享活动规则信息")
    public Object updateRules(@PathVariable("id") Integer id){
        return "分享活动规则信息";
    }

}
