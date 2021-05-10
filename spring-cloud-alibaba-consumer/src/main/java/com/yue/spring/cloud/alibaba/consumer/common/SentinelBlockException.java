package com.yue.spring.cloud.alibaba.consumer.common;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yue.spring.cloud.alibaba.common.core.Result;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.common.core
 * @ClassName: SentinelException
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 17:31
 * @Version: 1.0
 */
@Configuration
public class SentinelBlockException implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        Result result = Result.success();
        if (e instanceof FlowException) {
            result = Result.fail("接口限流了");
        } else if (e instanceof DegradeException) {
            result = Result.fail("服务降级了");
        } else if (e instanceof ParamFlowException) {
            result = Result.fail("热点参数限流了");
        } else if (e instanceof SystemBlockException) {
            result = Result.fail("系统规则（负载/...不满足要求）");
        } else if (e instanceof AuthorityException) {
            result = Result.fail("授权规则不通过");
        }
        // http状态码
        httpServletResponse.setStatus(500);
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        httpServletResponse.setContentType("application/json;charset=utf-8");
        // spring mvc自带的json操作工具，叫jackson
        new ObjectMapper().writeValue(httpServletResponse.getWriter(), result);
    }
}
