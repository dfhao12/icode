package com.dfhao.shiro.user.mapper;

import com.dfhao.shiro.user.entry.Auth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AuthMapper {
    List<Auth> queryAuthByUserId(int userId);
}
