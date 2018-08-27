package com.example.service;

import java.util.List;

import com.example.model.User2application;
import com.example.util.LogicalException;
import com.example.vo.ApplicationVo;

public interface PermissionService {

	 List<ApplicationVo> getPermissionList(String str) throws LogicalException;

	
}
