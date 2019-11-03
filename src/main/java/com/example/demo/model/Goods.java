package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="商品对象goods")
public class Goods {
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @ApiModelProperty(name="no",value = "商品id",required = true)
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(name="name",value = "商品名",required = true)
    private String name;

    public Goods(int no,String name) {
        this.no = 1;
        this.name="牛奶糖";
    }
}
