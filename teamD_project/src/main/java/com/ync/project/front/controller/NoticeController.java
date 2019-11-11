package com.ync.project.front.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;
import com.ync.project.front.service.NoticeService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

 /**
  * @FileName   : NoticeController.java
  * @Date      : 2019. 10. 30. 
  * @Author      : 김현진
  * @프로그램 설명 : notice 컨트롤러
  */

@Controller
@Log4j
@RequestMapping("/front/*")
@AllArgsConstructor
public class NoticeController {

	private NoticeService service;
	
	   @GetMapping("/notice")
	   public void list(Criteria cri, Model model) {
	      log.info("notice: " + cri);
	      model.addAttribute("notice", service.getListWithPaging(cri));
	      int total = service.getTotal(cri);
	      log.info("total: " + total);
	   }
	   
	   // file upload가 추가된 게시판 등록  (위에 레지스터를 밑에껄로 바꿈)
		@PostMapping("/register")
		public String register(NoticeVO board, RedirectAttributes rttr) { //

			log.info("register: " + board);
			service.register(board);
			rttr.addFlashAttribute("result", board.getNotice_num());

			return "redirect:/notice";
		}
	   
	   @GetMapping({"/get", "/modify"})
	   public void get(@RequestParam("notice_num") Long notice_num, @ModelAttribute("cri")
	   Criteria cri, Model model) {
	      log.info("/get or modify");
	      model.addAttribute("board", service.get(notice_num));
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


		@PostMapping("/remove")
		@PreAuthorize("principal.username == #userid")
		public String remove(@RequestParam("notice_num") Long notice_num, Criteria cri,
								RedirectAttributes rttr, String userid) {

			log.info("remove..." + notice_num);
			if (service.remove(notice_num)) {
				rttr.addFlashAttribute("result", "success");
			}

			return "redirect:/board/list";
		}
}
