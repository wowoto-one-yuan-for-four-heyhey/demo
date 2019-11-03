package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedHashMap;
import java.util.Map;

@ApiModel(description="用户地址address")
public class Address {
    @ApiModelProperty(name="country",value = "国家",required = true)
    private String country;
    @ApiModelProperty(name="province",value = "省份",required = true)
    private String province;
    @ApiModelProperty(name="city",value = "城市",required = true)
    private String city;
    @ApiModelProperty(name="street",value = "街道",required = true)
    private String street;
    @ApiModelProperty(name="telephone",value = "电话",required = true)
    private String telephone;
    @ApiModelProperty(name="consignee",value = "收货人姓名",required = true)
    private String consignee;
    public Address(String country,String province,String city,String street,String telephone,String consignee) {
        this.country = country;
        this.province=province;
        this.city= city;
        this.street= street;
        this.telephone=telephone;
        this.consignee= consignee;
    }
    public Map getAddress()
    {
        LinkedHashMap map=new LinkedHashMap();
        map.put("国家",this.country);
        map.put("省份",this.province);
        map.put("城市",this.city);
        map.put("街道",this.street);
        map.put("电话",this.telephone);
        map.put("收货人姓名",this.consignee);
        return map;
    }
}
