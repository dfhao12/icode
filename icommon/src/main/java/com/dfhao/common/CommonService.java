package com.dfhao.common;

import com.dfhao.base.BaseServiceImpl;
import com.dfhao.base.PageVo;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CommonService extends BaseServiceImpl<CommonMapper, CommonConditionVo> {

    public PageVo<Map<String, Object>> page(CommonConditionVo condition) {
        List<Map<String, Object>> page = getBaseMapper().page(condition);
        if (CollectionUtils.isEmpty(page)) {
            return new PageVo<>(condition.getCurrent(), 0, null);
        }
        return new PageVo<>(condition.getCurrent(), page.size(), page);
    }
}
