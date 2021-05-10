package com.yue.spring.cloud.alibaba.providertwo.controller;

import com.yue.spring.cloud.alibaba.common.bean.order.OrderItemPo;
import com.yue.spring.cloud.alibaba.providertwo.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    /**
     * 查询订单列表
     *
     * @return: java.util.List<com.yue.spring.cloud.alibaba.common.bean.order.OrderItemPo>
     * @Author: YUE
     * @Date: 2021/5/8 15:31
     **/
    @GetMapping("/list")
    public List<OrderItemPo> list() {
        List<OrderItemPo> list = orderItemService.selectList();
        return list;
    }
}
