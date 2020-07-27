package ace.common.base.define.model.request;

import ace.common.base.define.model.bo.IAppId;
import ace.common.base.define.model.constraint.AppIdConstraint;
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
public class CommonAppIdRequest implements IAppId {
    @ApiModelProperty(value = "应用ID", required = true)
    @AppIdConstraint
    private String appId;

    @Override
    public String getAppId() {
        return appId;
    }

    @Override
    public void setAppId(String appId) {
        this.appId = appId;
    }

}
