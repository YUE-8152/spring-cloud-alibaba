package com.yue.spring.cloud.alibaba.provider.dao.user;

import com.yue.spring.cloud.alibaba.common.bean.user.SysUserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUserPo record);

    SysUserPo selectByPrimaryKey(Integer userId);

    List<SysUserPo> selectAll();

    int updateByPrimaryKey(SysUserPo record);

    Integer selectCount();
}