package cn.dblearn.cloud.user.controller;

import cn.dblearn.cloud.user.entity.User;
import cn.dblearn.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/tiny/{userId}")
    public User getTinyInfoUserById(@PathVariable Long userId){
        return userService.getTinyInfoUserById(userId);
    }

    @GetMapping("/exist/{username}")
    public User getByUsername(@PathVariable String username){
        return userService.getByUsername(username);
    }
}
