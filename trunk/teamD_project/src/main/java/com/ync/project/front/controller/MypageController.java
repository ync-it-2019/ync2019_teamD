package com.ync.project.front.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.service.MemberService;
import com.ync.project.util.UploadUtils;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: MypageController.java
  * @Date		: 2019. 12. 6. 
  * @Author		: 이승철
  * @프로그램 설명 : 마이페이지 컨트롤러
 */
@Controller
@Log4j
public class MypageController {
   
	@Autowired
	private MemberService service;
	
	@Value("${globalConfig.uploadPath}")
	private String uploadPath;
   /**
     * @Method 설명 : front/*.jsp (내프로젝트,프로필편집) 호출
     * @Method Name : 
     * @Date : 2019. 10. 21.
     * @작성자 : 이준혁
     * @return call jsp view
     */
   

	/**
	 * 
	  * @Method 설명 : 마이페이지 프로젝트 화면
	  * @Method Name : mypageMyProject
	  * @Date : 2019. 12. 6.
	  * @작성자 : 이승철
	  * @param userid
	  * @param principal
	  * @param model
	  * @return
	 */
   @GetMapping(value = "/mypageMyProject")
   public String mypageMyProject(String userid,Principal principal, Model model) {

      log.info("Welcome mypageMyProject!");
      
      userid = principal.getName();
      
      model.addAttribute("project", service.myPageProject(userid));
      
      model.addAttribute("projectEnd", service.myPageProjectEnd(userid));
   
      return "front/mypageMyProject";
   }
   
   /**
    * 
     * @Method 설명 : 프로필 편집 진입
     * @Method Name : profileEditing
     * @Date : 2019. 12. 6.
     * @작성자 : 이승철
     * @return
    */
   @GetMapping("/profileEdit")
   public String profileEditing() {
	   log.info("Welcome profileEdit!");
	   
	    return "front/profileEdit";
   }
   
   /**
    * 
     * @Method 설명 : 프로필 편집 동작 Post
     * @Method Name : profileEdit
     * @Date : 2019. 12. 13.
     * @작성자 : 이승철
     * @param member
     * @param principal
     * @param uploadFile
     * @return
    */
   @RequestMapping("/profileEdit")
   @PostMapping("/profileEdit")
   public String profileEdit(MemberVO member,Principal principal,
		   MultipartFile uploadFile) {
	   
	  log.info("profileEdit!");
	   
	  log.info("업로드파일 : " + uploadFile);
	  
	// 프로필 사진
	  member.setProfile_image(UploadUtils.uploadFormPost(uploadFile, uploadPath));
	  
      String userid = principal.getName();
      
      log.info("프로필 이미지 : " + member.getProfile_image());
      
      member.setUserid(userid);
      
      service.update(member);
   
      return "redirect:/myPage";
   }
   

}