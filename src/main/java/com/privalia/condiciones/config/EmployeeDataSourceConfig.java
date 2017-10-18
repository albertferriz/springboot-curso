package com.privalia.condiciones.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import com.privalia.condiciones.condition.DevDataSourceCondition;
import com.privalia.condiciones.condition.ProdDataSourceCondition;
import com.privalia.condiciones.util.DataSource;
import com.privalia.condiciones.util.DevDatabaseUtil;
import com.privalia.condiciones.util.ProductionDatabaseUtil;

public class EmployeeDataSourceConfig {
	
	@Bean(name="dataSource")
	@Conditional(value=DevDataSourceCondition.class)
	public DataSource getDevDataSource() {
		return new DevDatabaseUtil();
	}
	
	@Bean(name="dataSource")
	@Conditional(value=ProdDataSourceCondition.class)
	public DataSource getProdDataSource() {
		return new ProductionDatabaseUtil();
	}
}
