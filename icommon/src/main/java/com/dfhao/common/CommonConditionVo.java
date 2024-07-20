package com.dfhao.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.dfhao.base.BasePage;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "PageVo", description = "分页结果")
public class CommonConditionVo extends BasePage<CommonConditionVo> {

    @TableId
    @Schema(name = "mainSql", description = "select * from table")
    private String mainSql;

    @Schema(name = "mainCondition", description = "where a=1")
    private String mainCondition;

    @Schema(name = "mainOrderBy", description = "order by xxx")
    private String mainOrderBy;
}
