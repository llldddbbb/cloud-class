package cn.dblearn.cloud.course.dao;

import cn.dblearn.cloud.common.entity.MyMapper;
import cn.dblearn.cloud.course.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends MyMapper<Category> {
}