package com.lhl.sw.restful;

import javax.annotation.Resource;
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

import com.lhl.sw.service.EmpService;
import com.lhl.sw.service.impl.EmpSerivceImpl;

@Path("/sw")
public class EmpRestService {
	private static final EmpService empService = new EmpSerivceImpl();

	public EmpRestService() {
		System.out.println("call constructor.");
	}

	@GET
	@Path("/{para}")
	@Produces(MediaType.TEXT_PLAIN)
	public String restTest(@PathParam("para") String para) {
		return empService.restTest(para);
	}

	public String restTest1(String para) {
		return empService.restTest(para);
	}
}
