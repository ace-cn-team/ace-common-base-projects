package ace.common.base.define.constant;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/6/15
 * @description 定义系统代码使用范围与规则
 * 规则：
 * 1.只能使用数字
 * 2.0-119999 的数字，系统保留
 * 3.十万以上数字,万位开始代表系统模块,0~9999代表模块内部代码
 */
public interface SystemCodeConstants {
    /**
     * 系统保留
     */
    Integer[] SYSTEM = new Integer[]{0, 119999};
    /**
     * 账号模块
     */
    Integer[] ACCOUNT = new Integer[]{120000, 129999};
    /**
     * 用户模块
     */
    Integer[] USER = new Integer[]{130000, 139999};
    /**
     * 统一认证模块
     */
    Integer[] CAS = new Integer[]{140000, 149999};
    /**
     * 图形验证码模块
     */
    Integer[] CAPTCHA = new Integer[]{900000, 919999};
    /**
     * 文件上传模块
     */
    Integer[] UPLOAD = new Integer[]{920000, 929999};
}
