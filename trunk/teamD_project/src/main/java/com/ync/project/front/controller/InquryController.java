package com.ync.project.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;
import com.ync.project.domain.PageDTO;
import com.ync.project.front.service.InquryService;
import com.ync.project.util.UploadUtils;

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
	
	@Autowired
	private InquryService service;
	
	/**
     * @Method 설명 : front/*.jsp (문의하기, 문의 내용보기, 문의 목록) 호출
     * @Method Name : 
     * @Date : 2019. 10. 23
     * @작성자 : 이미영
     * @return call jsp view
     */
	
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
	
	@GetMapping("/onetoone")
	public String onetoone(Criteria cri, Model model) {
		  log.info("Welcome onetoone!");
		  log.info("list: " + cri);
	      model.addAttribute("list", service.getListWithPaging(cri));
	      model.addAttribute("pageMaker", new PageDTO(cri, 123));
	      int total = service.getTotal(cri);
	      log.info("total: " + total);
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	      return "front/onetoone";
	}
	
	
	@GetMapping("/otoform")
	@PreAuthorize("isAuthenticated()")
	public String otoform() {

		log.info("Welcome otoform!");
		
		return "front/otoform";	
	}
	
	@PostMapping("/otoform")
	@PreAuthorize("isAuthenticated()")
	public String otoform2(MultipartFile[] uploadFile,
			              InquryVO inqury, 
			              RedirectAttributes rttr) {

//		int index = 0;
		log.info("InquryVO_test:" + inqury);
		log.info("testtest:" + uploadFile);
//		for (MultipartFile multipartFile : uploadFile) {
//			if (multipartFile.getSize() > 0) {
//				if (index == 0) {
//					inqury.setAttach(UploadUtils.uploadFormPost(multipartFile, uploadPath));
//				}
//				index++;
//			}
//		}
		log.info("register: " + inqury);
		service.register(inqury);
		rttr.addFlashAttribute("result", inqury.getInqury_num());
		return "redirect:/onetoone";
	}
	
	@GetMapping("/onedetail")
	public String onedetail(@RequestParam("inqury_num") Long inqury_num, 
			                Model model) {
		log.info("Welcome inquryDetail!");
		log.info("inqury_num: " + inqury_num);
		model.addAttribute("inqury", service.get(inqury_num));
		return "front/onedetail";
	}
	
	@PostMapping("/InquryDelete")
	@PreAuthorize("isAuthenticated()")
	public String removeInqury(long inqury_num) {
		
		service.InquryDeleting(inqury_num);
		
		return "redirect:/onetoone";
	}

}
