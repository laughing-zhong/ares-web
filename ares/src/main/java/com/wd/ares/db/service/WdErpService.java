package com.wd.ares.db.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wd.ares.bean.WdRequest;
import com.wd.ares.db.rpc.WdRpcResponse;

@Component
public class WdErpService  implements WdService{
	
	public  WdRpcResponse saveMetrial(List<WdRequest>  wdRequest){
		
		return new WdRpcResponse();
	}

}
