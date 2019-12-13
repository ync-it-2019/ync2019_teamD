package com.ync.project.front.controller;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.ync.project.domain.PageDTO;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;
import com.ync.project.front.service.NoticeService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

 
/**
 * 
  * @FileName	: NoticeController.java
  * @Date		: 2019. 12. 9. 
  * @Author		: 이승철
  * @프로그램 설명 : 공지사항 컨트롤러
 */
@Controller
@Log4j
@RequestMapping("/front/*")
@AllArgsConstructor
public class NoticeController {

	@Autowired
	private NoticeService service;
	
//	@Value("${globalConfig.uploadPath}")
//	private String uploadPath;

//	@GetMapping("/register")
//	@PreAuthorize("isAuthenticated()")
//	public void register() {
//		log.info("register...");
//	}
	
//	@GetMapping("/list")
//	public void list(Criteria cri, Model model) {
//
//		log.info("list: " + cri);
//		
//		// 게시판의 글은 지속적으로 등록, 삭제 되기에 매번 list를 호출 할때 total을 구해와야 한다. 
//		int total = service.getTotal(cri);
//		log.info("total: " + total);
//		model.addAttribute("list", service.getListWithPaging(cri));
//		model.addAttribute("pageMaker", new PageDTO(cri, total));
//
//	}
	   @GetMapping(value = "/notice")
	   public String list(Criteria cri, Model model) {
		  
	      log.info("list: " + cri);
	      int total = service.getTotal(cri);
	      log.info("total: " + total);
	      
//	      List<NoticeVO> list = service.boardList(NoticeVO);
//	      model.addAttribute("list", list);
	      
	      model.addAttribute("list", service.getListWithPaging(cri));
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	      
	      return "/front/notice";
	   }
	   
	   // file upload가 추가된 게시판 등록 
		@PostMapping("/register")
		public String register(NoticeVO board, RedirectAttributes rttr) { //

			log.info("register: " + board);
			service.register(board);
			rttr.addFlashAttribute("result", board.getNotice_num());

			return "redirect:/notice";
		}
	   
//	   @GetMapping({"/get", "/modify"})
//	   public void get(@RequestParam("notice_num") Long notice_num, @ModelAttribute("cri")
//	   Criteria cri, Model model) {
//	      log.info("/get or modify");
//	      model.addAttribute("board", service.get(notice_num));
//	   }
		@GetMapping("/notice_detail")
		public String noticeGet(@RequestParam long notice_num, 
				Model model) {
			log.info("No." + notice_num + " content......");
			
			model.addAttribute("notice", service.get(notice_num));
			
			return "/front/notice_detail";
		}
	   
	   @PostMapping("/modify")
	   @PreAuthorize("principal.username == #board.userid")
	   public String modify(NoticeVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
	      log.info("modify: " + board);
	      
	      //정상적으로 update된 행이 있다면 service.modify(board)값은 true다.
	      if(service.modify(board)) {
	         rttr.addFlashAttribute("result", "success");
	      }
	      
	      //위에 4줄은 remove도 있음. 실행은 되지만 중복은 제거해 줘야함 cri.getListLink를 만들어 줌으로써 제거가능 간결해짐
	      //한 부분만 쓰이면 안만들어도 됨 
	      return "redirect:/board/list" + cri.getListLink();
	   }



}
