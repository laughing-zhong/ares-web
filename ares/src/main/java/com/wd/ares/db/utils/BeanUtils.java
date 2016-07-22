package com.wd.ares.db.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.wd.ares.bean.WdRequestBean;

public class BeanUtils {
	public static String concerToInsertValue(Object msgBean) {
		Field[] fields = msgBean.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		try{
			for(int i = 0 ; i < fields.length; ++i){
				Field field = fields[i];
				String fieldName = field.getName();
				String methodName = "get" + fieldName;
				Method getMethod = msgBean.getClass().getMethod(methodName, null);
				String value = (String) getMethod.invoke(msgBean, null);
				sb.append("'");
				if(value != null)
				   sb.append(value);
				sb.append("'");
				sb.append(",");
				
			}
			return sb.substring(0, sb.length() - 1);		
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		WdRequestBean  msgBean = new WdRequestBean();
		msgBean.setFEntryID_SRC("aaa");
		String values = concerToInsertValue(msgBean);
		System.out.println("valued = " + values);
	}

}
