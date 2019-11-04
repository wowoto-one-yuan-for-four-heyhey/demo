package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags={"专题操作接口"})
@RestController
@RequestMapping("/topics")
public class TopicController {

    @GetMapping("")
    @ApiOperation("获得所有专题")
    public void getAllTopics(){
    }

    @PostMapping("")
    @ApiOperation("创建新专题")
    public void createTopic(){
    }

    @GetMapping("{topicId}")
    @ApiOperation("获得特定专题")
    public void getTopic(){
    }

    @PatchMapping("{topicId}")
    @ApiOperation("修改特定专题")
    public void updateTopic(){
    }

    @DeleteMapping("{topicId}")
    @ApiOperation("删除特定专题")
    public void deleteTopic(){
    }

    @GetMapping("{topicId}/comments")
    @ApiOperation("获得特定专题下的评论")
    public void getTopicComments(){
    }

    @PostMapping("{topicId}/comments")
    @ApiOperation("创建特定专题下的评论")
    public void createTopicComment(){
    }

    @DeleteMapping("{topicId}/comments")
    @ApiOperation("删除特定专题下的所有评论")
    public void deleteTopicComments(){
    }

    @PatchMapping("{topicId}/comments/{commentId}")
    @ApiOperation("修改或审核特定专题下的评论")
    public void updateTopicComment(){
    }

    @DeleteMapping("{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题下的特定评论")
    public void deleteTopicComment(){
    }


}
