package com.yue.spring.cloud.alibaba.consumer.controller;

import com.yue.spring.cloud.alibaba.consumer.service.IOrderItemService;
import com.yue.spring.cloud.alibaba.consumer.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ConsumerController {
    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private IOrderItemService orderItemService;

    @GetMapping("/user/list")
    public List userList(){
        return sysUserService.list();
    }

    @GetMapping("/order/list")
    public List orderList(){
        return orderItemService.list();
    }
}
