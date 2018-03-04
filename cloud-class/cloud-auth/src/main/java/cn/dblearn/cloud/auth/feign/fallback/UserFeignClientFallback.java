package cn.dblearn.cloud.auth.feign.fallback;

import cn.dblearn.cloud.auth.feign.UserFeignClient;
import cn.dblearn.cloud.user.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User getByUsername(String username) {
        return new User();
    }
}
