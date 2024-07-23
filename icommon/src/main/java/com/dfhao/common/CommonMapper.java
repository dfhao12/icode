package com.dfhao.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dfhao.base.BaseMapper;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper extends BaseMapper<CommonConditionVo> {

    List<HashMap<String, Object>> commonPage(IPage<CommonConditionVo> page);

}
