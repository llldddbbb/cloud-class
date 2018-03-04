package cn.dblearn.cloud.course.service;

import cn.dblearn.cloud.course.dao.CategoryMapper;
import cn.dblearn.cloud.course.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bobbi
 * @date 2018/3/3
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public Category getCategoryById(Integer id){
        return categoryMapper.selectByPrimaryKey(id);
    }
}
