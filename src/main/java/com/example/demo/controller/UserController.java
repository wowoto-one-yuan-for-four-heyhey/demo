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
    @ApiOperation("获得自己的地址")
    public ArrayList<Object> getUserAddress(){ return new ArrayList<Object>(); }
    @PostMapping("addresses")
    @ApiOperation("添加地址")
    public Object createAddress(@ApiParam(name="address",value="地址",required=true)Object address) { return new Object(); }
    @DeleteMapping("addresses/{addressId}")
    @ApiOperation("删除地址")
    public boolean deleteAddress(@ApiParam(name="addressId",value="地址ID",required=true) @PathVariable("addressId") String addressId){ return true; }
    @PutMapping("address/{addressId}")
    @ApiOperation("修改地址信息")
    public Object updateAddress(@ApiParam(name="addressId",value="地址ID",required=true) @PathVariable("addressId") String addressId,@ApiParam(name="newAddress",value="新地址",required=true) String newAddress){ return new Object(); }

    /*
     * 收藏
     */
    @GetMapping("collections")
    @ApiOperation("查看所有收藏")
    public ArrayList<Object> getCollections(){ return new ArrayList<Object>(); }
    @PostMapping("collections/{goodsId}")
    @ApiOperation("添加收藏")
    public Object addCollections(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @DeleteMapping("collections/{collectionId}")    // collectionId <-> goodId
    @ApiOperation("删除收藏")
    public boolean deleteCollection(@ApiParam(name="collectionId",value="收藏ID",required=true) @PathVariable("collectionId") String collectionId){ return true; }

    /*
     * 足迹
     */
    @GetMapping("footprints")
    @ApiOperation("获得特定用户的足迹")
    public ArrayList<Object> getPrints(){ return new ArrayList<Object>(); }
    @PostMapping("footprints/{goodsId}")
    @ApiOperation("添加足迹")
    public Object addPrint(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @DeleteMapping("footprints/{fpId}")
    @ApiOperation("删除特定足迹")
    public boolean deletePrint(@ApiParam(name="fpId",value="足迹ID",required=true) @PathVariable("fpId") String fpId){ return true; }
    @DeleteMapping("footprints")
    @ApiOperation("删除所有足迹")
    public boolean deletePrints(){ return true;}

    /*
     * 购物车
     */
    @GetMapping("cart-items")
    @ApiOperation("查看购物车")
    public ArrayList<Object> getCartItems(){ return new ArrayList<Object>(); }
    @PostMapping("cart-items/{goodsId}")
    @ApiOperation("加入购物车")
    public Object addItem(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId){ return new Object(); }
    @DeleteMapping("cart-items/{cartItemId}")
    @ApiOperation("删除购物车中特定物品")
    public boolean getCartItem(@ApiParam(name="cartItemId",value="购物车项ID",required=true) @PathVariable("cartItemId") String cartItemId){ return true;}


    /*
     * 优惠券
     */
    @GetMapping("coupons")
    @ApiOperation("查看所有优惠券")
    public ArrayList<Object> getAllCouponsInfo(){ return new ArrayList<Object>(); }
    @GetMapping("coupons/{couponId}")
    @ApiOperation("查看特定优惠券信息")
    public Object getOneCouponInfo(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable("couponId") String couponId){ return new Object(); }
    @PostMapping("coupons")
    @ApiOperation("领取优惠券")
    public Object addCoupon(@ApiParam(name="coupon",value="优惠券",required=true)Object coupon){ return new Object(); }

    /*
     * 分享活动
     */
    @GetMapping("shares")
    @ApiOperation("查看所有分享活动")
    public ArrayList<Object> getAllShares(){ return new ArrayList<Object>(); }
    @GetMapping("shares/{id}")
    @ApiOperation("查看特定分享活动")
    public Object getOneShare(@ApiParam(name="sharesId",value="分享活动id",required=true)@PathVariable("sharesId")String sharesId) { return new Object(); }
    @PostMapping("shares/creation/{goodsId}")
    @ApiOperation("新建分享活动")
    public Object addShare(){ return new Object(); }
    @PostMapping("shares/participation/{shareId}")
    @ApiOperation("参与分享活动")
    public Object participantShare(){ return new Object(); }


    /*
     * 分类
     */


    @GetMapping("categories/{categoryId}/subcategories/{subcategoryId}/goods")
    @ApiOperation("查看指定类别下的商品")
    public Object getGoodsBySubcategoryId(){return new Object();}


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
    public Object getOrders(){return new Object();}

    @GetMapping("orders/{orderId}")
    @ApiOperation("查看特定订单的订单详情")
    public Object getOrderDetail(){return new Object();}

    /*
     * 状态
     */
    @PostMapping("orders")
    @ApiOperation("发起订单")
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
    @ApiOperation("发起一项订单售后服务")
    public Object addOrderCustomerService(){return new Object();}

    @GetMapping("orders/{orderId}/customerService")
    @ApiOperation("查看订单下的对应售后服务")
    public Object getOrderCustomerService(){return new Object();}

    @PostMapping("orders/{orderId}/customerService/{customerServiceId}")
    @ApiOperation("发起一项订单售后服务")
    public Object updateOrderCustomerService(){return new Object();}

    /*
     * 评论
     */

    @PostMapping("goods/{id}/comments")
    @ApiOperation("添加评论")
    public Object addComment(){return new Object();}

    @GetMapping("goods/{id}/comments")
    @ApiOperation("查看评论")
    public Object getComment(){return new Object();}

    @GetMapping("topics/{topicId}/comments")
    @ApiOperation("查看特定专题的评论")
    public void getCommentsByTopicId(){ }

    @PostMapping("topics/{topicId}/comments")
    @ApiOperation("添加特定专题的评论")
    public void addTopicComment(){ }

    @DeleteMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题的特定评论")
    public void deleteOneComment(){ }

    @PutMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("修改特定专题的特定评论")
    public void updateComment(){ }

}





