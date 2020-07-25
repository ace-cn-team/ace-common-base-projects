package ace.common.base.define.model.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

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
    @NotBlank(message = "请输入应用ID")
    @Length(min = 1, max = 36, message = "请输入正确的应用ID")
    private String appId;
    /**
     * bizType
     */
    @NotBlank(message = "请输入业务类型")
    @Length(min = 1, max = 36, message = "请输入正确的业务类型")
    @ApiModelProperty(value = "业务类型", required = true)
    String bizType;
    /**
     * bizId
     */
    @NotBlank(message = "请输入业务ID")
    @Length(min = 1, max = 36, message = "请输入正确的业务ID")
    @ApiModelProperty(value = "业务ID", required = true)
    String bizId;
}
