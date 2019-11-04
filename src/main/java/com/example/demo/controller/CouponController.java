package com.example.demo.controller;

import com.example.demo.model.Address;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"优惠券操作接口"})
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @GetMapping("")
    @ApiOperation("获得所有优惠券信息")
    public void getAllCoupons(){
        return ;
    }


    @GetMapping("{couponId}")
    @ApiOperation("获得特定优惠券信息")
    public void getCouponInfo(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @GetMapping("{couponId}/coupon-rules")
    @ApiOperation("获得特定优惠券的，优惠券规则")
    public void getCouponCouponRule(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @DeleteMapping("{couponId}")
    @ApiOperation("管理员删除特定优惠券")
    public void deleteCoupon(){
        return ;
    }

    @PostMapping("")
    @ApiOperation("建立新的优惠券")
    public void postCoupon(){
        return ;
    }

    @PutMapping("{couponId}")
    @ApiOperation("修改特定优惠券")
    public void putCoupon(){
        return ;
    }


    @PostMapping("coupon-rules")
    @ApiOperation("管理员上传新的优惠券规则")
    public void postNewCouponRule(){
        return ;
    }

    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("管理员修改特定优惠券规则")
    public void putCouponRule(){
        return ;
    }


    @DeleteMapping("coupon-rule/{couponRuleId}")
    @ApiOperation("管理员删除特定优惠券规则")
    public void deleteCouponRule(){
        return ;
    }

    @GetMapping("coupon-rules/{couponRuleId}/coupons")
    @ApiOperation("管理员获得特定优惠券规则的优惠券")
    public void getCouponRuleCoupons(){
        return ;
    }



}
