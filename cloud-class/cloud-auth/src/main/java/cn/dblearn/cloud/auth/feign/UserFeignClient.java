package cn.dblearn.cloud.auth.feign;

import cn.dblearn.cloud.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@FeignClient(name = "cloud-user")
public interface UserFeignClient {

    @GetMapping("/exist/{username}")
    User getByUsername(@PathVariable("username") String username);
}
