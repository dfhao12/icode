package com.dfhao.shiro.user.mapper;

import com.dfhao.shiro.user.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryUserByUserName(String userName);
}
