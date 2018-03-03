package cn.dblearn.cloud.course.dao;

import cn.dblearn.cloud.common.entity.MyMapper;
import cn.dblearn.cloud.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper extends MyMapper<Course> {

    List<Course> listRecentCourse();

    List<Course> listBoutiqueCourse();

    List<Course> listHotCourse();
}