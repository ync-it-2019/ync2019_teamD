package com.ync.project.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.InvestorVO;
import com.ync.project.front.service.InvestorService;

import lombok.extern.log4j.Log4j;



@Controller
@Log4j
@RequestMapping("invest/*")
public class InvestorController {
	@Autowired
	private InvestorService service;

	
	//자바 소스에서  경로 읽어오기 위해서
	//globalConfig.uploadPath라고하는 것을 읽어와서 uploadPath에 저장
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;

	

	@PostMapping("/funding")
//	@PreAuthorize("isAuthenticated()") //인증된 사용자 라는 뜻 true
	public String projectwrite(InvestorVO investor, RedirectAttributes rttr) {
		
		
		log.info("Controller_funding: " + investor);
		service.funding(investor);
		log.info("funding_project_num: " + investor.getProject_num());
		service.update_current(investor);
		rttr.addFlashAttribute("result", investor.getProject_num());
		
		return "redirect:/front/single?project_num="+investor.getProject_num();
	}


}
