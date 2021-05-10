package com.yue.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.feign.service
 * @ClassName: ISysUserService
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 15:06
 * @Version: 1.0
 */
@FeignClient("provider-8081")
public interface ISysUserService {
    @GetMapping("/sysUser/list")
    List list();
}
