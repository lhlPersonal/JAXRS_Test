package com.lhl.sw.restful;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

import com.lhl.sw.service.impl.EmpSerivceImpl;

public class AppConfig extends ResourceConfig {
	/**
	 * 53. Register JAX-RS application components. 54.
	 */

	public AppConfig() {
		register(RequestContextFilter.class);
		register(EmpRestService.class);
	}
}
