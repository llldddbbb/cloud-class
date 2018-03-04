package cn.dblearn.cloud.auth.dao;

import cn.dblearn.cloud.auth.entity.Authority;
import cn.dblearn.cloud.common.entity.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorityMapper extends MyMapper<Authority> {

    List<Authority> listAuthorityByUserId(Long userId);
}