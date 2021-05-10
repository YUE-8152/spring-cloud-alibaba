package com.yue.spring.cloud.alibaba.common.core;

/**
 * @ProjectName: spring-cloud-alibaba-common
 * @Package: com.yue.spring.cloud.alibaba.common.core
 * @EnumName: ResultCode
 * @Author: YUE
 * @Description: 响应码枚举，参考HTTP状态码的语义
 * @Date: 2021/5/9 13:41
 * @Version: 1.0
 */
public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(400, "失败"),
    UNAUTHORIZED(401, "未认证（签名错误）"),
    TOKEN_ERROR(401, "无效token"),
    NOT_FOUND(404, "接口不存在"),//接口不存在
    PARAMETERS_ERROR(4100, "参数校验失败"),
    QPS_ERROR(4300, "QPS达到最大阈值"),
    TIMEOUT_ERROR(4400, "请求超时"),
    INTERNAL_SERVER_ERROR(500, "系统异常");//服务器内部错误

    private final int code;
    private final String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
