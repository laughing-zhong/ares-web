package com.wd.ares.controller;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wd.ares.bean.WdRequsetBeanList;
import com.wd.ares.db.utils.BeanUtils;

@Controller
public class WdController {
	
	@Inject
	 private DataSource dataSource;  
	
	@RequestMapping(value = "/wd",method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody	
	public String getUser(@RequestBody WdRequsetBeanList reqiestBean, HttpServletRequest request) throws SQLException, IOException {
	//public String getUser(HttpServletRequest httpServletRequest) throws SQLException {

	    int length = request.getContentLength();
		Connection con = dataSource.getConnection();
		
		ServletInputStream  instream  = request.getInputStream();
		
		String insertValues = BeanUtils.concertBeanToInsertValue(reqiestBean.getReqValues().get(0));
		CallableStatement cstmt = con.prepareCall("{call dbo.wdProc_k3wsi_allprocess(?,?,?)}");
		cstmt.setString(1, "201");
		cstmt.setString(2, insertValues);
		cstmt.registerOutParameter(3, java.sql.Types.CHAR);
		cstmt.execute();
		String ret = cstmt.getNString(3);
		System.out.println("MANAGER ID: " + ret);
		return ret;
	}

}
