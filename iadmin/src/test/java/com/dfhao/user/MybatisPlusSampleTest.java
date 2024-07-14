package com.dfhao.user;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.dfhao.admin.user.User;
import com.dfhao.admin.user.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@MybatisPlusTest
class MybatisPlusSampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }
}