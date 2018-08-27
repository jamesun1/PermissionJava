package com.example.mapper;

import com.example.model.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(String userinfoid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String userinfoid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}