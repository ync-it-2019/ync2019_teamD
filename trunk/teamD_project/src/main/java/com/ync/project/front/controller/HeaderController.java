package com.ync.project.front.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.PageDTO;
import com.ync.project.front.service.InvestorService;
import com.ync.project.front.service.MemberService;
import com.ync.project.front.service.NoticeService;

import lombok.extern.log4j.Log4j;

/**
  * @FileName   : HeaderController.java
  * @Date      : 2019. 12. 06. 
  * @Author      : 이승철
  * @프로그램 설명 : 헤더 페이지 호출용 controller
  */
@Controller
@Log4j
public class HeaderController {
	@Autowired
	private NoticeService nService;
	
	@Autowired
	private MemberService mService;
	
	@Autowired
	private InvestorService iService;
   /**
     * @Method 설명 : front/*.jsp (로그인,회원가입,마이페이지,고객센터) 호출
     * @Method Name : 
     * @Date : 2019. 10. 21.
     * @작성자 : 이준혁
     * @return call jsp view
     */
   
   @GetMapping(value = "/join")
   public String join() {

      log.info("Welcome join!");
   
      return "front/join";
   }
   
   /**
    * 
     * @Method 설명 : 마이페이지 호출
     * @Method Name : mypage
     * @Date : 2019. 12. 6.
     * @작성자 : 이승철
     * @param userid
     * @param model
     * @param principal
     * @return
    */
   @GetMapping(value = "/myPage")
   public String mypage(String userid, Model model,Principal principal) {
      log.info("Welcome mypage!");
      
      userid = principal.getName();
      
      model.addAttribute("member", mService.myPage(userid));
      
      model.addAttribute("project", iService.myPageProject(userid));
      
      return "front/myPage";
   }
   
   @GetMapping(value = "/notice")
   public String notice(Criteria cri, Model model) {

	   log.info("list: " + cri);
	      int total = nService.getTotal(cri);
	      log.info("total: " + total);
	      
//	      List<NoticeVO> list = service.boardList(NoticeVO);
//	      model.addAttribute("list", list);
	      
	      model.addAttribute("list", nService.getListWithPaging(cri));
	      model.addAttribute("pageMaker", new PageDTO(cri, total));
	      
	      return "/front/notice";
   }

}