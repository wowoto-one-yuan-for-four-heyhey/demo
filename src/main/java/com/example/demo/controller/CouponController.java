package com.example.demo.controller;

import com.example.demo.model.Address;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"优惠券操作接口"})
@RestController
@RequestMapping("/coupons")
public class CouponController {

    /*
     * 优惠券
     */
    @GetMapping("")
    @ApiOperation("查看所有优惠券")
    public void getAllCouponsInfo(){ return ; }
    @GetMapping("{couponId}")
    @ApiOperation("查看特定优惠券")
    public void getOneCouponInfo(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }
    @PostMapping("")
    @ApiOperation("添加优惠券")
    public void addCoupon(){ return ; }
    @DeleteMapping("{couponId}")
    @ApiOperation("删除优惠券")
    public void deleteCoupon(){ return ; }
    @PutMapping("{couponId}")
    @ApiOperation("修改优惠券信息")
    public void updateCoupon(){ return ; }

    /*
     * 优惠券规则
     */
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则")
    public void getAllCouponRules(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }
    @GetMapping("{couponId}/coupon-rules")
    @ApiOperation("查看特定优惠券规则")
    public void getOneCouponRule(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }
    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则")
    public void addCouponRule(){ return ; }
    @DeleteMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("删除优惠券规则")
    public void deleteCouponRule(){ return ; }
    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("修改优惠券规则信息")
    public void updateCouponRule(){ return ; }

}
