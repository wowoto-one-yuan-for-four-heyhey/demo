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

    @GetMapping("{couponId}/status")
    @ApiOperation("获得特定优惠券的状态")
    public void getCouponStatus(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @PutMapping("{couponId}/status")
    @ApiOperation("修改特定coupon")
    public void putCoupon(){
        return ;
    }



    @GetMapping("{couponId}/time")
    @ApiOperation("获得特定优惠券的时间信息")
    public void getCouponTime(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @GetMapping("{couponId}/expiredtime")
    @ApiOperation("获得特定优惠券的期满信息")
    public void getCouponExpiredTime(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }





    @GetMapping("{couponId}/couponRuleId")
    @ApiOperation("获得特定优惠券的，优惠券规则Id")
    public void getCouponCouponRuleId(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){
        return ;
    }

    @PostMapping("{couponId}")
    @ApiOperation("建立新的coupon")
    public void postCoupon(){
        return ;
    }



    @PostMapping("couponRule/{couponRuleId}")
    @ApiOperation("管理员上传新的couponRule")
    public void postNewCouponRule(){
        return ;
    }

    @PutMapping("couponRule/{couponRuleId}")
    @ApiOperation("管理员修改特定couponRule")
    public void PutCouponRule(){
        return ;
    }


    @DeleteMapping("couponRule/{couponRuleId}")
    @ApiOperation("管理员删除特定couponRule")
    public void deleteCouponRule(){
        return ;
    }





}
