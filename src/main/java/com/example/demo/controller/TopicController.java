package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags={"专题操作接口"})
@RestController
@RequestMapping("/topics")
public class TopicController {

    /*
     * 专题
     */
    @GetMapping("")
    @ApiOperation("获得所有专题")
    public void getAllTopics(){ }

    @GetMapping("{topicId}")
    @ApiOperation("查看特定专题")
    public void getOneTopic(){ }

    /*
     * 评论
     */
    @GetMapping("{topicId}/comments")
    @ApiOperation("查看特定专题的评论")
    public void getCommentsByTopicId(){ }

    @PostMapping("{topicId}/comments")
    @ApiOperation("添加特定专题的评论")
    public void addComment(){ }

    @DeleteMapping("{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题的特定评论")
    public void deleteOneComment(){ }

    @PutMapping("{topicId}/comments/{commentId}")
    @ApiOperation("修改特定专题的特定评论")
    public void updateComment(){ }
}
