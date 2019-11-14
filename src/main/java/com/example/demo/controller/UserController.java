package com.example.demo.controller;


import com.example.demo.model.Address;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("")
public class UserController {

    /*
     * 地址
     */
    @GetMapping("addresses")
    @ApiOperation("获得自己的地址")
    public Object getUserAddress(){ return new Object(); }
    @PostMapping("addresses")
    @ApiOperation("添加地址")
    public Object createAddress() { return new Object(); }
    @DeleteMapping("addresses/{addressId}")
    @ApiOperation("删除地址")
    public Object deleteAddress(){ return new Object(); }
    @PutMapping("address/{addressId}")
    @ApiOperation("修改地址信息")
    public Object updateAddress(){ return new Object(); }

    /*
     * 收藏
     */
    @GetMapping("collections")
    @ApiOperation("查看所有收藏")
    public Object getCollections(){ return new Object(); }
    @PostMapping("collections/{goodsId}")
    @ApiOperation("添加收藏")
    public Object addCollections(){ return new Object(); }
    @DeleteMapping("collections/{collectionId}")    // collectionId <-> goodId
    @ApiOperation("删除收藏")
    public Object deleteCollection(){ return new Object(); }

    /*
     * 足迹
     */
    @GetMapping("footprints")
    @ApiOperation("获得特定用户的足迹")
    public Object getPrints(){ return new Object(); }
    @PostMapping("footprints/{goodsId}")
    @ApiOperation("添加足迹")
    public Object addPrint(){ return new Object(); }
    @DeleteMapping("footprints/{fpId}")
    @ApiOperation("删除特定足迹")
    public Object deletePrint(){ return new Object(); }
    @DeleteMapping("footprints")
    @ApiOperation("删除所有足迹")
    public Object deletePrints(){ return new Object();}

    /*
     * 购物车
     */
    @GetMapping("cart-items")
    @ApiOperation("查看购物车")
    public Object getCartItems(){ return new Object(); }
    @PostMapping("cart-items/{goodsId}")
    @ApiOperation("加入购物车")
    public Object addItem(){ return new Object(); }
    @DeleteMapping("cart-items/{cartItemId}")
    @ApiOperation("删除购物车中特定物品")
    public Object getCartItem(){ return new Object();}


    /*
     * 优惠券
     */
    @GetMapping("coupons")
    @ApiOperation("查看所有优惠券")
    public void getAllCouponsInfo(){ return ; }
    @GetMapping("coupons/{couponId}")
    @ApiOperation("查看特定优惠券信息")
    public void getOneCouponInfo(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }
    @PostMapping("coupons")
    @ApiOperation("领取优惠券")
    public void addCoupon(){ return ; }

    /*
     * 分享活动
     */
    @GetMapping("shares")
    @ApiOperation("查看所有分享活动")
    public Object getAllShares(){ return new Object(); }
    @GetMapping("shares/{id}")
    @ApiOperation("查看特定分享活动")
    public Object getOneShare() { return new Object(); }
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

    @DeleteMapping("orders/{orderId}")
    @ApiOperation("删除订单")
    public Object deleteOrder(){return new Object();}

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
    public Object addCustomerServiceOrder(){return new Object();}

    @GetMapping("orders/{orderId}/customerService")
    @ApiOperation("查看订单下的对应售后服务")
    public Object getCustomerServiceOrder(){return new Object();}

    /*
     * 评论
     */

    @PostMapping("goods/{id}/comments")
    @ApiOperation("添加评论")
    public Object addComment(){return new Object();}

    @GetMapping("goods/{id}/comments")
    @ApiOperation("查看评论")
    public Object getComment(){return new Object();}

    @GetMapping("{topicId}/comments")
    @ApiOperation("查看特定专题的评论")
    public void getCommentsByTopicId(){ }

    @PostMapping("{topicId}/comments")
    @ApiOperation("添加特定专题的评论")
    public void addTopicComment(){ }

    @DeleteMapping("{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题的特定评论")
    public void deleteOneComment(){ }

    @PutMapping("{topicId}/comments/{commentId}")
    @ApiOperation("修改特定专题的特定评论")
    public void updateComment(){ }

}





