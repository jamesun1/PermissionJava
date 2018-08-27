package com.example.vo;

import java.util.List;

import com.example.model.Application;

public class ApplicationVo  extends Application{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Application> zishuju;
    private String userinfoid;
    
	public String getUserinfoid() {
		return userinfoid;
	}

	public void setUserinfoid(String userinfoid) {
		this.userinfoid = userinfoid;
	}

	public List<Application> getZishuju() {
		return zishuju;
	}

	public void setZishuju(List<Application> zishuju) {
		this.zishuju = zishuju;
	}

	
}
