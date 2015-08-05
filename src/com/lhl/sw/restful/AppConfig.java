package com.lhl.sw.restful;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class AppConfig extends ResourceConfig {
	/**
	 * 53. Register JAX-RS application components. 54.
	 */

	public AppConfig() {
	//	register(RequestContextFilter.class);
		register(EmpRestService.class);
		// register features
		// register(JacksonFeature.class);
	}
}
