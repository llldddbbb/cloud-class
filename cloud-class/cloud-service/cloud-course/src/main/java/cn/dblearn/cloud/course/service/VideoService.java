package cn.dblearn.cloud.course.service;

import cn.dblearn.cloud.course.dao.VideoMapper;
import cn.dblearn.cloud.course.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Service
public class VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public List<Video> listVideoByCourseId(Integer courseId){
        return videoMapper.listVideoByCourseId(courseId);
    }

}
