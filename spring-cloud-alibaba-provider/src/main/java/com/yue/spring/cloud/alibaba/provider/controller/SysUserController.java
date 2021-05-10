package com.yue.spring.cloud.alibaba.provider.controller;

import com.yue.spring.cloud.alibaba.common.bean.user.SysUserPo;
import com.yue.spring.cloud.alibaba.provider.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 查询用户列表
     *
     * @return: java.util.List<com.yue.spring.cloud.alibaba.common.bean.user.SysUserPo>
     * @Author: YUE
     * @Date: 2021/5/8 15:28
     **/
    @GetMapping("/list")
    public List<SysUserPo> list() {
        List<SysUserPo> list = sysUserService.selectList();
        return list;
    }
}
