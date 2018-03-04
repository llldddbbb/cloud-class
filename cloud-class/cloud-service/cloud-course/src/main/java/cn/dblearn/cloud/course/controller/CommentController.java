package cn.dblearn.cloud.course.controller;

import cn.dblearn.cloud.common.entity.Result;
import cn.dblearn.cloud.course.entity.Comment;
import cn.dblearn.cloud.course.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/{courseId}/comment")
    public Result listCommentByCourseId(@PathVariable Integer courseId){
        List<Comment> commentList = commentService.listCommentByCourseId(courseId);
        return Result.ok().put("commentList",commentList);
    }

}
