package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
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
        this.sa = new Goods(1,"2");
        this.s = 1;

    }

    public Map getMap() {
        return map;
    }
    public void setMap(Map map) {
        this.map = map;
    }


    public Goods getSa(){return sa;}
    public void setSa(Goods goods){this.sa = goods;}


    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    @ApiModelProperty("商品列表1")
    private Map map;

    @ApiModelProperty("商品列表2")
    private ArrayList<Goods> goods;

    @ApiModelProperty("商品")
    private Goods sa;

    @ApiModelProperty("整数")
    private int s;

}
