package cn.dblearn.cloud.course.service;

import cn.dblearn.cloud.course.dao.CourseMapper;
import cn.dblearn.cloud.course.entity.Course;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/1
 */
@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private CategoryService categoryService;

    @Value("${home.course.pageSize}")
    private Integer pageSize;

    public List<Course> listRecentCourse() {
        PageHelper.startPage(1,pageSize);
        return courseMapper.listRecentCourse();
    }

    public List<Course> listBoutiqueCourse() {
        PageHelper.startPage(1,pageSize);
        return courseMapper.listBoutiqueCourse();
    }

    public List<Course> listHotCourse() {
        PageHelper.startPage(1,pageSize);
        return courseMapper.listHotCourse();
    }

    public Course getCourseById(Integer courseId) {
        Course course = courseMapper.selectByPrimaryKey(courseId);
        course.setCategory(categoryService.getCategoryById(course.getCategoryId()));
        return course;
    }
}
