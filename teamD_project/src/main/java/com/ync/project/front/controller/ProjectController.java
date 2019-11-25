package com.ync.project.front.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.access.prepost.PreAuthorize;
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
import com.ync.project.front.service.ProjectService;
import com.ync.project.util.UploadUtils;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: ProjectController.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이준혁
  * @프로그램 설명 : 프로젝트 페이지 호출용 controller
  */


@Controller
@Log4j
@RequestMapping("front/*")
public class ProjectController {
	@Autowired
	private ProjectService service;
	/**
	  * @Method 설명 : front/*.jsp (한눈에보기,프로젝트,오픈예정,문화컨텐츠,종료된프로젝트) 호출
	  * @Method Name : 
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이준혁
	  * @return call jsp view
	  */
	
	//자바 소스에서  경로 읽어오기 위해서
	//globalConfig.uploadPath라고하는 것을 읽어와서 uploadPath에 저장
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
	
	
	@GetMapping(value = "/total")
	public String total() {

		log.info("Welcome total!");
	
		return "front/total";
	}
	
	@GetMapping(value = "/")
	public void home() {

		log.info("Welcome home!");
//	
//		return "redirect:/";
	}
	
	@GetMapping(value = "/project")
	public void project(Criteria cri, Model model) {

		  log.info("Welcome project!");
	      log.info("list: " + cri);
	      model.addAttribute("list", service.getListWithPaging(cri));
//	      model.addAttribute("pageMaker", new PageDTO(cri, 123));
	      int total = service.getTotal(cri);
	      log.info("total: " + total);
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	}


	//여기 카테고리 관련 컨트롤러 넣어야함 11-04
	   
	
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
	public void projectwrite() {

		log.info("Welcome writer!");
		
	}
	
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 작성 컨트롤러 write1에서 1은 나중에 수정필요 현재 인증빼고 됨
	  * @Method Name : projectwrite
	  * @Date : 2019. 11. 5.
	  * @작성자 : 이지원
	  * @param uploadFile
	  * @param project
	  * @param rttr
	  * @return
	 */
	@PostMapping("/project_write1")
//	@PreAuthorize("isAuthenticated()") //인증된 사용자 라는 뜻 true
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
			//list.add(UploadUtils.uploadFormPost(multipartFile));
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
	  * @Method 설명 : 프로젝트 상세보기 현재 작업중
	  * @Method Name : projectDetail
	  * @Date : 2019. 11. 5.
	  * @작성자 : 이지원
	 */
	@GetMapping("/single")
	public void projectDetail(@RequestParam("project_num") Long pno, @ModelAttribute("cri") Criteria cri, Model model) {
		
		log.info("Welcome projectDetail!");

	    model.addAttribute("project", service.get(pno));
	
	}

}
