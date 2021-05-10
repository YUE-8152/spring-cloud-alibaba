package com.yue.spring.cloud.alibaba.provider.service.impl;

import com.yue.spring.cloud.alibaba.common.bean.user.SysUserPo;
import com.yue.spring.cloud.alibaba.provider.dao.user.SysUserMapper;
import com.yue.spring.cloud.alibaba.provider.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.provider.service.impl
 * @ClassName: SysUserServiceImpl
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 11:01
 * @Version: 1.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUserPo> selectList() {
        return sysUserMapper.selectAll();
    }
}
