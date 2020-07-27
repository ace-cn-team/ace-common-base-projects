package ace.common.base.define.model.bo;

import ace.common.base.define.model.constraint.AppIdConstraint;
import ace.common.base.define.model.constraint.BizIdConstraint;
import ace.common.base.define.model.constraint.BizTypeConstraint;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/7/25 15:09
 * @description 应用信息通用请求
 */
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppBiz {
    /**
     * appId
     */
    @AppIdConstraint
    @ApiModelProperty(value = "应用ID", required = true)
    private String appId;
    /**
     * bizType
     */
    @BizTypeConstraint
    @ApiModelProperty(value = "业务类型", required = true)
    String bizType;
    /**
     * bizId
     */
    @BizIdConstraint
    @ApiModelProperty(value = "业务ID", required = true)
    String bizId;
}
