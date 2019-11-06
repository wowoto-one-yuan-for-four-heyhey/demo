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
    @PostMapping("shares/{goodsId}")
    @ApiOperation("新建分享活动")
    public Object addShare(){ return new Object(); }
    @PostMapping("shares/{shareId}")
    @ApiOperation("参与分享活动")
    public Object participantShare(){ return new Object(); }
}





