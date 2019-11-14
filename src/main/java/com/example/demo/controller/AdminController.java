package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
@RequestMapping("")
public class AdminController {

    /*
     * @brand
     */
    @PostMapping("")
    @ApiOperation("添加品牌")
    public Object addBrand(){return new Object();}

    @DeleteMapping("{brandId}")
    @ApiOperation("删除品牌")
    public Object deleteBrand(){return new Object();}

    @PutMapping("{brandId}")
    @ApiOperation("修改品牌信息")
    public Object updateBrand(){return new Object();}


    /*
     * @category
     */
    @PostMapping("")
    @ApiOperation(value = "添加一级分类")
    public Object addCategory(){ return new Object(); }

    @DeleteMapping("{categoryId}")
    @ApiOperation(value = "删除特定一级分类")
    public Object deleteCategory(){ return new Object(); }

    @PutMapping("{categoryId}")
    @ApiOperation(value = "修改特定一级分类")
    public Object updateCategory(){ return new Object(); }

    @PostMapping("{categoryId}/subcategories")
    @ApiOperation(value = "添加特定一级分类下二级分类")
    public Object addSubCategory(){ return new Object(); }

    @DeleteMapping("{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "删除特定一级分类下特定二级")
    public Object deleteSubCategory(){ return new Object(); }

    @PutMapping("{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "修改特定一级分类下二级分类")
    public Object updateSubCategory(){ return new Object(); }

    /*
     * @coupon
     */
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则")
    public void getAllCouponRules(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }

    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则")
    public void addCouponRule(){ return ; }

    @DeleteMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("删除优惠券规则")
    public void deleteCouponRule(){ return ; }

    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("修改优惠券规则信息")
    public void updateCouponRule(){ return ; }


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

    @PostMapping("products/")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(String GoodsId){ return new Object(); }

    @DeleteMapping("products/{productId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(){ return new Object(); }

    @PutMapping("products/{productId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(){ return new Object(); }

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




    @PostMapping("")
    @ApiOperation("添加专题")
    public void addTopic(){ }

    @DeleteMapping("{topicId}")
    @ApiOperation("删除专题")
    public void deleteTopic(){ }

    @PatchMapping("{topicId}")
    @ApiOperation("修改专题信息")
    public void updateTopic(){ }


    @GetMapping("")
    @ApiOperation("查看所有用户信息")
    public Object getAllUsersInfo(){ return new Object(); }

    @GetMapping("/{userId}")
    @ApiOperation("查看特定用户信息")
    public Object getOneUserInfo(){ return new Object(); }

    @PostMapping("")
    @ApiOperation("添加用户")
    public Object createUser(){ return new Object(); }

    @DeleteMapping("/{userId}")
    @ApiOperation("删除用户")
    public Object deleteUser(){ return new Object(); }

    @PutMapping("/{userId}")
    @ApiOperation("修改用户信息")
    public Object updateUserInfo(){ return new Object(); }




}
