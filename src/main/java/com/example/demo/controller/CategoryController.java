package com.example.demo.controller;

import com.example.demo.entity.LitemallGoods;
import com.example.demo.model.Goods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"分类操作接口"})
@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("")
    @ApiOperation("获得分类详情")
    public Object getAllCategory(){return new Object();}


    @GetMapping("{categoryId}")
    @ApiOperation("获得特定一级分类详情")
    public Object getCategory(){return new Object();}

    @PostMapping("")
    @ApiOperation(value = "创建特定一级分类")
    public void createCategory(){
        return ;
    }

    @PutMapping("{categoryId}")
    @ApiOperation(value = "修改特定一级分类")
    public Object updateGoods(@PathVariable("id") Integer id,@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @DeleteMapping("{categoryId}")
    @ApiOperation(value = "删除特定一级分类")
    public Object deleteGoods(@PathVariable("id") Integer id){
        return true;
    }

    @GetMapping("{categoryId}/subcategory/{subCategoryId}")
    @ApiOperation("获得特定一级分类下二级分类商品详情")
    public Object getSubCategory(){return new Object();}


    @PostMapping("{categoryId}/subcategory")
    @ApiOperation(value = "创建特定一级分类下二级分类商品")
    public void createSubCategory(){
        return ;
    }

    @PutMapping("{categoryId}/subcategory/{subCategoryId}")
    @ApiOperation(value = "修改特定一级分类下二级分类商品")
    public Object updateSubCategory(@PathVariable("id") Integer id,@RequestBody Goods goods){
        return new LitemallGoods();
    }

    @DeleteMapping("{categoryId}/subcategory/{subCategoryId}")
    @ApiOperation(value = "删除特定一级分类下二级分类商品详情")
    public Object deleteSubCategory(@PathVariable("id") Integer id){
        return true;
    }




}
