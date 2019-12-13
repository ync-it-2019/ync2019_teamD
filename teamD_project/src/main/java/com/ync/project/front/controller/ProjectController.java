package com.ync.project.front.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.PageDTO;
import com.ync.project.domain.ProjectVO;
import com.ync.project.front.service.InvestorService;
import com.ync.project.front.service.MemberService;
import com.ync.project.front.service.ProjectService;
import com.ync.project.front.service.RippleService;
import com.ync.project.security.CustomUserDetailsService;
import com.ync.project.util.UploadUtils;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: ProjectController.java
  * @Date		: 2019. 12. 12. 
  * @Author		: 이지원
  * @프로그램 설명 : 프로젝트 페이지 호출용 controller
  */


@Controller
@Log4j
@RequestMapping("front/*")
public class ProjectController {
	@Autowired
	private ProjectService service;
	@Autowired
	private InvestorService service2;
	@Autowired
	private RippleService service3;
	@Autowired
	private MemberService service4;
	
	//자바 소스에서  경로 읽어오기 위해서
	//globalConfig.uploadPath라고하는 것을 읽어와서 uploadPath에 저장
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
	
	
	@GetMapping(value = "/total")
	public String total() {

		log.info("Welcome total!");
	
		return "front/total";
	}
	/**
	 * 
	  * @Method 설명 : 메인홈으로 갈 수 있는 메소드
	  * @Method Name : home
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	  * @param cri
	  * @param model
	 */
	@GetMapping(value = "/home")
	public void home(Criteria cri, Model model) {
		log.info("Welcome home!");
	}
	/**
	 * 
	  * @Method 설명 : project에서의 작업용
	  * @Method Name : project
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	  * @param cri 한 페이지에 일정개수의 글을 뽑기위한 변수
	  * @param model 프로젝트 리스트 정보 프론트로 넘겨줌
	 */
	@GetMapping(value = "/project")
	public void project(Criteria cri, Model model) {
		  log.info("Welcome project!");
		  
		  model.addAttribute("rank_list", service.getList(cri));
		  cri.setP_type("ongoing");
		  
	      log.info("list: " + cri + " " + cri.getAmount() + " " + cri.getPageNum());
	      model.addAttribute("list", service.getListWithPaging(cri));
	     
	      int total = service.project_getTotal(cri);
	      log.info("total: " + total);
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	}

	/**
	 * 
	  * @Method 설명 : 오픈예정의 게시물 목록 출력
	  * @Method Name : open
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	 */
	@GetMapping(value = "/open")
	public void open(Criteria cri, Model model) {

		log.info("Welcome open!");
	
		cri.setP_distinct("ongoing");
		cri.setP_type("open");
	    log.info("list: " + cri);
	    model.addAttribute("list", service.getListWithPaging(cri));
	    int total = service.project_getTotal(cri);
	    log.info("total: " + total);
	    model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	/**
	 * 
	  * @Method 설명 : 문화콘텐츠의 게시물 목록 출력
	  * @Method Name : culture
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	 */
	@GetMapping(value = "/culture_project")
	public void culture(Criteria cri, Model model) {
		log.info("Welcome culture_project!");
		  
		  cri.setP_type("culture");
		  model.addAttribute("rank_list", service.getList(cri));
	      log.info("list: " + cri + " " + cri.getAmount() + " " + cri.getPageNum());
	      model.addAttribute("list", service.getListWithPaging(cri));
	     
	      int total = service.project_getTotal(cri);
	      log.info("total: " + total);
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	
	}
	/**
	 * 
	  * @Method 설명 : 종료된 프로젝트의 게시물 목록 출력
	  * @Method Name : end
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	 */
	@GetMapping(value = "/end")
	public void end(Criteria cri, Model model) {
		log.info("Welcome end!");
		cri.setP_distinct("end");
		cri.setP_type("end");
	    log.info("list: " + cri);
	    model.addAttribute("list", service.getListWithPaging(cri));
	    int total = service.project_getTotal(cri);
	    log.info("total: " + total);
	    model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	/**
	 * 
	  * @Method 설명 : 프로젝트 작성 파트
	  * @Method Name : projectwrite
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이승철
	  * @return
	 */
	@GetMapping(value = "/project_write")
	@PreAuthorize("isAuthenticated()") //인증된 사용자 라는 뜻 true
	public void projectwrite() {

		log.info("Welcome writer!");
		
	}
	
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 작성 컨트롤러. 
	  * @Method Name : projectwrite
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	  * @param uploadFile 업로드 파일 5개를 받는 변수
	  * @param project 입력했던 정보를 담는 VO
	  * @param rttr 처리결과 메세지를 담음
	  * @return
	 */
	@PostMapping("/project_write1")
	public String projectwrite(MultipartFile[] uploadFile,
			ProjectVO project, RedirectAttributes rttr) {
		
		int index = 0;
		for (MultipartFile multipartFile : uploadFile) {
			if(multipartFile.getSize()>0) {
			switch (index) {
			case 0:
				project.setTitle_image(UploadUtils.uploadFormPost(multipartFile, uploadPath));
				break;
			case 1:
				project.setAttach_1(UploadUtils.uploadFormPost(multipartFile, uploadPath)); //배열로 처리되기때문에 index가 0일경우
				break;
			case 2:
				project.setContents_image1(UploadUtils.uploadFormPost(multipartFile, uploadPath));
				break;
			case 3:
				project.setContents_image2(UploadUtils.uploadFormPost(multipartFile, uploadPath));
				break;
			case 4:
				project.setAttach_2(UploadUtils.uploadFormPost(multipartFile, uploadPath));
				break;
			default:
				project.setAttach_3(UploadUtils.uploadFormPost(multipartFile, uploadPath));
				break;
			}
			index++;
			}
		}
		
		log.info("register: " + project);
		service.register(project);
		rttr.addFlashAttribute("result", project.getProject_num());
		
		return "redirect:/front/project";
	}
	
	
	@GetMapping(value = "/project_write_finish")
	public String projectwriteFinish() {

		log.info("Welcome writer_finish!");
	
		return "front/project_write_finish";
	}
	/**
	 * 
	  * @Method 설명 : 프로젝트 상세보기
	  * @Method Name : projectDetail
	  * @Date : 2019. 11. 5.
	  * @작성자 : 이지원
	 */
	@GetMapping("/single")
	public void projectDetail(@RequestParam("project_num") Long pno, @ModelAttribute("cri") Criteria cri, Model model, Principal principal) {
		
		log.info("Welcome projectDetail!");
		
		log.info("project_log" + service.get(pno));
	    model.addAttribute("project", service.get(pno));
	    
	    //로그인 값 안넣어도 들어가게끔 if문
	    log.info("testtest" + principal);
	    if(principal != null) {
			String id = principal.getName();
			model.addAttribute("login_user",service4.get(id));
	    }
	    
	    
	    log.info("investorList_log" + service2.getList(pno));
	    model.addAttribute("investorList", service2.getList(pno));
	    
	    log.info("service3_log " + service3.getList(pno));
	    model.addAttribute("ripple", service3.getList(pno));
	   
	   if(principal != null) {
		   log.info("service4_log : " + service4.myPage(principal.getName()));
		   model.addAttribute("login_info", service4.myPage(principal.getName()));
		   model.addAttribute("princ", principal.getName());
	   }
	}
	/**
	 * 
	  * @Method 설명 : 종료된 프로젝트의 상세보기
	  * @Method Name : projectDetail2
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	  * @param pno 페이지번호
	  * @param principal 로그인 한 계정의 아이디
	 */
	@GetMapping("/single_end")
	public void projectDetail2(@RequestParam("project_num") Long pno, 
			@ModelAttribute("cri") Criteria cri, Model model, 
			Principal principal) {
		
		log.info("Welcome projectDetailEnd!");
		
		log.info("project_log" + service.get(pno));
	    model.addAttribute("project", service.get(pno));
	    
	    //로그인 값 안넣어도 들어가게끔 if문
	    log.info("testtest" + principal);
	    if(principal != null) {
			String id = principal.getName();
			model.addAttribute("login_user",service4.get(id));
	    }
	    
	    log.info("investorList_log" + service2.getList(pno));
	    model.addAttribute("investorList", service2.getList(pno));
	    
	    log.info("service3_log " + service3.getList(pno));
	   model.addAttribute("ripple", service3.getList(pno));
	   
	   if(principal != null) {
		   model.addAttribute("princ", principal.getName());
	   }
	}
	/**
	 * 
	  * @Method 설명 : 오픈예정 상세보기
	  * @Method Name : projectDetail3
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	 */
	@GetMapping("/single_open")
	public void projectDetail3(@RequestParam("project_num") Long pno, @ModelAttribute("cri") Criteria cri, Model model, Principal principal) {
		
		log.info("Welcome projectDetailOpen!");
		
		log.info("project_log" + service.get(pno));
	    model.addAttribute("project", service.get(pno));
	    
	    //로그인 값 안넣어도 들어가게끔 if문
	    log.info("testtest" + principal);
	    if(principal != null) {
			String id = principal.getName();
			model.addAttribute("login_user",service4.get(id));
	    }
	    
	    
	    log.info("investorList_log" + service2.getList(pno));
	    model.addAttribute("investorList", service2.getList(pno));
	    
	    log.info("service3_log " + service3.getList(pno));
	   model.addAttribute("ripple", service3.getList(pno));
	    
	}
	
	/**
	 * 
	  * @Method 설명 : 게시물 삭제 전 project테이블의 distinct부분을 대기 상태로 돌려 관리자가 삭제하게끔 함
	  * @Method Name : remove_standBy
	  * @Date : 2019. 12. 3.
	  * @작성자 : 이지원
	  * @return 보고있던 프로젝트의 페이지로 돌아감
	 */
	@PostMapping("/remove_standBy")
	@PreAuthorize("principal.username == #userid")
	public String remove_standBy(@RequestParam("pno") Long pno, Criteria cri, RedirectAttributes rttr, String userid) {

		log.info("remove..." + pno);
		if (service.remove_standBy(pno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/front/project" + cri.getListLink();
	}
	/**
	 * 
	  * @Method 설명 : 관리자가 remove시킬 때 사용
	  * @Method Name : remove
	  * @Date : 2019. 12. 12.
	  * @작성자 : 이지원
	 */
	@PostMapping("/remove")
//	@PreAuthorize("principal.username == #writer")
	public String remove(@RequestParam("pno") Long pno, Criteria cri, RedirectAttributes rttr) {

		log.info("remove..." + pno);
		if (service.remove(pno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/front/project" + cri.getListLink();
	}

}
