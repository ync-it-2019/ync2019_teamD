package com.ync.project.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.PageDTO;
import com.ync.project.front.service.MemberService;
import com.ync.project.front.service.ProjectService;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: HomeController.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이준혁
  * @프로그램 설명 : 메인 페이지 호출용 controller
  */
@Controller
@Log4j
public class FrontHomeController {
	@Autowired
	private ProjectService service;
	@Autowired
	private MemberService service2;
	/**
	  * @Method 설명 : front/home.jsp 호출
	  * @Method Name : home
	  * @Date : 2019. 10. 21.
	  * @작성자 : 이준혁
	  * @return call jsp view
	  */
	@GetMapping(value = "/")
	public String home(Criteria cri, Model model) {

		log.info("Welcome home!");
		model.addAttribute("rank_list", service.getList(cri));
		model.addAttribute("main_slide", service.homeGetList());
		
		cri.setP_type("0");

	    log.info("list: " + cri + " " + cri.getAmount() + " " +cri.getPageNum());
	    model.addAttribute("list", service.getList(cri));
	    
	    model.addAttribute("openProject", service.getHomeOpenProject());
	
	    
	    int total = service.project_getTotal(cri);
	    cri.setP_type("end");
	    int total2 = service.project_getTotal(cri);
	    model.addAttribute("projectCnt", total);
	    model.addAttribute("projectEndCnt", total2);
	    
	    log.info("확인용:" + service2.member_total());
	    int total3 = service2.member_total();
	    model.addAttribute("memberCnt", total3);
	    
		return "front/home";
	}
	
}
