package com.privalia.aspectos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class Principal {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-aop.xml");

		Compra cp = (Compra) ctx.getBean("compra");
		
		try {
			out.println("Invocamos sin problemas");
			cp.compra(false);
			out.println("Invocamos para que se produzca el error");
			cp.compra(true);
			
		} catch (Exception e) {
			out.println("Obtenemos la excepción " + e);
		}

	}

}
