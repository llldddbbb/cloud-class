package cn.dblearn.cloud.course.controller;

import cn.dblearn.cloud.common.entity.Result;
import cn.dblearn.cloud.course.entity.Course;
import cn.dblearn.cloud.course.entity.Video;
import cn.dblearn.cloud.course.service.CourseService;
import cn.dblearn.cloud.course.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/1
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/recent")
    public Result listRecentCourse(){
        List<Course> recentCourseList=courseService.listRecentCourse();
        return Result.ok().put("recentCourseList",recentCourseList);
    }

    @GetMapping("/boutique")
    public Result listBoutiqueCourse(){
        List<Course> boutiqueCourseList=courseService.listBoutiqueCourse();
        return Result.ok().put("boutiqueCourseList",boutiqueCourseList);
    }

    @GetMapping("/hot")
    public Result listHotCourse(){
        List<Course> hotCourseList=courseService.listHotCourse();
        return Result.ok().put("hotCourseList",hotCourseList);
    }

    @GetMapping("/{courseId}")
    public Result getCourseById(@PathVariable Integer courseId){
        Course course=courseService.getCourseById(courseId);
        return Result.ok().put("course",course);
    }



}
