package com.yue.spring.cloud.alibaba.providertwo.service;

import com.yue.spring.cloud.alibaba.common.bean.order.OrderItemPo;

import java.util.List;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.yue.spring.cloud.alibaba.providertwo.service
 * @ClassName: OrderItemService
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/8 11:16
 * @Version: 1.0
 */
public interface OrderItemService {
    List<OrderItemPo> selectList();
}
