package com.lhl.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lhl.sw.restful.EmpRestService;
import com.lhl.sw.service.EmpService;
import com.sun.org.apache.xerces.internal.util.XML11Char;

public class JAXTest {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"spring_jpa.xml");

		Arrays.asList(app.getBeanDefinitionNames()).forEach((b) -> {
			System.out.println(b);
		});
	}
}
