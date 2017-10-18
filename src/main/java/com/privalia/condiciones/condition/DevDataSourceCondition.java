package com.privalia.condiciones.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevDataSourceCondition implements Condition
{

	public boolean matches(ConditionContext context, 
			AnnotatedTypeMetadata metadata) {
		
		String dbname = context.getEnvironment().getProperty("database.name");
		return dbname.equalsIgnoreCase("dev");
	}

}
