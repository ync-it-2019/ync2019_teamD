package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: ServiceCenterController.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이준혁
  * @프로그램 설명 : 고객센터 페이지 호출용 controller
  */
@Controller
@Log4j
public class ServiceCenterController {
	
	/**
	  * @Method 설명 : front/*.jsp (ServiceCenter) 호출
	  * @Method Name : 
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이준혁
	  * @return call jsp view
	  */
	
	@GetMapping(value = "/fqa")
	public String fqa() {

		log.info("Welcome fqa!");
	
		return "front/fqa";
	}

}
