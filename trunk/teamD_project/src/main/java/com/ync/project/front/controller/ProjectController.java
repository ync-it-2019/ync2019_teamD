package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.util.UploadUtils;
import com.ync.project.domain.ProjectVO;
//import com.ync.project.front.service.ProjectService;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: ProjectController.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이준혁
  * @프로그램 설명 : 프로젝트 페이지 호출용 controller
  */
@Controller
@Log4j
public class ProjectController {
//	private ProjectService service;
	/**
	  * @Method 설명 : front/*.jsp (한눈에보기,프로젝트,오픈예정,문화컨텐츠,종료된프로젝트) 호출
	  * @Method Name : 
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이준혁
	  * @return call jsp view
	  */
	
	@GetMapping(value = "/total")
	public String total() {

		log.info("Welcome total!");
	
		return "front/total";
	}
	
	@GetMapping(value = "/project")
	public String project() {

		log.info("Welcome project!");
	
		return "front/project";
	}
	
	@GetMapping(value = "/open")
	public String open() {

		log.info("Welcome open!");
	
		return "front/open";
	}
	
	@GetMapping(value = "/culture")
	public String culture() {

		log.info("Welcome culture!");
	
		return "front/culture";
	}
	
	@GetMapping(value = "/end")
	public String end() {

		log.info("Welcome end!");
	
		return "front/end";
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
	public String projectwrite() {

		log.info("Welcome writer!");
	
		return "front/project_write";
	}
	
	@PostMapping("/project_write")
	public String projectwrite(MultipartFile[] uploadFile,
			ProjectVO project,RedirectAttributes rttr) {
//		
//		int index = 0;
//		for (MultipartFile multipartFile : uploadFile) {
//			if(multipartFile.getSize()>0) {
//			switch (index) {
//			case 0:
//				project.setAttach_1(UploadUtils.uploadFormPost(multipartFile)); //배열로 처리되기때문에 index가 0일경우
//				break;
//			case 1:
//				project.setAttach_2(UploadUtils.uploadFormPost(multipartFile));
//				break;
//			default:
//				project.setAttach_3(UploadUtils.uploadFormPost(multipartFile));
//				break;
//			}
//			//list.add(UploadUtils.uploadFormPost(multipartFile));
//			index++;
//			}
//		}
//		
		log.info("register: " + project);
//		service.register(project);
		rttr.addFlashAttribute("result", project.getProject_num());
		
		return "redirect:/project";
	}
	
	
	@GetMapping(value = "/project_write_finish")
	public String projectwriteFinish() {

		log.info("Welcome writer!");
	
		return "front/project_write";
	}

}
