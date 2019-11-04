package com.example.demo.service;

import com.example.demo.model.Address;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    public Object getUsers()
    {
        Map map=new HashMap();
        map.put("1","peter");
        map.put("2","sam");
        map.put("3","tr");
        return map;
    }



    public Object getUserInfo(String id)
    {
        Map map=new HashMap();
        map.put("id",id);
        map.put("name","sam");
        map.put("age","15");
        return map;
    }


    public Address getUserAddress(String id)
    {
        Address address=new Address("中国","福建省","厦门市","滨海街道","131312121","me");
        return address;
    }



}
