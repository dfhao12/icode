package com.dfhao.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dfhao.base.BaseMapper;
import java.util.List;
import java.util.Map;

public interface CommonMapper extends BaseMapper<CommonConditionVo> {

    List<Map<String, Object>> page(IPage<CommonConditionVo> page);

}
