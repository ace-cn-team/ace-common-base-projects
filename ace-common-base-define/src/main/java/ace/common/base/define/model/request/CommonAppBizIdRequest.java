package ace.common.base.define.model.request;

import ace.common.base.define.model.bo.AppBiz;
import ace.common.base.define.model.bo.AppBizId;
import lombok.Data;
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
public class CommonAppBizIdRequest implements IAppId {
    @Valid
    @NotNull(message = "请输入应用信息")
    private AppBizId appBizId;

    @Override
    public String getAppId() {
        return appBizId.getAppId();
    }

    @Override
    public void setAppId(String appId) {
        appBizId.setAppId(appId);
    }
}
