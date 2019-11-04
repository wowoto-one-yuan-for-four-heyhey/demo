package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags={"专题操作接口"})
@RestController
@RequestMapping("/topic")
public class TopicController {

    @GetMapping("")
    @ApiOperation("获得所有话题")
    public void getAllTopics(){
    }

    @PostMapping("")
    @ApiOperation("创建新话题")
    public void createTopic(){
    }

    @GetMapping("{topicId}")
    @ApiOperation("获得特定话题")
    public void getTopic(){
    }

    @PatchMapping("{topicId}")
    @ApiOperation("修改特定话题")
    public void updateTopic(){
    }

    @DeleteMapping("{topicId}")
    @ApiOperation("删除特定话题")
    public void deleteTopic(){
    }

    @GetMapping("{topicId}/comment")
    @ApiOperation("获得特定话题下的评论")
    public void getTopicComments(){
    }

    @PostMapping("{topicId}/comment")
    @ApiOperation("创建特定话题下的评论")
    public void createTopicComment(){
    }

    @DeleteMapping("{topicId}/comment")
    @ApiOperation("删除特定话题下的所有评论")
    public void deleteTopicComments(){
    }

    @PatchMapping("{topicId}/comment/{commentId}")
    @ApiOperation("修改特定话题下的评论")
    public void updateTopicComment(){
    }

    @DeleteMapping("{topicId}/comment/{commentId}")
    @ApiOperation("修改特定话题下的特定评论")
    public void deleteTopicComment(){
    }

}
