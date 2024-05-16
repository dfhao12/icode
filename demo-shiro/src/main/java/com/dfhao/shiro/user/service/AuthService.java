package com.dfhao.shiro.user.service;

import com.dfhao.shiro.user.entry.Auth;

import java.util.List;

public interface AuthService {
    List<Auth> queryAuthByUserId(int userId);
}
