package com.dfhao.shiro.user.entry;

import lombok.Data;

@Data
public class Auth {
    private int id;
    private int userId;
    private String authInfo;
}
