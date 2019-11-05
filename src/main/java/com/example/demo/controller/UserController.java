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

    /*
     * 用户信息
     */
    @GetMapping("")
    @ApiOperation("查看所有用户信息")
    public Object getAllUsersInfo(){ return new Object(); }
    @GetMapping("{id}")
    @ApiOperation("查看特定用户信息")
    public Object getOneUserInfo(){ return new Object(); }
    @PostMapping("")
    @ApiOperation("添加用户")
    public Object createUser(){ return new Object(); }
    @DeleteMapping("{id}")
    @ApiOperation("删除用户")
    public Object deleteUser(){ return new Object(); }
    @PutMapping("{id}")
    @ApiOperation("修改用户信息")
    public Object updateUserInfo(){ return new Object(); }

    /*
     * 密码
     */
    @PutMapping("{id}/password")
    @ApiOperation("修改密码")
    public Object updatePassword(){ return new Object(); }

    /*
     * 收藏
     */
    @GetMapping("{id}/collections")
    @ApiOperation("查看所有收藏")
    public Object getCollections(){ return new Object(); }
    @PostMapping("{id}/collections/{goodsId}")
    @ApiOperation("添加收藏")
    public Object addCollections(){ return new Object(); }
    @DeleteMapping("{id}/collections/{collectionId}")    // collectionId <-> goodId
    @ApiOperation("删除收藏")
    public Object deleteCollection(){ return new Object(); }

    /*
     * 地址
     */
    @GetMapping("{id}/addresses")
    @ApiOperation("获得特定用户的地址信息")
    public Object getUserAddress(){ return new Object(); }
    @PostMapping("{id}/addresses")
    @ApiOperation("添加地址")
    public Object createAddress() { return new Object(); }
    @DeleteMapping("{id}/addresses/{addressId}")
    @ApiOperation("删除地址")
    public Object deleteAddress(){ return new Object(); }
    @PutMapping("{id}/address/{addressId}")
    @ApiOperation("修改地址信息")
    public Object updateAddress(){ return new Object(); }

    /*
     * 足迹
     */
    @GetMapping("{id}/footprints")
    @ApiOperation("获得特定用户的足迹")
    public Object getPrints(){ return new Object(); }
    @PostMapping("{id}/footprints/{goodsId}")
    @ApiOperation("添加足迹")
    public Object addPrint(){ return new Object(); }
    @DeleteMapping("{id}/footprints/{fpId}")
    @ApiOperation("删除特定足迹")
    public Object deletePrint(){ return new Object(); }
    @DeleteMapping("{id}/footprints")
    @ApiOperation("删除所有足迹")
    public Object deletePrints(){ return new Object();}

    /*
     * 购物车
     */
    @GetMapping("{id}/cart-items")
    @ApiOperation("查看购物车")
    public Object getCartItems(){ return new Object(); }
    @PostMapping("{id}/cart-items/{goodsId}")
    @ApiOperation("加入购物车")
    public Object addItem(){ return new Object(); }
    @DeleteMapping("{id}/cart-items/{cartItemId}")
    @ApiOperation("删除购物车中特定物品")
    public Object getCartItem(){ return new Object();}

}





