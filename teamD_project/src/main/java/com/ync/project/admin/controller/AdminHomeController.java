package com.ync.project.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ync.project.admin.service.AdminNoticeService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
  * @FileName	: HomeController.java
  * @Date		: 2019. 10. 16. 
  * @Author		: 정진우
  * @프로그램 설명 : 메인 페이지 호출용 controller
  */
@Controller
@Log4j
@RequestMapping("/admin/*")
public class AdminHomeController {

	
	 /**
	  * @Method 설명 :  탈퇴신청 화면 호출
	  * @Method Name : withdraw
	  * @Date : 2019. 12. 4.
	  * @작성자 : 김현진
	  * @return admin_withdraw.jsp view
	  */
	@GetMapping(value = "/admin_withdraw")
	public String withdraw() {

		log.info("Welcome withdraw!");
	
		return "admin/admin_withdraw";
	}
	
	 /**
	  * @Method 설명 : faq 화면 호출
	  * @Method Name : faq
	  * @Date : 2019. 12. 4.
	  * @작성자 : 김현진
	  * @return admin_faq.jsp view
	  */
	@GetMapping(value = "/admin_faq")
	public String faq() {

		log.info("Welcome faq!");
	
		return "admin/admin_faq";
	}
}
