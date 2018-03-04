package cn.dblearn.cloud.auth.service;

import cn.dblearn.cloud.auth.dao.AuthorityMapper;
import cn.dblearn.cloud.auth.entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bobbi
 * @date 2018/3/4
 */
@Service
public class AuthorityService {

    @Autowired
    private AuthorityMapper authorityMapper;

    public List<Authority> listAuthorityByUserId(Long id) {
        return authorityMapper.listAuthorityByUserId(id);
    }
}
