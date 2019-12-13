package com.ync.project.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.RipplePageDTO;
import com.ync.project.domain.RippleVO;
import com.ync.project.front.service.RippleService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/replies/")
@Controller
@Log4j
public class RippleController {

	@Autowired
	private RippleService service;
	
	//등록
	@PostMapping("/new")
	public String replyWrite(RippleVO vo) {
		log.info("후");
		log.info("register: " + vo);
		
		service.register(vo);

		return "redirect:/front/single?project_num=" + vo.getProject_num();
	}
	
	//수정
	@PostMapping("/modify")
	public String replyModify(RippleVO vo, RedirectAttributes rttr) {
		log.info("Welcome modify");
		log.info("modify: " + vo);
		log.info("rippleTest: " + vo.getRipple_num());
		service.modify(vo);

		return "redirect:/front/single?project_num=" + vo.getProject_num();
	}
	
	// 삭제
	@PostMapping("/rippleDelete")
	public String rippleDelete(long ripple_num,long project_num) {
		
		service.remove(ripple_num);

		return "redirect:/front/single?project_num=" + project_num;
	}
	
}
