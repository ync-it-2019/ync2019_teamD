package com.ync.project.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ync.project.admin.service.AdminProjectService;
import com.ync.project.domain.ProjectVO;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: AdminMemberController.java
  * @Date		: 2019. 12. 8. 
  * @Author		: 이승철
  * @프로그램 설명 : 프로젝트 메뉴 컨트롤러
 */
@Controller
@Log4j
public class AdminProjectController {
	
	@Autowired
	private AdminProjectService service;
	
	/**
	 * 
	  * @Method 설명 : 진행중인 프로젝트 조회
	  * @Method Name : project
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_project")
	public String project(Model model) {

		log.info("Welcome admin Project!");
		
		model.addAttribute("project", service.adminProjectGet());
	
		return "admin/admin_project";
	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 시작 처리
	  * @Method Name : projectStarting
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @param project_num
	  * @return
	 */
	@PostMapping(value="/admin/start")
	public String projectStarting(long project_num) {
		
		service.ProjectStarting(project_num);
		
		return "redirect:/admin/admin_openProject";
	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 중지 처리
	  * @Method Name : projectStopping
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @param project_num
	  * @return
	 */
	@PostMapping(value="/admin/stop")
	public String projectStopping(long project_num) {
		
		service.ProjectStopping(project_num);
		
		return "redirect:/admin/admin_project";
	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 삭제준비 처리
	  * @Method Name : projectDeleting
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @param project_num
	  * @return
	 */
	@PostMapping(value="/admin/delete")
	public String projectDeleting(long project_num) {
		
		service.ProjectDeleting(project_num);
		
		return "redirect:/admin/admin_project";
	}
	
	/**
	 * 
	  * @Method 설명 : 오픈 예정 프로젝트 조회
	  * @Method Name : openProject
	  * @Date : 2019. 12. 7.
	  * @작성자 : 이승철
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_openProject")
	public String openProject(Model model) {

		log.info("Welcome openProject!");
		
		model.addAttribute("project", service.adminOpenProjectGet());
	
		return "admin/admin_openProject";
	}
	
	/**
	 * 
	  * @Method 설명 : 마감 된 프로젝트 목록
	  * @Method Name : endproject
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_endProject")
	public String endproject(Model model) {

		log.info("Welcome endProject!");
		
		model.addAttribute("project", service.adminEndProjectGet());
	
		return "admin/admin_endProject";
	}
	
	/**
	 * 
	  * @Method 설명 : 신청한 프로젝트 목록
	  * @Method Name : writeproject
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_writeProject")
	public String writeproject(Model model) {

		log.info("Welcome writeProject!");
		
		model.addAttribute("project", service.adminRequestProjectGet());
	
		return "admin/admin_writeProject";
	}
	
	/**
	 * 
	  * @Method 설명 : 신청받은 프로젝트 오픈예정 처리 하기
	  * @Method Name : projectStandBying
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @param project_num
	  * @return
	 */
	@PostMapping(value="/admin/standBy")
	public String projectStandBying(long project_num) {
		
		service.ProjectStandBying(project_num);
		
		return "redirect:/admin/admin_writeProject";
	}
	
	/**
	 * 
	  * @Method 설명 : 신청한 프로젝트 내용 보기
	  * @Method Name : admin_writeProject_View
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @param project_num
	  * @param vo
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_writeProject_View")
	public String admin_writeProject_View(@RequestParam long project_num,ProjectVO vo,Model model) {

		log.info("Welcome writeProject!");
		
		vo = service.RequestProject(project_num);
		
		vo.setProject_num(project_num);
		
		model.addAttribute("project", vo);
	
		return "admin/admin_writeProject_View";
	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 삭제신청 목록
	  * @Method Name : removeProject
	  * @Date : 2019. 12. 8.
	  * @작성자 : 이승철
	  * @param model
	  * @return
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_removeProject")
	public String removeProject(Model model) {

		log.info("Welcome removeProject!");
		
		model.addAttribute("project", service.adminRemoveRequestProjectGet());
		
		log.info(service.adminRemoveRequestProjectGet());
	
		return "admin/admin_removeProject";
	}
	
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/admin/admin_comment")
	public String admin_comment(ProjectVO vo,Model model) {

		log.info("Welcome writeProject!");
		
		model.addAttribute("comment", service.adminCommentGet());
		
		model.addAttribute("ripple", service.adminRRippleGet());
	
		return "admin/admin_comment";
	}
	
	
	@PostMapping(value="/admin/com_delete")
	public String CommentDelete(long ripple_num) {
		
		service.ProjectStandBying(ripple_num);
		
		return "redirect:/admin/admin_comment";
	}
	
	
	@PostMapping(value="/admin/rip_delete")
	public String RippleDelete(long ripple_ripple_num) {
		
		service.RRippleDelete(ripple_ripple_num);
		
		return "redirect:/admin/admin_comment";
	}
}
