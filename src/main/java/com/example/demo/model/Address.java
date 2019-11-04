package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getConsignee() {
        return consignee;
    }

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
}
