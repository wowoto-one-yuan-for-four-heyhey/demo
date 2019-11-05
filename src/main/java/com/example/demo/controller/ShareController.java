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

    /*
     * 分享活动
     */
    @GetMapping("")
    @ApiOperation("查看所有分享活动")
    public Object getAllShares(){ return new Object(); }
    @GetMapping("{id}")
    @ApiOperation("查看特定分享活动")
    public Object getOneShare() { return new Object(); }
    @GetMapping("users/{userId}")
    @ApiOperation("查看特定用户所有分享活动")
    public Object getSharesByUser(){ return new Object(); }
    @PostMapping("")
    @ApiOperation("添加分享活动")
    public Object addShare(){ return new Object(); }
    @PutMapping("{id}")
    @ApiOperation("修改分享活动信息")
    public Object updateShares(@PathVariable("id") Integer id){
        return new Object();
    }

    /*
     * 分享规则
     */
    @GetMapping("shareRules")
    @ApiOperation("查看所有分享活动规则")
    public Object getAllShareRules(){ return new Object(); }
    @GetMapping("{id}/shareRules")
    @ApiOperation("查看特定分享活动规则")
    public Object getOneShareRule(){ return new Object(); }
    @GetMapping("{goodsId}/shareRules")
    @ApiOperation("查看特定商品支持的分享活动规则")
    public Object getShareRulesByGoodsId() { return new Object(); }
    @PostMapping("shareRules")
    @ApiOperation("添加分享活动规则")
    public Object addShareRules(){ return new Object(); }
    @DeleteMapping("shareRules/{id}")
    @ApiOperation("删除分享活动规则")
    public Object deleteShareRules(){ return new Object(); }
    @PutMapping("shareRules/{id}")
    @ApiOperation("修改分享活动规则信息")
    public Object updateShareRules(@PathVariable("id") Integer id){ return new Object(); }

}
