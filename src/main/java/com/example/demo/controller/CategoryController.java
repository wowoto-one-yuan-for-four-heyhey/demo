package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户controller",tags={"分类操作接口"})
@RestController
@RequestMapping("/category")
public class CategoryController {
}
