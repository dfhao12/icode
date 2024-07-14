package com.dfhao.common;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/common")
@Tag(name = "通用sql查询")
public class BaseCommonController {
    @Resource
    private IBaseCommonService baseCommonService;

    @PostMapping("/query")
    @Operation(summary = "不分页查询")
    public List<HashMap<String, Object>> query(@RequestBody QueryVo queryVo) {
        System.out.println("2");
        return null;
    }

    @PostMapping("/queryPage")
    @Operation(summary = "分页查询")
    public List<HashMap<String, Object>> queryPage(@RequestBody QueryVo person) {
        System.out.println("2");
        return null;
    }
}
