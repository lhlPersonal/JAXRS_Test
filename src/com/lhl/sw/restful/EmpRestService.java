package com.lhl.sw.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lhl.sw.service.EmpService;

@Component
@Path("/sw")
public class EmpRestService {
	@Autowired
	private EmpService empService;

	public EmpService getEmpService() {
		return empService;
	}

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@GET
	@Path("/{para}")
	@Produces(MediaType.TEXT_PLAIN)
	public String restTest(@PathParam("para") String para) {
		return empService.restTest(para);
	}
}
