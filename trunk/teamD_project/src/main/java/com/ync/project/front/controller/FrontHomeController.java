package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: HomeController.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이준혁
  * @프로그램 설명 : 메인 페이지 호출용 controller
  */
@Controller
@Log4j
public class FrontHomeController {
	
	/**
	  * @Method 설명 : front/home.jsp 호출
	  * @Method Name : home
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이준혁
	  * @return call jsp view
	  */
	@GetMapping(value = "/")
	public String home() {

		log.info("Welcome home!");
	
		return "front/home";
	}
	
}