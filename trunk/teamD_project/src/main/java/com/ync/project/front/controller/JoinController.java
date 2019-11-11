package com.ync.project.front.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * @FileName   : JoinController.java
 * @Date       : 2019. 10. 21. 
 * @Author     : 이미영
 * @프로그램 설명      : 마이페이지 호출용 controller
 */
@Controller
@Log4j
@AllArgsConstructor
public class JoinController {
	
	/**
     * @Method 설명 : front/*.jsp (회원가입 완료, 투자회원 등록, 투자회원 등록 완료) 호출
     * @Method Name : 
     * @Date : 2019. 10. 21.
     * @작성자 : 이미영
     * @return call jsp view
     */
	
	private MemberService service;
	
	@GetMapping(value = "/joinsuccess")
	public String joinsuccess() {
		log.info("joinsuccess!");
		return "front/joinsuccess";
	}
	
	@GetMapping(value = "/investorjoin")
	public String investorjoin() {
		log.info("Welcome investorjoin!");
		return "front/investorjoin";
	}
	
	@GetMapping(value = "/investorsuccess")
	public String investorsuccess() {
		log.info("investorsuccess!");
		return "front/investorsuccess";
	}
	
	@RequestMapping("/join")
	@PostMapping(value="/join",
			consumes = "apllication/json",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody MemberVO member) {
		
		log.info("MemberVO: " + member);
		
		int insertCount = service.register(member);
		
		log.info("Member INSERT COUNT: " + insertCount);
		
		return insertCount == 1
		?  new ResponseEntity<>("success", HttpStatus.OK)
		:  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
