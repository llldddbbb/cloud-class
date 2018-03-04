package cn.dblearn.cloud.course.feign.fallback;

import cn.dblearn.cloud.course.feign.UserFeignClient;
import cn.dblearn.cloud.user.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Component
public class UserFeignClientFallback implements UserFeignClient{

    @Override
    public User getTinyInfoUserById(Long userId) {
        return new User();
    }
}
