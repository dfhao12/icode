package com.dfhao.shiro.user.service;


import com.dfhao.shiro.user.entry.User;

public interface UserService {
    User queryUserByUserName(String userName);
}
