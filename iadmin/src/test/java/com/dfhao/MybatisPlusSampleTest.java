package com.dfhao;


import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.dfhao.admin.user.User;
import com.dfhao.admin.user.UserMapper;
import com.dfhao.common.CommonMapper;
import com.dfhao.common.CommonConditionVo;
import java.util.HashMap;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


import static org.assertj.core.api.Assertions.assertThat;

@MybatisPlusTest
class MybatisPlusSampleTest {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CommonMapper commonMapper;

    @Test
    void testInsert() {
        User user = new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }

    @Test
    void testPage() {
        String mainSql = "SELECT * from user_t";
        String mainCondition = "WHERE id = 1";
        CommonConditionVo commonConditionVo = new CommonConditionVo();
        commonConditionVo.setMainSql(mainSql);
        commonConditionVo.setMainCondition(mainCondition);

        commonConditionVo.setSize(20);
        commonConditionVo.setCurrent(1);
//        IPage<HashMap<String, Object>> page = commonMapper.page(commonConditionVo);
//        System.out.println(JSONUtil.toJsonStr(page));
    }
}