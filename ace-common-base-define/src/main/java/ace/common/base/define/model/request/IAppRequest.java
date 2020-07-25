package ace.common.base.define.model.request;

import lombok.Data;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/7/25 15:09
 * @description 应用信息通用请求
 */
public interface IAppRequest {
    String getAppId();

    String setAppId();
}
