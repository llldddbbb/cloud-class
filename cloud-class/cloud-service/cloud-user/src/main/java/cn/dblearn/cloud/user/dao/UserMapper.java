package cn.dblearn.cloud.user.dao;

import cn.dblearn.cloud.common.entity.MyMapper;
import cn.dblearn.cloud.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
    User getByUsername(String username);

    User getTinyInfoUserById(Long userId);
}