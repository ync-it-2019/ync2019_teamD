package com.ync.project.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ync.project.admin.service.AdminMemberService;
import com.ync.project.admin.service.AdminProjectService;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: HomeController.java
  * @Date		: 2019. 10. 16. 
  * @Author		: 정진우
  * @프로그램 설명 : 메인 페이지 호출용 controller
  */
@Controller
@Log4j
public class AdminDashboardController {
	
	@Autowired
	private AdminProjectService service;
	
	@Autowired
	private AdminMemberService memberService;
	/**
	 * 
	  * @Method 설명 : 프로젝트 통계 페이지
	  * @Method Name : dashboardProject
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "admin/admin_dashboardProject")
	public String dashboardProject(Model model) {

		log.info("Welcome dashboardProject!");
		
		model.addAttribute("count", service.projectDashboardCountGet());
		
		model.addAttribute("category", service.projectDashboardCategoryRankGet());
		
		model.addAttribute("project", service.projectDashboardProjectRankGet());
	
		return "admin/admin_dashboardProject";
	}
	
	/**
	 * 
	  * @Method 설명 :
	  * @Method Name : invest
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_invest")
	public String invest(Model model) {

		log.info("Welcome invest!");
		
		model.addAttribute("count", service.investCountProjectCount());
		
		model.addAttribute("idCnt", memberService.investorCountGet());
		
		model.addAttribute("member", memberService.investRankGet());
	
		return "admin/admin_invest";
	}
	
}
