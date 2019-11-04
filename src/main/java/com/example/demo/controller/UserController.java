package com.example.demo.controller;


import com.example.demo.model.Address;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/users")
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
    public Object getUserInfo(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
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
    public Address getUserAddress(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return userService.getUserAddress(id);
    }
    @PutMapping("{id}/address/{addressId}")
    @ApiOperation("修改用户某个地址信息")
    public Object updateAddress(){
        return 5;
    }
    @PostMapping("{id}/addresses")
    @ApiOperation("某个用户增加一个地址")
    public Object createAddress(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }
    @DeleteMapping("{id}/addresses/{addressId}")
    @ApiOperation("删除某个用户某个地址")
    public Object deleteAddress(){
        return 5;
    }

    @GetMapping("{id}/password")
    @ApiOperation("用户找回密码")
    public Object getPassword(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }
    @PutMapping("{id}/password")
    @ApiOperation("用户修改密码")
    public Object updatePassword(){
        return 5;
    }

    @GetMapping("{id}/footprints")
    @ApiOperation("获得用户足迹")
    public Object getAllPrints(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }

    @DeleteMapping("{id}/footprints/{fpId}")
    @ApiOperation("删除某个足迹")
    public Object deletePrint(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="fpId",value="足迹id",required=true) @PathVariable int fpId){
        return 5;
    }
    @DeleteMapping("{id}/footprints")
    @ApiOperation("删除所有足迹")
    public Object deletePrints(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }
    @PostMapping("{id}/footprints/{goodsId}")
    @ApiOperation("添加足迹")
    public Object addPrint(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="goodsId",value="货物id",required=true) @PathVariable int goodsId){
        return 5;
    }


    @GetMapping("{id}/collections")
    @ApiOperation("查看所有收藏")
    public Object getCollections(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }
    @DeleteMapping("{id}/collections/{collectionId}")
    @ApiOperation("删除单个收藏")
    public Object deleteCollection(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="collectionId",value="收藏id",required=true) @PathVariable int collectionId){
        return 5;
    }
    @PostMapping("{id}/collections/{goodsId}")
    @ApiOperation("收藏某件物品")
    public Object collectGoods(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="goodsId",value="商品id",required=true) @PathVariable int collectionId){
        return 5;
    }

    @GetMapping("{id}/cart-items")
    @ApiOperation("查看购物车")
    public Object getCartItems(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id){
        return 5;
    }
    @DeleteMapping("{id}/cart-items/{cartItemId}")
    @ApiOperation("删除购物车中某件物品")
    public Object getCartItems(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="cartItemId",value="购物车物品id",required=true) @PathVariable int cartItemId){
        return 5;
    }
    @PostMapping("{id}/cart-items/{goodsId}")
    @ApiOperation("将某件物品添加入购物车")
    public Object addItems(@ApiParam(name="id",value="用户id",required=true) @PathVariable int id,@ApiParam(name="goodsId",value="商品id",required=true) @PathVariable int cartItemId){
        return 5;
    }
}





