package com.dfhao.common;

import com.dfhao.base.PageVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
@Tag(name = "通用sql查询")
public class CommonController {
    @Resource
    private CommonService commonService;

    @PostMapping("/page")
    @Operation(summary = "分页查询")
    public PageVo<Map<String, Object>> page(@RequestBody CommonConditionVo commonConditionVo) {
        return commonService.page(commonConditionVo);
    }
}
