package com.tanmoy.empdeptservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tanmoy.empdeptservice.model.Employee;

@RestController
@RequestMapping("/empdept")
public class EmpDeptController {

	private RestTemplate restTemp;

	@Value("${service.app.employee}")
	private String empBaseUrl;
	@Value("${service.app.department}")
	private String deptBaseUrl;

	@Autowired
	public EmpDeptController(RestTemplate restTemp) {
		this.restTemp = restTemp;
	}

	@GetMapping("/findemployeeby")
	public Employee findEmployeeBy(@RequestParam(name = "id", required = false) Integer id,
			@RequestParam(name = "code", required = false) String code) {
		String baseURI = empBaseUrl + "/findby?", extraURI = "";

		if (id != null) extraURI += "id=" + id;
		else extraURI += "code=" + code;

		Employee emp = restTemp.getForObject(baseURI + extraURI, Employee.class);
		return emp;
	}

}
