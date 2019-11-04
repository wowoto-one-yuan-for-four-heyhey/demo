package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"订单操作接口"})
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    @ApiOperation("获取订单列表")
    public Object getOrdersList(){return new Object();}

    @GetMapping("/detail")
    @ApiOperation("获取订单详情")
    public Object getOrdersDetail(){return new Object();}

    @PostMapping("/submit")
    @ApiOperation("创建订单")
    public Object createOrder(){return new Object();}

    @PatchMapping("/cancel")
    @ApiOperation("取消订单")
    public Object cancelOrder(){return new Object();}

    @PostMapping("/prepay")
    @ApiOperation("微信预支付交易单")
    public Object createWXPrepayOrder(){return new Object();}

    @PatchMapping("/confirm")
    @ApiOperation("确认收货")
    public Object confirmOrder(){return new Object();}

    @PatchMapping("/delete")
    @ApiOperation("订单删除")
    public Object deleteOrder(){return new Object();}

    @PatchMapping("/refund")
    @ApiOperation("订单退款")
    public Object refundOrder(){return new Object();}

    @GetMapping("/goods")
    @ApiOperation("待评价商品")
    public Object getGoodsToBeEvaluated(){return new Object();}

    @PostMapping("/comment")
    @ApiOperation("订单评价")
    public Object commentGoods(){return new Object();}
}
