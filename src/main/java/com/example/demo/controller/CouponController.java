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

    @GetMapping("{couponId}/couponrule")
    @ApiOperation("获得特定优惠券的，优惠券规则")
    public void getCouponCouponRule(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @DeleteMapping("{couponId}")
    @ApiOperation("管理员删除特定coupon")
    public void deleteCoupon(){
        return ;
    }

    @PostMapping("{couponId}")
    @ApiOperation("建立新的coupon")
    public void postCoupon(){
        return ;
    }

    @PutMapping("{couponId}")
    @ApiOperation("修改特定coupon")
    public void putCoupon(){
        return ;
    }


    @PostMapping("couponrule/{couponRuleId}")
    @ApiOperation("管理员上传新的couponRule")
    public void postNewCouponRule(){
        return ;
    }

    @PutMapping("couponrule/{couponRuleId}")
    @ApiOperation("管理员修改特定couponRule")
    public void putCouponRule(){
        return ;
    }


    @DeleteMapping("couponrule/{couponRuleId}")
    @ApiOperation("管理员删除特定couponRule")
    public void deleteCouponRule(){
        return ;
    }

    @GetMapping("couponrule/{couponRuleId}/user")
    @ApiOperation("管理员获得特定couponRule的user")
    public void getCouponRuleUserId(){
        return ;
    }



}
