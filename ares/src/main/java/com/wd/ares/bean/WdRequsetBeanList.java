package com.wd.ares.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class WdRequsetBeanList {
	
	public WdRequsetBeanList(){
		
	}
	private List<WdRequestBean> ReqValues = new ArrayList<WdRequestBean>();

}
