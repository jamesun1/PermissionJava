package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PermissionService;
import com.example.util.ApiResult;
import com.example.vo.ApplicationVo;

@RestController
@RequestMapping("permission")
public class PermissionController {

	
 @Autowired	
 private PermissionService 	permissionservice;
 
 
	@RequestMapping("getPermisson")
	public ApiResult getList(String str) {
		ApiResult result = new ApiResult();
		try {
			List<ApplicationVo> vo=permissionservice.getPermissionList(str);
			return result.success(vo);
			
		} catch (Exception e) {
			// TODO: handle exception
			return result.fail("no......");
		} 
	}

}
