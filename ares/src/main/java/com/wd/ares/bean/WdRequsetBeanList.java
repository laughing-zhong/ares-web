package com.wd.ares.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class WdRequsetBeanList {
	private List<WdRequest> wdReqValues = new ArrayList<WdRequest>();
}
