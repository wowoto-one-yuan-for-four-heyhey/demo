package com.example.demo.controller;

import com.example.demo.model.Goods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="管理员controller",tags={"管理员操作接口"})
@RestController
@RequestMapping("/admin")
public class AdminController {
    /*
     * 用户管理
     */
    @GetMapping("/users")
    @ApiOperation("查看所有用户信息")
    public Object getAllUsersInfo(){ return new Object(); }
    @GetMapping("/users/{userId}")
    @ApiOperation("查看特定用户信息")
    public Object getOneUserInfo(){ return new Object(); }
    @PostMapping("/users")
    @ApiOperation("添加用户")
    public Object createUser(){ return new Object(); }
    @DeleteMapping("/users/{userId}")
    @ApiOperation("删除用户")
    public Object deleteUser(){ return new Object(); }
    @PutMapping("/users/{userId}")
    @ApiOperation("修改用户信息")
    public Object updateUserInfo(){ return new Object(); }

    /*
     * 品牌管理
     */
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
     * 分类管理
     */
    @PostMapping("categories")
    @ApiOperation(value = "添加一级分类")
    public Object addCategory(){ return new Object(); }
    @DeleteMapping("categories/{categoryId}")
    @ApiOperation(value = "删除特定一级分类")
    public Object deleteCategory(){ return new Object(); }
    @PutMapping("categories/{categoryId}")
    @ApiOperation(value = "修改特定一级分类")
    public Object updateCategory(){ return new Object(); }

    @PostMapping("categories/{categoryId}/subcategories")
    @ApiOperation(value = "添加特定一级分类下二级分类")
    public Object addSubCategory(){ return new Object(); }
    @DeleteMapping("categories/{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "删除特定一级分类下特定二级")
    public Object deleteSubCategory(@PathVariable("id") Integer id){ return new Object(); }
    @PutMapping("categories/{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "修改特定一级分类下二级分类")
    public Object updateSubCategory(@PathVariable("id") Integer id, @RequestBody Goods goods){ return new Object(); }



    /*
     * 专题管理
     */
    @PostMapping("topics")
    @ApiOperation("添加专题")
    public void addTopic(){ }
    @DeleteMapping("topics/{topicId}")
    @ApiOperation("删除专题")
    public void deleteTopic(){ }
    @PatchMapping("topics/{topicId}")
    @ApiOperation("修改专题信息")
    public void updateTopic(){ }

    /*
     * 优惠券规则管理
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
     * 商品管理
     */
    @PostMapping("goods")
    @ApiOperation(value = "添加商品")
    public Object addGoods(){ return new Object(); }
    @DeleteMapping("goods/{id}")
    @ApiOperation(value = "删除商品")
    public Object deleteGoods(){ return new Object(); }
    @PutMapping("goods/{id}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(){ return new Object(); }
    @PostMapping("{id}/specifications")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(){ return new Object(); }
    @DeleteMapping("{id}/specifications/{specificationId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(){ return new Object(); }
    @PutMapping("{id}/specifications/{specificationId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(){ return new Object(); }
    @PostMapping("pre-sale-goods")
    @ApiOperation(value = "添加预售商品")
    public Object addPreSaleGoods(){ return new Object(); }
    @DeleteMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "删除预售商品")
    public Object deletePreSaleGoods(){ return new Object(); }
    @PutMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "修改预售商品信息")
    public Object updatePreSaleGoods(){ return new Object(); }
    @PostMapping("groupon-goods")
    @ApiOperation(value = "添加团购商品")
    public Object addGrouponGoods(){ return new Object(); }
    @DeleteMapping("groupon-goods/{id}")
    @ApiOperation(value = "删除团购商品")
    public Object deleteGrouponGoods(){ return new Object(); }
    @PutMapping("groupon-goods/{id}")
    @ApiOperation(value = "修改团购商品信息")
    public Object updateGrouponGoods(){ return new Object(); }

    /*
     * 品牌管理
     */
    @PostMapping("/{brand-id}/goods")
    @ApiOperation("添加指定品牌下的商品")
    public Object addGoodsOfSpecifiedBrand(){return new Object();}
    @DeleteMapping("/{brand-id}/goods")
    @ApiOperation("删除指定品牌下的商品")
    public Object deleteGoodsOfSpecifiedBrand(){return new Object();}
    @PutMapping("/{brand-id}/goods")
    @ApiOperation("修改指定品牌下的商品信息")
    public Object updateGoodsOfSpecifiedBrand(){return new Object();}

}