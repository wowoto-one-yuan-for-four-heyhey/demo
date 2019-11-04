package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户controller",tags={"管理员接口"})
@RestController
@RequestMapping("/administrator")
public class AdministratorController {
}
