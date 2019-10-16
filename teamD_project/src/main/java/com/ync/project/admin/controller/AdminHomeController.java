package com.ync.project.admin.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: HomeController.java
  * @Date		: 2019. 10. 16. 
  * @Author		: 정진우
  * @프로그램 설명 : 메인 페이지 호출용 controller
  */
@Controller
@Log4j
public class AdminHomeController {
	
	/**
	  * @Method 설명 : admin/index.jsp 호출
	  * @Method Name : home
	  * @Date : 2019. 10. 16.
	  * @작성자 : 정진우
	  * @return call jsp view
	  */
	@GetMapping(value = "/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String home() {

		log.info("Welcome Admin home!");
	
		return "admin/index";
	}
	
}
