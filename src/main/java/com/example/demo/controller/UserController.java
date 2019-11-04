package com.example.demo.controller;


import com.example.demo.model.Address;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    @ApiOperation("获得所有用户的特定信息")
    public Object getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("{id}")
    @ApiOperation("获得特定用户的显示信息")
    public Object getUserInfo(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return userService.getUserInfo(id);
    }
    @PutMapping("{id}")
    @ApiOperation("修改特定用户信息")
    public Object updateUserInfo(){
        return 5;
    }
    @PostMapping("")
    @ApiOperation("创建用户")
    public Object createUser(){
        return 5;
    }
    @DeleteMapping("{id}")
    @ApiOperation("删除用户")
    public Object deleteUser(){
        return 5;
    }

    @GetMapping("{id}/addresses")
    @ApiOperation("获得特定用户地址信息")
    public Address getUserAddress(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return userService.getUserAddress(id);
    }
    @PutMapping("{id}/address/{addressId}")
    @ApiOperation("修改用户某个地址信息")
    public Object updateAddress(){
        return 5;
    }
    @PostMapping("{id}/address")
    @ApiOperation("某个用户增加一个地址")
    public Object createAddress(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return 5;
    }
    @DeleteMapping("{id}/address/{addressId}")
    @ApiOperation("删除某个用户某个地址")
    public Object deleteAddress(){
        return 5;
    }

    @GetMapping("{id}/password")
    @ApiOperation("用户找回密码")
    public Object getPassword(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return 5;
    }
    @PutMapping("{id}/password")
    @ApiOperation("用户修改密码")
    public Object updatePassword(){
        return 5;
    }

    @GetMapping("{id}/footprints")
    @ApiOperation("获得用户足迹")
    public Object getAllPrints(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return 5;
    }
    @GetMapping("{id}/footprints/{fpId}")
    @ApiOperation("进入某个足迹")
    public Object checkPrint(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id,@ApiParam(name="fpId",value="足迹id",required=true) @PathVariable String fp_id){
        return 5;
    }
    @DeleteMapping("{id}/footprints/{fpId}")
    @ApiOperation("删除某个足迹")
    public Object deletePrint(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id,@ApiParam(name="fpId",value="足迹id",required=true) @PathVariable String fp_id){
        return 5;
    }
    @DeleteMapping("{id}/footprints")
    @ApiOperation("删除所有足迹")
    public Object deletePrint(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return 5;
    }

    @DeleteMapping("{id}/collections")
    @ApiOperation("查看所有收藏")
    public Object getCollections(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id){
        return 5;
    }
    @PostMapping("{id}/collections/{collectionId}")
    @ApiOperation("查看单个收藏")
    public Object checkCollection(@ApiParam(name="id",value="用户id",required=true) @PathVariable String id,@ApiParam(name="collectionId",value="收藏id",required=true) @PathVariable String collection_id){
        return 5;
    }

}





