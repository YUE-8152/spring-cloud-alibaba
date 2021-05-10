package com.yue.spring.cloud.alibaba.providertwo.service.impl;

import com.yue.spring.cloud.alibaba.common.bean.order.OrderItemPo;
import com.yue.spring.cloud.alibaba.providertwo.dao.order.OrderItemMapper;
import com.yue.spring.cloud.alibaba.providertwo.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.providertwo.service.impl
 * @ClassName: OrderItemServiceImpl
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 11:17
 * @Version: 1.0
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItemPo> selectList() {
        return orderItemMapper.selectAll();
    }
}
