package com.ync.project.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;
import com.ync.project.domain.PageDTO;
import com.ync.project.admin.service.AdminInquryService;
import lombok.extern.log4j.Log4j;


 /**
  * @FileName   : AdminInquryController.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 :
  */
@Controller
@Log4j
public class AdminInquryController {
	
	/**
     * @Method 설명 : admin/*.jsp (답변하기, 문의 내용보기, 문의 목록) 호출 수정
     * @Method Name : 
     * @Date : 2019. 12. 09
     * @작성자 : 이미영
     * @return call jsp view
     */
	
	@Autowired
	private AdminInquryService service;
	
	
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin/admin_1-1inqury")
	public String getList(Criteria cri, Model model) {
		  log.info("Welcome admin_1-1inqury!");
		  log.info("list: " + cri);
	      model.addAttribute("list", service.getListWithPaging(cri));
	      model.addAttribute("pageMaker", new PageDTO(cri, 123));
	      int total = service.getTotal(cri);
	      log.info("total: " + total);
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	      return "admin/admin_1-1inqury";
	}
	
	@GetMapping("/admin/admin_1-1inquryView")
	public String inquryView(@RequestParam("inqury_num") Long inqury_num, 
			                Model model) {
		log.info("Welcome admin_1-1inquryView!");
		log.info("====inqury_num: " + inqury_num);
		model.addAttribute("inqury", service.get(inqury_num));
		return "admin/admin_1-1inquryView";
	}
	
	@PostMapping("/admin/admin_1-1inquryView")
	public String inquryView2(InquryVO inqury, 
			                  RedirectAttributes rttr) {
		log.info("update: " + inqury);
		inqury.setRipple_check("Y");
		service.update(inqury);
		rttr.addFlashAttribute("result", inqury.getInqury_num());
		return "redirect:/admin/admin_1-1inquryView?inqury_num=" + inqury.getInqury_num();
	}
	
	@PostMapping("/admin/InquryDelete")
	public String removeInqury(long inqury_num) {
		
		service.InquryDeleting(inqury_num);
		
		return "redirect:/admin/admin_1-1inqury";
	}
}
