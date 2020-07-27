package ace.common.base.define.model.request;

import ace.common.base.define.model.bo.AppBiz;
import ace.common.base.define.model.bo.IAppId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
public class CommonAppBizRequest implements IAppId {
    @Valid
    @NotNull(message = "请输入应用信息")
    private AppBiz appBiz;

    @Override
    public String getAppId() {
        return appBiz.getAppId();
    }

    @Override
    public void setAppId(String appId) {
        appBiz.setAppId(appId);
    }
}
