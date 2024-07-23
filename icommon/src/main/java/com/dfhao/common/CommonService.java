package com.dfhao.common;

import com.dfhao.base.BaseServiceImpl;
import com.dfhao.base.PageVo;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CommonService extends BaseServiceImpl<CommonMapper, CommonConditionVo> {

    public PageVo<HashMap<String, Object>> commonPage(CommonConditionVo condition) {
        List<HashMap<String, Object>> page = getBaseMapper().commonPage(condition);
        if (CollectionUtils.isEmpty(page)) {
            return new PageVo<>(condition.getCurrent(), 0, null);
        }
        return new PageVo<>(condition.getCurrent(), page.size(), page);
    }
}
