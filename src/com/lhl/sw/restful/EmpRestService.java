package com.lhl.sw.restful;

import javax.annotation.Resource;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.util.JavaScriptUtils;

import com.lhl.sw.service.EmpService;
import com.lhl.sw.service.impl.EmpSerivceImpl;

@Path("/sw")
@Singleton
public class EmpRestService {
	@Autowired
	private EmpService empService;

	public EmpRestService() {
		System.out.println("called.........................");
	}

	@GET
	@Path("/{para}")
	@Produces(MediaType.APPLICATION_JSON)
	public String restTest(@PathParam("para") String para) {
		return "[" + empService.restTest(para) + "]";
	}
}
