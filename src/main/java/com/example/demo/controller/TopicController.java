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
    @PostMapping("")
    @ApiOperation("添加专题")
    public void addTopic(){ }
    @DeleteMapping("{topicId}")
    @ApiOperation("删除专题")
    public void deleteTopic(){ }
    @PatchMapping("{topicId}")
    @ApiOperation("修改专题信息")
    public void updateTopic(){ }


    /*
     * 评论
     */
    @GetMapping("{topicId}/comments")
    @ApiOperation("查看特定专题的评论")
    public void getCommentsByTopicId(){ }
    @PostMapping("{topicId}/comments")
    @ApiOperation("添加特定专题的评论")
    public void addComment(){ }
    @DeleteMapping("{topicId}/comments")
    @ApiOperation("删除特定专题的所有评论")
    public void deleteAllComments(){ }
    @DeleteMapping("{topicId}/comments/{commentId}")
    @ApiOperation("删除特定专题的特定评论")
    public void deleteOneComment(){ }
    @PatchMapping("{topicId}/comments/{commentId}")
    @ApiOperation("修改特定专题的评论")
    public void updateComment(){ }

    @GetMapping("/{topicId}/goods")
    @ApiOperation("获取指定话题下的商品")
    public Object getGoodsByTopicId(){return new Object();}
    @PostMapping("/{topicId}/goods")
    @ApiOperation("添加指定话题下的商品")
    public Object addGoods(){return new Object();}
    @DeleteMapping("/{topicId}/goods")
    @ApiOperation("删除指定话题下的商品")
    public Object deleteGoods(){return new Object();}
    @PutMapping("/{topicId}/goods")
    @ApiOperation("修改指定话题下的商品信息")
    public Object updateGoods(){return new Object();}
}
