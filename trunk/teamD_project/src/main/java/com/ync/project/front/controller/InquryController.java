package com.ync.project.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ync.project.front.service.InquryService;

import lombok.extern.log4j.Log4j;

/**
 * @FileName    : InquryController.java
 * @Date        : 2019. 10. 23 
 * @Author      : 이미영
 * @프로그램 설명        : 1:1문의 controller
 */

@Controller
@Log4j
public class InquryController {
	
	/**
     * @Method 설명 : front/*.jsp (문의하기, 문의 내용보기, 문의 목록) 호출
     * @Method Name : 
     * @Date : 2019. 10. 23
     * @작성자 : 이미영
     * @return call jsp view
     */
	
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
	
	@Autowired
	private InquryService service;
	
	@GetMapping("/register")
	@PreAuthorize("isAuthenticated()")
	public void register() {
		log.info("register...");
	}
	
}
