package cn.dblearn.cloud.course.dao;

import cn.dblearn.cloud.common.entity.MyMapper;
import cn.dblearn.cloud.course.entity.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper extends MyMapper<Video> {

    List<Video> listVideoByCourseId(Integer courseId);
}