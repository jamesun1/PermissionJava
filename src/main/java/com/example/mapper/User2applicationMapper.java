package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.User2application;
import com.example.util.MyMapper;
import com.example.vo.ApplicationVo;

public interface User2applicationMapper extends MyMapper<User2application> {

	List<ApplicationVo> getPermissionList(User2application user2application);

}