package com.wd.ares.service;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class DataSoruceService {
	
	private JdbcTemplate jdbcTemplate;
	@Resource(name="dataSource")
	private void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
    }
	
	public int  excuteSql(String sql){
		return  jdbcTemplate.update(sql);		
	}
}
