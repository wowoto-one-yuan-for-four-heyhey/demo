package com.example.demo.controller;

import io.swagger.annotations.*;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;


@Api(value="UserController",tags={"用户操作接口"})
@RestController
@RequestMapping("")
public class UserController {

    /*
     * 地址
     */
    @GetMapping("addresses")
    @ApiOperation("获得用户的地址")
    public ArrayList<Object> getUserAddress(){ return new ArrayList<Object>(); }
    @PostMapping("addresses")
    @ApiOperation("添加地址")
    public Object createAddress(@ApiParam(name="address",value="地址",required=true)Object address) { return new Object(); }
    @DeleteMapping("addresses/{id}")
    @ApiOperation("删除地址")
    public boolean deleteAddress(@ApiParam(name="id",value="地址ID",required=true) @PathVariable("id") String id){ return true; }
    @PutMapping("address/{id}")
    @ApiOperation("修改地址信息")
    public Object updateAddress(@ApiParam(name="id",value="地址ID",required=true) @PathVariable("id") String id,@ApiParam(name="newAddress",value="新地址",required=true) String newAddress){ return new Object(); }

    /*
     * 收藏
     */
    @GetMapping("collections")
    @ApiOperation("查看用户的所有收藏")
    public ArrayList<Object> getCollections(){ return new ArrayList<Object>(); }
    @PostMapping("collections/{id}")
    @ApiOperation("添加收藏")
    public Object addCollections(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @DeleteMapping("collections/{id}")    // collectionId <-> goodId
    @ApiOperation("删除收藏")
    public boolean deleteCollection(@ApiParam(name="id",value="收藏ID",required=true) @PathVariable("id") String id){ return true; }

    /*
     * 足迹
     */
    @GetMapping("footprints")
    @ApiOperation("获得用户的足迹")
    public ArrayList<Object> getPrints(){ return new ArrayList<Object>(); }
    @PostMapping("footprints/{id}")
    @ApiOperation("添加足迹")
    public Object addPrint(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @DeleteMapping("footprints/{id}")
    @ApiOperation("删除特定足迹")
    public boolean deletePrint(@ApiParam(name="id",value="足迹ID",required=true) @PathVariable("id") String id){ return true; }
    @DeleteMapping("footprints")
    @ApiOperation("删除所有足迹")
    public boolean deletePrints(){ return true;}

    /*
     * 购物车
     */
    @GetMapping("cart-items")
    @ApiOperation("查看用户的购物车")
    public ArrayList<Object> getCartItems(){ return new ArrayList<Object>(); }
    @PostMapping("cart-items/{id}")
    @ApiOperation("加入购物车")
    public Object addItem(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @DeleteMapping("cart-items/{id}")
    @ApiOperation("删除购物车中特定物品")
    public boolean getCartItem(@ApiParam(name="id",value="购物车项ID",required=true) @PathVariable("id") String id){ return true;}


    /*
     * 优惠券
     */
    @GetMapping("coupons")
    @ApiOperation("查看用户的所有优惠券")
    public ArrayList<Object> getAllCouponsInfo(){ return new ArrayList<Object>(); }
    @GetMapping("coupons/{id}")
    @ApiOperation("查看特定优惠券信息")
    public Object getOneCouponInfo(@ApiParam(name="id",value="优惠券id",required=true) @PathVariable("id") String id){ return new Object(); }
    @PostMapping("coupons")
    @ApiOperation("领取优惠券")
    public Object addCoupon(@ApiParam(name="coupon",value="优惠券",required=true)Object coupon){ return new Object(); }

    /*
     * 分享活动
     */
    @GetMapping("shareItems")
    @ApiOperation("查看用户的所有分享活动")
    public ArrayList<Object> getAllShareItems(){ return new ArrayList<Object>(); }
    @GetMapping("shareItems/{id}")
    @ApiOperation("查看特定分享活动")
    public Object getOneShareItem(@ApiParam(name="id",value="分享活动id",required=true)@PathVariable("id")String id) { return new Object(); }
    @PostMapping("shareItems/{id}/creation")
    @ApiOperation("新建分享活动")
    public Object addShareItem(@ApiParam(name="id",value="商品id",required=true)@PathVariable("id")String id){ return new Object(); }
    @PostMapping("shareItems/{id}/participation")
    @ApiOperation("参与分享活动")
    public Object participantShareItem(@ApiParam(name="id",value="分享id",required=true)@PathVariable("id")String id){ return new Object(); }


    /*
     * 分类
     */


    @GetMapping("categories/{id}/goods")
    @ApiOperation("查看指定类别下的商品")
    public ArrayList<Object> getGoodsBySubcategoryId(@ApiParam(name="id",value="类别id",required=true)@PathVariable("id")String id){return new ArrayList<Object>();}


    /*
     * 商品规格
     */

    /*
    @GetMapping("goods/{id}/specification")
    @ApiOperation(value = "查看特定商品的的所有规格信息")
    public Object getAllSpecificationsByGoodsId(){ return new Object(); }
    @GetMapping("goods/{id}/specifications/{specificationId}")
    @ApiOperation(value = "查看特定商品的的特定规格信息")
    public Object getOneSpecificationsByGoodsId(){ return new Object(); }

     */


    /*
     * 订单
     */
    @GetMapping("orders")
    @ApiOperation("查看用户的全部订单")
    public ArrayList<Object> getOrders(){return new ArrayList<Object>();}

    @GetMapping("orders/{id}")
    @ApiOperation("查看特定订单的订单详情")
    public Object getOrderDetail(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    /*
     * 状态
     */
    @PostMapping("orders")
    @ApiOperation("发起订单")
    public Object addOrder(@ApiParam(name="order",value="新订单",required=true)Object newObject){return new Object();}

    @PostMapping("orders/{id}/payment")
    @ApiOperation("支付订单")
    public Object payOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/confirmation")
    @ApiOperation("确认收货订单")
    public Object confirmOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/cancellation")
    @ApiOperation("取消订单")
    public Object cancelOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/customerService")
    @ApiOperation("发起一项订单售后服务")
    public Object addOrderCustomerService(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @GetMapping("orders/{id}/customerService")
    @ApiOperation("查看订单下的对应售后服务")
    public Object getOrderCustomerService(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PutMapping("orders/{orderId}/customerService/{customerServiceId}")
    @ApiOperation("推进一项订单售后服务")
    public Object updateOrderCustomerService(@ApiParam(name="orderId",value="订单id",required=true)@PathVariable("orderId")String orderId,@ApiParam(name="customerServiceId",value="售后id",required=true)@PathVariable("customerServiceId")String customerServiceId){return new Object();}

    /*
     * 评论
     */

    @PostMapping("goods/{id}/comments")
    @ApiOperation("添加评论")
    public Object addComment(@ApiParam(name="id",value="商品id",required=true)@PathVariable("id")String id){return new Object();}

    @GetMapping("goods/{id}/comments")
    @ApiOperation("查看评论")
    public ArrayList<Object> getComment(@ApiParam(name="id",value="商品id",required=true)@PathVariable("id")String id){return new ArrayList<Object>();}

    @GetMapping("topics/{id}/comments")
    @ApiOperation("查看特定专题的评论")
    public ArrayList<Object> getCommentsByTopicId(@ApiParam(name="id",value="话题id",required=true)@PathVariable("id")String id){ return new ArrayList<Object>(); }

    @PostMapping("topics/{id}/comments")
    @ApiOperation("添加特定专题的评论")
    public Object addTopicComment(@ApiParam(name="id",value="话题id",required=true)@PathVariable("id")String id){ return new Object(); }

    @DeleteMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题的特定评论")
    public boolean deleteOneComment(@ApiParam(name="topicId",value="话题id",required=true)@PathVariable("topicId")String topicId,
                                    @ApiParam(name="commentId",value="话题id",required=true)@PathVariable("commentId")String commentId){ return true; }

    @PutMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("修改特定专题的特定评论")
    public Object updateComment(@ApiParam(name="topicId",value="话题id",required=true)@PathVariable("topicId")String topicId,
                                @ApiParam(name="commentId",value="话题id",required=true)@PathVariable("commentId")String commentId){ return new Object();}
}





