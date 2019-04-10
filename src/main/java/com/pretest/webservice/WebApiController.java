package com.pretest.webservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebApiController {

	@RequestMapping("/")
	public String index() {
		return "PreTest API test!";
	}

}