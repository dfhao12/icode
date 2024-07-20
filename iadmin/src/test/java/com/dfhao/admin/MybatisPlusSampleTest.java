package com.dfhao.admin;


import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.dfhao.admin.user.User;
import com.dfhao.admin.user.UserMapper;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;


import static org.assertj.core.api.Assertions.assertThat;

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MybatisPlusSampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        user.setId(223L);
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }
}