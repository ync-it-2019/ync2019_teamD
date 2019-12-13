package com.ync.project.admin.controller;

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

import com.ync.project.admin.service.AdminNoticeService;
import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;
import com.ync.project.domain.PageDTO;
import com.ync.project.util.UploadUtils;

import lombok.extern.log4j.Log4j;


 /**
  * @FileName   : AdminNoticeController.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 : admin notice 컨트롤러
  */
@Controller
@Log4j
@RequestMapping("/admin/*")

public class AdminNoticeController {

	@Autowired
	private AdminNoticeService service;
	
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin_inqury")
	public String getList(Criteria cri, Model model) {

		log.info("list: " + cri);
		model.addAttribute("list", service.getListWithPaging(cri));
		int total = service.getTotalCount(cri);
		log.info("total: " + total);
		model.addAttribute("pageMaker", new PageDTO(cri, total));		
		return "admin/admin_inqury";
	}
	
	@GetMapping("/admin_inquryWrite")
	   public String inquryWrite() {
		   log.info("Welcome admin_inquryWrite!");
		   
		    return "admin/admin_inquryWrite";
	   }
	
	@PostMapping("/admin_inquryWrite")
		public String inquryWrite2(MultipartFile[] uploadFile, 
				              NoticeVO board, 
				              RedirectAttributes rttr) {
			int index = 0;
			log.info("testtest:" + uploadFile.toString());
			for (MultipartFile multipartFile : uploadFile) {
				if (multipartFile.getSize() > 0) {
					if (index == 0) {
						board.setAttach(UploadUtils.uploadFormPost(multipartFile, uploadPath));
					}
					index++;
				}
			}
			log.info("register: " + board);
			service.register(board);
			rttr.addFlashAttribute("result", board.getNotice_num());
			return "redirect:/admin/admin_inqury";
		}

	   @GetMapping("/admin_inquryView")
		public String inquryView(@RequestParam("notice_num") Long notice_num, 
				                Model model) {
			log.info("Welcome admin_inquryView!");
			log.info("notice_num: " + notice_num);
			model.addAttribute("notice", service.get(notice_num));
			return "admin/admin_inquryView";
		}
	   	
	   @GetMapping({"/get", "/modify"})
	   public void get(@RequestParam("notice_num") Long notice_num, @ModelAttribute("cri")
	   Criteria cri, Model model) {
	      log.info("/get or modify");
	      model.addAttribute("board", service.get(notice_num));
	   }


//	@PostMapping("/modify")
//	public String modify(MultipartFile[] uploadFile, NoticeVO board, @ModelAttribute("cri") Criteria cri,
//			RedirectAttributes rttr) {
//		log.info("modify:" + board);
//
//		int index = 0;
//		for (MultipartFile multipartFile : uploadFile) {
//			// 실제로 upload된 file이 있을때만 upload 시킨다.
//			if (multipartFile.getSize() > 0) {
//				switch (index) {
//				case 0:
//					board.setAttach(UploadUtils.uploadFormPost(multipartFile, uploadPath));
//					break;
//				case 1:
//					board.setAttach(UploadUtils.uploadFormPost(multipartFile, uploadPath));
//					break;
//				default:
//					board.setAttach(UploadUtils.uploadFormPost(multipartFile, uploadPath));
//					break;
//				}
//				// list.add(UploadUtils.uploadFormPost(multipartFile));
//			}
//			index++;
//		}
//
//		if (service.modify(board)) {
//			rttr.addFlashAttribute("result", "success");
//		}
//
//		return "redirect:/admin/admin_inqury" + cri.getListLink();
//	}


}
