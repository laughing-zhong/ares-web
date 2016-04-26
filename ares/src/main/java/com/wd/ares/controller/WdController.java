package com.wd.ares.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wd.ares.bean.WUser;
import com.wd.ares.service.DataSoruceService;




@Controller
public class WdController {
	
	@Inject
	private DataSoruceService  dss;
	
	@RequestMapping(value = "/wd/user",method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody	
	public WUser  getUser(){
		WUser user = new WUser();
		dss.excuteSql("sql");
		return user;
		
	}

}
