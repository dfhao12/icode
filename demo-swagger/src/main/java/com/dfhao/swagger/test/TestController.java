package com.dfhao.swagger.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@Tag(name = "测试类名称")
public class TestController {

    @GetMapping("/get-str")
    @Operation(description = "查询接口")
    @Parameter(name = "str", description = "字符串", required = true)
    public String getStr(@RequestParam("str") String str) {
        return str;
    }

    @PostMapping("/info")
    @Operation(summary = "获取信息", description = "查询接口")
    public String info(@RequestParam("str") Person  person) {
        return "";
    }
}
