package com.wd.ares.controller;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wd.ares.db.rpc.WdRpcRequest;
import com.wd.ares.db.service.WdService;
import com.wd.ares.db.utils.WdBeanUtils;

@Controller
public class WdRpcController {
	
	@Inject
	 private DataSource dataSource;  
	
	@Inject
	List<WdService> wdSericeList;
	
	@RequestMapping(value = "/wd",method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody	
	public String wdRpc(@RequestBody WdRpcRequest requestBean) throws SQLException, IOException {
//		Connection con = dataSource.getConnection();	
//		String insertValues = WdBeanUtils.concertBeanListToInsertValue(requestBean.get);
//		System.out.println(" values = " + insertValues);
//		CallableStatement cstmt = con.prepareCall("{call dbo.wdProc_k3wsi_allprocess(?,?,?)}");
//		cstmt.setString(1, "201");
//		cstmt.setString(2, insertValues);
//		cstmt.registerOutParameter(3, java.sql.Types.CHAR);
//		cstmt.execute();
//		String ret = cstmt.getNString(3);
//		System.out.println("ret : " + ret);
		return ret;
	}

}
