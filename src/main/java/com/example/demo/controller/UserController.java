package com.example.demo.controller;


import com.example.demo.model.Address;
import com.example.demo.model.Goods;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    @ApiOperation("获得所有用户信息")
    public Object getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("{id}")
    @ApiOperation("获得特定用户信息")
    public Object getUserInfo(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return userService.getUserInfo(id);
    }

    @GetMapping("{id}/address")
    @ApiOperation("获得特定用户地址信息")
    public Address getUserAddress(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return userService.getUserAddress(id);
    }
}





