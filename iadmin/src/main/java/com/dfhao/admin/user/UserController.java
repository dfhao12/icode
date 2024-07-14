package com.dfhao.admin.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "测试类名称")
public class UserController {

    @GetMapping("/")
    @Operation(summary = "")
    @Parameter(name = "str", description = "字符串", required = true)
    public String getStr(@RequestParam("str") String str) {
        System.out.println("1");
        return str;
    }

    @PostMapping("/")
    @Operation(summary = "post请求接口")
    public void info(@RequestBody UserVo person) {
        System.out.println("2");
    }
}
