package com.example.demo.controller;

import com.example.demo.entity.LitemallGoods;
import com.example.demo.model.Goods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"分类操作接口"})
@RestController
@RequestMapping("/categorys")
public class CategoryController {

    /*
     * 分类
     */
    @GetMapping("")
    @ApiOperation("查看所有分类")
    public Object getAllCategories(){return new Object();}
    @GetMapping("{categoryId}")
    @ApiOperation("获得特定一级分类")
    public Object getOneCategory(){return new Object();}
    @PostMapping("")
    @ApiOperation(value = "添加一级分类")
    public Object addCategory(){ return new Object(); }
    @DeleteMapping("{categoryId}")
    @ApiOperation(value = "删除特定一级分类")
    public Object deleteCategory(){ return new Object(); }
    @PutMapping("{categoryId}")
    @ApiOperation(value = "修改特定一级分类")
    public Object updateCategory(){ return new Object(); }

    /*
     * 子分类
     */
    @GetMapping("{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation("获得特定一级分类下二级分类")
    public Object getSubCategories(){return new Object();}
    @PostMapping("{categoryId}/subcategories")
    @ApiOperation(value = "添加特定一级分类下二级分类")
    public Object addSubCategory(){ return new Object(); }
    @DeleteMapping("{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "删除特定一级分类下特定二级")
    public Object deleteSubCategory(@PathVariable("id") Integer id){ return new Object(); }
    @PutMapping("{categoryId}/subcategories/{subCategoryId}")
    @ApiOperation(value = "修改特定一级分类下二级分类")
    public Object updateSubCategory(@PathVariable("id") Integer id,@RequestBody Goods goods){ return new Object(); }


    @GetMapping("/{subcategoryId}/goods")
    @ApiOperation("获取指定类别下的商品")
    public Object getGoodsBySubcategoryId(){return new Object();}
    @PostMapping("/{subcategoryId}/goods")
    @ApiOperation("添加指定类别下的商品")
    public Object addGoods(){return new Object();}
    @DeleteMapping("/{subcategoryId}/goods")
    @ApiOperation("删除指定类别下的商品")
    public Object deleteGoods(){return new Object();}
    @PutMapping("/{subcategoryId}/goods")
    @ApiOperation("修改指定类别下的商品信息")
    public Object updateGoods(){return new Object();}
}
