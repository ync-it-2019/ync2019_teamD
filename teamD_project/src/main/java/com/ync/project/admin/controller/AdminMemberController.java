package com.ync.project.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ync.project.admin.service.AdminMemberService;
import com.ync.project.domain.Criteria;
import com.ync.project.domain.MemberVO;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: AdminMemberController.java
  * @Date		: 2019. 12. 7. 
  * @Author		: 이승철
  * @프로그램 설명 : 회원관리 메뉴 컨트롤러
 */
@Controller
@Log4j
public class AdminMemberController {
	
	@Autowired
	private AdminMemberService service;
	
	/**
	 * 
	  * @Method 설명 : 회원목록 컨트롤러
	  * @Method Name : member
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_member")
	public String member(Model model) {

		log.info("Welcome member!");
		
		log.info("member call... " + service.adminUserGet());
		
		model.addAttribute("member", service.adminUserGet());
	
		return "admin/admin_member";
	}
	
}
