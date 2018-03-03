package cn.dblearn.cloud.auth.repository;

import cn.dblearn.cloud.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
