package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(description="商品列表对象goodslist")
public class GoodsList {
    public GoodsList() {
        Map tmpMap=new HashMap();
        tmpMap.put("1","爆炒橘子皮");
        tmpMap.put("2","酥炸老干妈");
        tmpMap.put("3","醋溜五仁月饼");
        this.map = tmpMap;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @ApiModelProperty(name="map",value = "商品列表",required = true)
    private Map map;

}
