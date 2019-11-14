package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="AdminController",tags={"管理员操作接口"})
@RestController
@RequestMapping("")
public class AdminController {

    /*
     * @brand
     */
    @PostMapping("brands/search")
    @ApiOperation("搜索品牌")
    public Object searchBrand(){return new Object();}

    @PostMapping("brands")
    @ApiOperation("添加品牌")
    public Object addBrand(){return new Object();}

    @DeleteMapping("brands/{brandId}")
    @ApiOperation("删除品牌")
    public Object deleteBrand(){return new Object();}

    @PutMapping("brands/{brandId}")
    @ApiOperation("修改品牌信息")
    public Object updateBrand(){return new Object();}


    /*
     * @category
     */
    @PostMapping("categories")
    @ApiOperation(value = "添加分类")
    public Object addCategory(){ return new Object(); }

    @DeleteMapping("categories/{categoryId}")
    @ApiOperation(value = "删除特定分类")
    public Object deleteCategory(){ return new Object(); }

    @PutMapping("categories/{categoryId}")
    @ApiOperation(value = "修改特定分类")
    public Object updateCategory(){ return new Object(); }

    /*
     * @coupon
     */
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则")
    public void getAllCouponRules(){  }

    @GetMapping("coupon-rules/search")
    @ApiOperation("搜索优惠券规则")
    public void searchCouponRules(){  }

    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则")
    public void addCouponRule(){ }

    @DeleteMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("删除优惠券规则")
    public void deleteCouponRule(){ }

    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("修改优惠券规则信息")
    public void updateCouponRule(){ }


    /*
     * @goods
     */
    @PostMapping("goods")
    @ApiOperation(value = "添加商品")
    public Object addGoods(){ return new Object(); }

    @DeleteMapping("goods/{goodsId}")
    @ApiOperation(value = "删除商品")
    public Object deleteGoods(){ return new Object(); }

    @PutMapping("goods/{goodsId}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(){ return new Object(); }

    @PostMapping("goods/{goodsId}/products/")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(String GoodsId){ return new Object(); }

    @DeleteMapping("goods/{goodsId}/products/{productId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(){ return new Object(); }

    @PutMapping("goods/{goodsId}/products/{productId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(){ return new Object(); }

    @GetMapping("goods/comments")
    @ApiOperation(value = "查看所有商品评论")
    public void getAllGoodsComments(){ }

    @GetMapping("goods/comments/search")
    @ApiOperation(value = "搜索商品评论")
    public void searchGoodsComments(){ }

    @PostMapping("goods/comments/{commentId}")
    @ApiOperation(value = "回复商品评论")
    public void replyGoodsComments(){ }

    @DeleteMapping("goods/comments/{commentId}")
    @ApiOperation(value = "删除商品评论")
    public void deleteGoodsComments(){ }

    @PostMapping("pre-sale-goods")
    @ApiOperation(value = "添加预售商品")
    public Object addPreSaleGoods(){ return new Object(); }

    @DeleteMapping("pre-sale-goods/{goodsId}")
    @ApiOperation(value = "删除预售商品")
    public Object deletePreSaleGoods(){ return new Object(); }

    @PutMapping("pre-sale-goods/{goodsId}")
    @ApiOperation(value = "修改预售商品信息")
    public Object updatePreSaleGoods(){ return new Object(); }

    /*
    * 订单管理
    * */

    @GetMapping("orders/search")
    @ApiOperation(value = "根据用户ID、订单ID、订单状态等信息查询所有订单")
    public Object getSearchGoods(){return new Object();}

    @PutMapping("orders/{orderId}")
    @ApiOperation(value = "修改特定订单")
    public Object updateOrder(){return new Object();}

    @DeleteMapping("orders/{orderId}")
    @ApiOperation(value = "删除特定订单")
    public Object deleteOrder(){return new Object();}


    /*
    团购规则管理
     */

    @PostMapping("goods/{goodsId}/grouponRule")
    @ApiOperation(value = "添加团购活动")
    public Object addRuleForGoods(){ return new Object(); }

    @DeleteMapping("goods/{goodsId}/grouponRule/{grouponRuleId}")
    @ApiOperation(value = "删除团购活动")
    public Object deleteRuleForGoods(){ return new Object(); }

    @PutMapping("goods/{goodsId}/grouponRule/{grouponRuleId}")
    @ApiOperation(value = "修改团购活动")
    public Object updateRuleForGoods(){ return new Object(); }


    /*
     * 分享规则管理
     */

    @GetMapping("shareRules")
    @ApiOperation("查看所有分享活动规则")
    public Object getAllShareRules(){ return new Object(); }

    @PostMapping("shareRules")
    @ApiOperation("添加分享活动规则")
    public Object addShareRules(){ return new Object(); }

    @DeleteMapping("shareRules/{id}")
    @ApiOperation("删除分享活动规则")
    public Object deleteShareRules(){ return new Object(); }

    @PutMapping("shareRules/{id}")
    @ApiOperation("修改分享活动规则信息")
    public Object updateShareRules(@PathVariable("id") Integer id){ return new Object(); }

    /*
    话题操作
    * */

    @PostMapping("topics/search")
    @ApiOperation("搜索专题")
    public void searchTopic(){ }

    @PostMapping("topics")
    @ApiOperation("添加专题")
    public void addTopic(){ }

    @DeleteMapping("topic/{topicId}")
    @ApiOperation("删除专题")
    public void deleteTopic(){ }

    @PatchMapping("topic/{topicId}")
    @ApiOperation("修改专题信息")
    public void updateTopic(){ }

    /*
    * 用户信息操作
    * */

    @GetMapping("users")
    @ApiOperation("查看所有用户信息")
    public Object getAllUsersList(){ return new Object(); }

    @GetMapping("users/{userId}")
    @ApiOperation("查看特定用户信息")
    public Object getUsersList(){ return new Object(); }

    @GetMapping("users/search")
    @ApiOperation("搜索用户信息")
    public Object searchUsersInfo(){ return new Object(); }

    @PostMapping("users")
    @ApiOperation("添加用户")
    public Object createUser(){ return new Object(); }

    @DeleteMapping("users/{userId}")
    @ApiOperation("删除用户")
    public Object deleteUser(){ return new Object(); }

    @PutMapping("users/{userId}")
    @ApiOperation("修改用户信息")
    public void updateUserInfo(){  }

    /*
     * 地址操作
     * */

    @GetMapping("address/search")
    @ApiOperation("搜索收货地址")
    public void searchAddress(){  }

    /*
     * 收藏操作
     * */

    @GetMapping("collection/search")
    @ApiOperation("搜索会员收藏")
    public void searchCollection(){  }

    /*
     * 足迹操作
     * */

    @GetMapping("footprint/search")
    @ApiOperation("搜索会员足迹")
    public void searchFootprint(){  }

    /*
    * 广告操作
    * */

    @GetMapping("ads")
    @ApiOperation("查看所有广告信息")
    public Object getAllAds(){ return new Object(); }

    @GetMapping("ads/search")
    @ApiOperation("搜索广告信息")
    public Object searchAds(){ return new Object(); }

    @PostMapping("ads")
    @ApiOperation("添加广告信息")
    public Object createAds(){ return new Object(); }

    @DeleteMapping("ads/{adId}")
    @ApiOperation("删除广告信息")
    public Object deleteAds(){ return new Object(); }

    @PutMapping("ads/{adId}")
    @ApiOperation("修改广告信息")
    public Object updateAds(){ return new Object(); }

    /*
     * 管理员操作
     * */

    @GetMapping("admins")
    @ApiOperation("查看所有管理员")
    public void getAllAdmins(){  }

    @PostMapping("admins")
    @ApiOperation("添加管理员")
    public void addAdmin(){  }

    @GetMapping("admins/{id}")
    @ApiOperation("查看特定管理员")
    public void getAdmin(){  }

    @DeleteMapping("admins/{id}")
    @ApiOperation("删除管理员")
    public void deleteAdmin(){  }

    @PutMapping("admins/{id}")
    @ApiOperation("编辑管理员")
    public void updateAdmin(){  }
}
