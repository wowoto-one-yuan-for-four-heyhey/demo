package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public Object addBrand(@ApiParam(name="brand",value="品牌信息",required=true)  Object brand) {return new Object();}

    @DeleteMapping("brands/{id}")
    @ApiOperation("删除品牌")
    public Object deleteBrand(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new Object();}

    @PutMapping("brands/{brandId}")
    @ApiOperation("修改品牌信息")
    public Object updateBrand(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new Object();}


    /*
     * @category
     */
    @PostMapping("categories")
    @ApiOperation(value = "添加分类")
    public Object addCategory(@ApiParam(name="categotry",value="分类信息",required=true)  Object category){ return new Object(); }

    @DeleteMapping("categories/{id}")
    @ApiOperation(value = "删除特定分类")
    public Object deleteCategory(@ApiParam(name="id",value="分类ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @PutMapping("categories/{id}")
    @ApiOperation(value = "修改特定分类")
    public Object updateCategory(@ApiParam(name="id",value="分类ID",required=true) @PathVariable("id") String id){ return new Object(); }

    /*
     * @coupon
     */
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则")
    public ArrayList<Object> getAllCouponRules(){ return new ArrayList<>(); }

    @GetMapping("coupon-rules/search")
    @ApiOperation("搜索优惠券规则")
    public ArrayList<Object> searchCouponRules(@ApiParam(name="name",value="优惠券名字")  String name,@ApiParam(name="couponStatus",value="优惠券状态",required=true)  String couponStatus){ return new ArrayList<>(); }

    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则")
    public Object addCouponRule(@ApiParam(name="couponRule",value="优惠券规则详细",required=true)  Object couponRule){ return new Object();}

    @DeleteMapping("coupon-rules/{id}")
    @ApiOperation("删除优惠券规则")
    public boolean deleteCouponRule(@ApiParam(name="id",value="优惠券规则ID",required=true) @PathVariable("id") String id){ return true;}

    @PutMapping("coupon-rules/{id}")
    @ApiOperation("修改优惠券规则信息")
    public Object updateCouponRule(@ApiParam(name="id",value="优惠券规则ID",required=true) @PathVariable("id") String id){return new Object(); }


    /*
     * @goods
     */
    @PostMapping("goods")
    @ApiOperation(value = "添加商品")
    public Object addGoods(@ApiParam(name="goods",value="商品信息",required=true) Object goods){ return new Object(); }

    @DeleteMapping("goods/{id}")
    @ApiOperation(value = "删除商品")
    public Object deleteGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @PutMapping("goods/{goodsId}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id,@ApiParam(name="goods",value="商品信息",required=true)  Object goods){ return new Object(); }

    @PostMapping("goods/{id}/specification/")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id,@ApiParam(name="goodsSpecification",value="商品规格信息",required=true)  Object goodsSpecification){ return new Object(); }

    @DeleteMapping("goods/{goodsId}/specification/{specificationId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId,@ApiParam(name="specificationId",value="商品规格ID",required=true) @PathVariable("specificationId") String specificationId){ return new Object(); }

    @PutMapping("goods/{goodsId}/specification/{specificationId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId,@ApiParam(name="specificationId",value="商品规格ID",required=true) @PathVariable("specificationId") String specificationId){ return new Object(); }

    @GetMapping("goods/comments")
    @ApiOperation(value = "查看所有商品评论")
    public ArrayList<Object> getAllGoodsComments(){return new ArrayList<>();}

    @GetMapping("goods/comments/search")
    @ApiOperation(value = "搜索商品评论")
    public ArrayList<Object> searchGoodsComments(@ApiParam(name="userId",value="用户ID")  String userId,@ApiParam(name="goodsId",value="商品ID")  String goodsId){return new ArrayList<>();}

    @PostMapping("goods/comments/{id}")
    @ApiOperation(value = "回复商品评论")
    public Object replyGoodsComments(@ApiParam(name="commentId",value="评论ID") @PathVariable("id") String id){ return new Object();}

    @DeleteMapping("goods/comments/{id}")
    @ApiOperation(value = "删除商品评论")
    public boolean deleteGoodsComments(@ApiParam(name="id",value="评论ID") @PathVariable("id")  String id){return true; }

    @PostMapping("pre-sale-goods")
    @ApiOperation(value = "添加预售商品")
    public Object addPreSaleGoods(@ApiParam(name="preSalesGoods",value="预售商品信息")  Object preSalesGoods){ return new Object(); }

    @DeleteMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "删除预售商品")
    public Object deletePreSaleGoods(@ApiParam(name="preSalesGoods",value="预售商品ID") @PathVariable("id")  String id){ return new Object(); }

    @PutMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "修改预售商品信息")
    public Object updatePreSaleGoods(@ApiParam(name="preSalesGoods",value="预售商品ID")   @PathVariable("id")String id,@ApiParam(name="preSalesGoods",value="预售商品信息")  Object preSalesGoods){ return new Object(); }

    /*
    * 订单管理
    * */

    @GetMapping("orders/search")
    @ApiOperation(value = "根据用户ID、订单ID、订单状态等信息查询所有订单")
    public ArrayList<Object> getSearchGoods(@ApiParam(name="userId",value="用户ID")  Object userId,@ApiParam(name="orderId",value="订单ID")  Object id,@ApiParam(name="status",value="订单状态")  String status){return new ArrayList<>();}

    @PutMapping("orders/{id}")
    @ApiOperation(value = "修改特定订单")
    public Object updateOrder(@ApiParam(name="id",value="订单ID")  @PathVariable("id") Object orderId,@ApiParam(name="order",value="订单信息")  Object order){return new Object();}

    @DeleteMapping("orders/{id}")
    @ApiOperation(value = "删除特定订单")
    public Object deleteOrder(@ApiParam(name="id",value="订单ID")   @PathVariable("id")String id){return new Object();}


    /*
    团购规则管理
     */

    @PostMapping("grouponRule")
    @ApiOperation(value = "添加团购规则")
    public Object addGrouponRule(@ApiParam(name="grouponRule",value="团购规则信息")   Object grouponRule){ return new Object(); }

    @PostMapping("goods/{goodsId}/grouponRule/{grouponRuleId}")
    @ApiOperation(value = "为某个商品添加/修改团购规则")
    public Object addGrouponRuleForGoods(@ApiParam(name="goodsid",value="商品ID")  @PathVariable("goodsId") String goodsId,@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId){ return new Object(); }

    @DeleteMapping("grouponRule/{grouponRuleId}")
    @ApiOperation(value = "删除团购活动")
    public boolean deleteRuleForGoods(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId){ return true; }

    @PutMapping("grouponRule/{grouponRuleId}")
    @ApiOperation(value = "修改某个团购规则")
    public Object updateRuleForGoods(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId,@ApiParam(name="grouponRule",value="团购规则信息")   Object grouponRule){ return new Object(); }


    /*
     * 分享规则管理
     */

    @GetMapping("shareRules")
    @ApiOperation("查看所有分享活动规则")
    public ArrayList<Object> getAllShareRules(){ return new ArrayList<>(); }

    @PostMapping("shareRules")
    @ApiOperation("添加分享活动规则")
    public Object addShareRules(@ApiParam(name="shareRule",value="分享规则信息")   Object shareRule){ return new Object(); }

    @PostMapping("goods/shareRules")
    @ApiOperation("为某个商品添加/修改分享活动规则")
    public Object addShareRulesForGoods(@ApiParam(name="goodsid",value="商品ID")  @PathVariable("goodsId") String goodsId,@ApiParam(name="shareRuleId",value="分享规则ID")  @PathVariable("shareRuleId") String shareRuleId){ return new Object(); }

    @DeleteMapping("shareRules/{id}")
    @ApiOperation("删除分享活动规则")
    public boolean deleteShareRules(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String shareRuleId){ return true; }

    @PutMapping("shareRules/{id}")
    @ApiOperation("修改某个分享活动规则")
    public Object updateShareRules(@ApiParam(name="id",value="分享规则ID")  @PathVariable("id") String shareRuleId,@ApiParam(name="shareRule",value="分享规则信息")   Object shareRule){ return new Object(); }

    /*
    话题操作
    * */

    @PostMapping("topics/search")
    @ApiOperation("搜索专题")
    public ArrayList<Object> searchTopic(@ApiParam(name="name",value="专题标题")   String name){ return new ArrayList<>();}

    @PostMapping("topics")
    @ApiOperation("添加专题")
    public Object addTopic(@ApiParam(name="topic",value="专题信息")   Object topic){return new Object(); }

    @DeleteMapping("topic/{id}")
    @ApiOperation("删除专题")
    public boolean deleteTopic(@ApiParam(name="id",value="专题ID")  @PathVariable("id") String id){return true; }

    @PatchMapping("topic/{id}")
    @ApiOperation("修改专题信息")
    public Object updateTopic(@ApiParam(name="id",value="专题ID")  @PathVariable("id") String id,@ApiParam(name="topic",value="专题信息")   Object topic){ return new Object();}

    /*
    * 用户信息操作
    * */

    @GetMapping("users")
    @ApiOperation("查看所有用户信息")
    public ArrayList<Object> getAllUsersList(){ return new ArrayList<>(); }

    @GetMapping("users/{id}")
    @ApiOperation("查看特定用户信息")
    public Object getUsersList(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id){ return new Object(); }

    @GetMapping("users/search")
    @ApiOperation("搜索用户")
    public ArrayList<Object> searchUsersInfo(@ApiParam(name="userName",value="用户名")  String userName,@ApiParam(name="phone",value="电话号码")  String phone){ return new ArrayList<>(); }

    @PostMapping("users")
    @ApiOperation("添加用户")
    public Object createUser(@ApiParam(name="user",value="用户信息") Object user){ return new Object(); }

    @DeleteMapping("users/{id}")
    @ApiOperation("删除用户")
    public boolean deleteUser(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id){ return true; }

    @PutMapping("users/{userId}")
    @ApiOperation("修改用户信息")
    public Object updateUserInfo(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id,@ApiParam(name="user",value="用户信息") Object user){return new Object();  }

    /*
     * 地址操作
     * */

    @GetMapping("address/search")
    @ApiOperation("搜索收货地址")
    public ArrayList<Object> searchAddress(@ApiParam(name="id",value="用户ID")  String id,@ApiParam(name="name",value="收货人姓名")   String name){ return new ArrayList<>(); }

    /*
     * 收藏操作
     * */

    @GetMapping("collection/search")
    @ApiOperation("搜索会员收藏")
    public ArrayList<Object> searchCollection(@ApiParam(name="userId",value="用户ID")String userId,@ApiParam(name="goodsId",value="商品ID")String goodsId){ return new ArrayList<>(); }

    /*
     * 足迹操作
     * */

    @GetMapping("footprint/search")
    @ApiOperation("搜索会员足迹")
    public ArrayList<Object> searchFootprint(@ApiParam(name="userId",value="用户ID")String userId,@ApiParam(name="goodsId",value="商品ID")String goodsId){ return new ArrayList<>(); }

    /*
    * 广告操作
    * */

    @GetMapping("ads")
    @ApiOperation("查看所有广告信息")
    public ArrayList<Object> getAllAds(){ return new ArrayList<>(); }

    @GetMapping("ads/search")
    @ApiOperation("搜索广告信息")
    public ArrayList<Object> searchAds(@ApiParam(name="title",value="广告标题")String title,@ApiParam(name="content",value="广告内容")String content){ return new ArrayList<>(); }

    @PostMapping("ads")
    @ApiOperation("添加广告信息")
    public Object createAds(@ApiParam(name="ad",value="广告信息")Object ad){ return new Object(); }

    @DeleteMapping("ads/{id}")
    @ApiOperation("删除广告信息")
    public boolean deleteAds(@ApiParam(name="id",value="广告ID")  @PathVariable("id") String id){ return true; }

    @PutMapping("ads/{adId}")
    @ApiOperation("修改广告信息")
    public Object updateAds(@ApiParam(name="id",value="广告ID")  @PathVariable("id") String id,@ApiParam(name="ad",value="广告信息")Object ad){ return new Object(); }

    /*
     * 管理员操作
     * */

    @GetMapping("admins")
    @ApiOperation("查看所有管理员")
    public ArrayList<Object>  getAllAdmins(){ return new ArrayList<>();  }

    @PostMapping("admins")
    @ApiOperation("添加管理员")
    public Object addAdmin(@ApiParam(name="admin",value="管理员信息")Object admin){ return new Object(); }

    @GetMapping("admins/{id}")
    @ApiOperation("查看特定管理员")
    public Object getAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id){ return new Object(); }

    @DeleteMapping("admins/{id}")
    @ApiOperation("删除管理员")
    public boolean deleteAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id){ return true; }

    @PutMapping("admins/{id}")
    @ApiOperation("编辑管理员")
    public Object updateAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id,@ApiParam(name="admin",value="管理员信息")Object admin){return new Object();  }
}
