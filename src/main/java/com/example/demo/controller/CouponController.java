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

    @GetMapping("")
    @ApiOperation("获得所有优惠券信息")
    public void getAllCoupons(){
        return ;
    }


    @GetMapping("{couponId}")
    @ApiOperation("获得特定优惠券信息")
    public void getCouponsInfo(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @GetMapping("{couponId}/coupon-rules")
    @ApiOperation("获得特定优惠券的，优惠券规则")
    public void getCouponsCouponRules(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @DeleteMapping("{couponId}")
    @ApiOperation("管理员删除特定优惠券")
    public void deleteCoupons(){
        return ;
    }

    @PostMapping("")
    @ApiOperation("建立新的优惠券")
    public void postCoupons(){
        return ;
    }

    @PutMapping("{couponId}")
    @ApiOperation("修改特定优惠券")
    public void putCoupons(){
        return ;
    }


    @PostMapping("coupon-rules")
    @ApiOperation("管理员上传新的优惠券规则")
    public void postNewCouponRules(){
        return ;
    }

    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("管理员修改特定优惠券规则")
    public void putCouponRules(){
        return ;
    }


    @DeleteMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("管理员删除特定优惠券规则")
    public void deleteCouponRules(){
        return ;
    }

    @GetMapping("coupon-rules/{couponRuleId}/coupons")
    @ApiOperation("管理员获得特定优惠券规则的优惠券")
    public void getCouponsRuleCoupons(){
        return ;
    }



}
