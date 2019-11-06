package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"订单操作接口"})
@RestController
@RequestMapping("")
public class OrderController {

    /*
     * 订单
     */
    @GetMapping("orders")
    @ApiOperation("查看用户的全部订单")
    public Object getOrders(){return new Object();}


    @GetMapping("orders/{orderId}")
    @ApiOperation("查看特定订单的订单详情")
    public Object getOrderDetail(){return new Object();}

    @DeleteMapping("orders/{orderId}")
    @ApiOperation("删除订单")
    public Object deleteOrder(){return new Object();}

    /*
     * 状态
     */
    @PostMapping("orders")
    @ApiOperation("添加订单")
    public Object addOrder(){return new Object();}

    @PostMapping("orders/{orderId}/payment")
    @ApiOperation("支付订单")
    public Object payOrder(){return new Object();}

    @PostMapping("orders/{orderId}/confirmation")
    @ApiOperation("确认收货订单")
    public Object confirmOrder(){return new Object();}

    @PostMapping("orders/{orderId}/cancellation")
    @ApiOperation("取消订单")
    public Object cancelOrder(){return new Object();}

    @PostMapping("orders/{orderId}/customerService")
    @ApiOperation("订单售后服务")
    public Object customerServiceOrder(){return new Object();}

/*

    *//*
     * 分单
     *//*
    @GetMapping("{orderId}/suborders")
    @ApiOperation("查看特定订单的所有分单")
    public Object getAllSuborders(){return new Object();}

    @GetMapping("{orderId}/suborders/{suborderId}")
    @ApiOperation("查看特定订单的特定分单")
    public Object getOneSuborder(){return new Object();}

    @PostMapping("{orderId}/suborders")
    @ApiOperation("添加分单")
    public Object addSuborder(){return new Object();}

    @DeleteMapping("{orderId}/suborders/{suborderId}")
    @ApiOperation("删除分单")
    public Object deleteSuborder(){return new Object();}

    @PutMapping("{orderId}/suborders/{suborderId}")
    @ApiOperation("修改分单信息")    // 取消订单，申请退款，确认收货
    public Object updateSubOrder(){return new Object();}

*/

}
