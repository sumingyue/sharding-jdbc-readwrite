package com.sharding.demo.shardingjdbc.repository;

import com.sharding.demo.shardingjdbc.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TUserRepository {
    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll(TUser record);
}