package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"订单操作接口"})
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/{userId}")
    @ApiOperation("查看全部订单")
    public Object getAllOrders(){return new Object();}

    @GetMapping("/{orderId}")
    @ApiOperation("查看指定订单详情")
    public Object getOrderDetail(){return new Object();}

    @PostMapping("/")
    @ApiOperation("创建订单")
    public Object createOrder(){return new Object();}

    @PatchMapping("/{orderId}/cancellation")
    @ApiOperation("取消订单")
    public Object cancelOrder(){return new Object();}

    @PostMapping("/wx-advance-payment")
    @ApiOperation("创建微信预支付订单")
    public Object createWXAdvancePaymentOrder(){return new Object();}

    @PatchMapping("/{orderId}/confirmation")
    @ApiOperation("确认收货")
    public Object confirmOrder(){return new Object();}

    @DeleteMapping("/{orderId}/deletion")
    @ApiOperation("删除订单")
    public Object deleteOrder(){return new Object();}

    @PatchMapping("/{order-id}/refund")
    @ApiOperation("申请退款")
    public Object refundOrder(){return new Object();}

    @GetMapping("/{user-id}/x-comment")
    @ApiOperation("查看待评价商品")
    public Object getNotCommentYetOrder(){return new Object();}

    @PostMapping("/{order-id}/comment")
    @ApiOperation("评价订单")
    public Object commentOrder(){return new Object();}
}
