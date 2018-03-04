package cn.dblearn.cloud.course.dao;

import cn.dblearn.cloud.common.entity.MyMapper;
import cn.dblearn.cloud.course.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper extends MyMapper<Comment> {

    List<Comment> listCommentByCourseId(Integer courseId);
}