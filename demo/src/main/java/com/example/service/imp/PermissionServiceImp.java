package com.example.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.User2applicationMapper;
import com.example.model.User2application;
import com.example.service.PermissionService;
import com.example.util.LogicalException;
import com.example.vo.ApplicationVo;



@Service
public class PermissionServiceImp  implements  PermissionService{

	@Autowired
	private User2applicationMapper user2applicationMapper;
	
	@Override
	public  List<ApplicationVo> getPermissionList(String str) throws LogicalException {
		// TODO Auto-generated method stub
		List<ApplicationVo> list = null;
		User2application user2application=new User2application();
		user2application.setUserinfoid(str);
		list=user2applicationMapper.getPermissionList(user2application);
		
		return  list;
	}

}
