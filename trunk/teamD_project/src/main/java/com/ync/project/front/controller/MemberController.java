package com.ync.project.front.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * @FileName : MemberController.java
 * @Date : 2019. 12. 06.
 * @Author : 이승철
 * @프로그램 설명 : 유저 관련 controller
 */
@Controller
@Log4j
@AllArgsConstructor
public class MemberController {

	/**
	 * @Method 설명 : front/*.jsp (회원가입 완료, 투자회원 등록, 투자회원 등록 완료) 호출
	 * @Method Name :
	 * @Date : 2019. 10. 21.
	 * @작성자 : 이미영
	 * @return call jsp view
	 */
	
	@Autowired
	private MemberService service;

	@GetMapping(value = "/joinsuccess")
	public String joinsuccess() {
		log.info("joinsuccess!");
		return "front/joinsuccess";
	}

	// 투자자 회원 등록
	@GetMapping(value = "/investorjoin")
	public String investorjoin(MemberVO member) {
		
		log.info("Welcome investorjoin!");
		
		return "front/investorjoin";
	}

	@GetMapping(value = "/investorsuccess")
	public String investorsuccess() {
		log.info("investorsuccess!");
		return "front/investorsuccess";
	}

//	@GetMapping(value = "/login")
//	public String login() {
//		log.info("login!");
//		return "/login";
//	}
//	@RequestMapping("/join")
//	@PostMapping(value="/join",
//			consumes = "apllication/json",
//			produces = {MediaType.TEXT_PLAIN_VALUE})
//	public ResponseEntity<String> create(@RequestBody MemberVO member) {
//		
//		log.info("MemberVO: " + member);
//		
//		int insertCount = service.insert(member);
//		
//		log.info("Member INSERT COUNT: " + insertCount);
//		
//		return insertCount == 1
//		?  new ResponseEntity<>("success", HttpStatus.OK)
//		:  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	/**
	 * 
	 * @Method 설명 : 회원가입 메소드
	 * @Method Name : register
	 * @Date : 2019. 11. 23.
	 * @작성자 : 이승철
	 * @param member
	 * @return
	 */

	@RequestMapping("/join")
	@PostMapping("/join")
	public String register(MemberVO member, Model model) {

		log.info("register...");

		// 비밀번호 암호화
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String password = encoder.encode(member.getUserpw());
		member.setUserpw(password);

		service.regist(member);
		
		

		return "redirect:/joinsuccess";
	}

	/**
	 * 
	  * @Method 설명 : 투자자회원 가입 메소드
	  * @Method Name : joinInvest
	  * @Date : 2019. 12. 6.
	  * @작성자 : 이승철
	  * @param member
	  * @param principal
	  * @return
	 */
	@RequestMapping("/investorjoin")
	@PostMapping("/investorjoin")
	public String joinInvest(MemberVO member,Principal principal) {

		log.info("register...");
		
		String userid = principal.getName();
		
		member.setUserid(userid);
		
		service.signupInvest(member);

		return "redirect:/investorsuccess";
	}

}
