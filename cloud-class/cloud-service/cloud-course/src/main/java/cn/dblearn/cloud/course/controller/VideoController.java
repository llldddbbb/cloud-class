package cn.dblearn.cloud.course.controller;

import cn.dblearn.cloud.common.entity.Result;
import cn.dblearn.cloud.course.entity.Video;
import cn.dblearn.cloud.course.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;


    @GetMapping("{courseId}/video")
    public Result listVideoByCourseId(@PathVariable Integer courseId){
        List<Video> videoList = videoService.listVideoByCourseId(courseId);
        return Result.ok().put("videoList",videoList);
    }
}
