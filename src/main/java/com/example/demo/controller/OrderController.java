package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"订单操作接口"})
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/{user-id}}")
    @ApiOperation("查看全部订单")
    public Object getAllOrders(){return new Object();}

    @GetMapping("/{user-id}/{order-id}/detail")
    @ApiOperation("查看指定订单详情")
    public Object getOrderDetail(){return new Object();}

    @PostMapping("/{user-id}/{order-id}/creation}")
    @ApiOperation("创建订单")
    public Object createOrder(){return new Object();}

    @PatchMapping("/{user-id}/{order-id}/cancellation")
    @ApiOperation("取消订单")
    public Object cancelOrder(){return new Object();}

    @PostMapping("/{user-id}/{order-id}/wx-advance-payment")
    @ApiOperation("创建微信预支付订单")
    public Object createWXAdvancePaymentOrder(){return new Object();}

    @PatchMapping("/{user-id}/{order-id}/confirmation")
    @ApiOperation("确认收货")
    public Object confirmOrder(){return new Object();}

    @PatchMapping("/{user-id}/{order-id}/deletion")
    @ApiOperation("删除订单")
    public Object deleteOrder(){return new Object();}

    @PatchMapping("/{user-id}/{order-id}/refund")
    @ApiOperation("申请退款")
    public Object refundOrder(){return new Object();}

    @GetMapping("/{user-id}/x-comment")
    @ApiOperation("查看待评价商品")
    public Object getNotCommentYetOrder(){return new Object();}

    @PostMapping("/{user-id}/{order-id}/comment")
    @ApiOperation("评价订单")
    public Object commentOrder(){return new Object();}
}
