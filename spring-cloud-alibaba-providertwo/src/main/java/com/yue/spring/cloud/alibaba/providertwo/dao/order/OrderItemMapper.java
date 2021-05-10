package com.yue.spring.cloud.alibaba.providertwo.dao.order;

import com.yue.spring.cloud.alibaba.common.bean.order.OrderItemPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItemPo record);

    OrderItemPo selectByPrimaryKey(Integer id);

    List<OrderItemPo> selectAll();

    int updateByPrimaryKey(OrderItemPo record);
}