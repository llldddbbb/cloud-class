package cn.dblearn.cloud.course.service;

import cn.dblearn.cloud.course.dao.CommentMapper;
import cn.dblearn.cloud.course.entity.Comment;
import cn.dblearn.cloud.course.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private UserFeignClient userFeignClient;

    public List<Comment> listCommentByCourseId(Integer courseId){
        List<Comment> commentList = commentMapper.listCommentByCourseId(courseId);
        for (Comment comment : commentList) {
            comment.setUser(userFeignClient.getTinyInfoUserById(comment.getUserId()));
        }
        return commentList;
    }

}
