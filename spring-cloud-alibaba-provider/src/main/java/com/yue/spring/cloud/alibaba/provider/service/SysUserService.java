package com.yue.spring.cloud.alibaba.provider.service;

import com.yue.spring.cloud.alibaba.common.bean.user.SysUserPo;

import java.util.List;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.provider.service
 * @ClassName: SysUserService
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 11:00
 * @Version: 1.0
 */
public interface SysUserService {
    List<SysUserPo> selectList();
}
