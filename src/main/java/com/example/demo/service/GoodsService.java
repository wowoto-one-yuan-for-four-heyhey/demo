package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoodsService {
public Object getGoods()
{
    Map map=new HashMap();
    map.put("1","爆炒橘子皮");
    map.put("2","酥炸老干妈");
    map.put("3","醋溜五仁月饼");
    return map;
}
}
