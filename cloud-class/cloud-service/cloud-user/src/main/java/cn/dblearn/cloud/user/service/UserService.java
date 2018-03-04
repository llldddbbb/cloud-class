package cn.dblearn.cloud.user.service;

import cn.dblearn.cloud.user.dao.UserMapper;
import cn.dblearn.cloud.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getByUsername(String username) {
        User user= userMapper.getByUsername(username);
        return user;
    }

    public User getTinyInfoUserById(Long userId) {
        return userMapper.getTinyInfoUserById(userId);
    }
}
