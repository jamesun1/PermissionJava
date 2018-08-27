package com.example.mapper;

import com.example.model.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(String orgid);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(String orgid);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}