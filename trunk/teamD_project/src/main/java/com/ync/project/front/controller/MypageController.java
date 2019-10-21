package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName   : MypageController.java
  * @Date      : 2019. 10. 21. 
  * @Author      : 이준혁
  * @프로그램 설명 : 마이페이지 호출용 controller
  */
@Controller
@Log4j
public class MypageController {
   
   /**
     * @Method 설명 : front/*.jsp (내프로젝트,프로필편집) 호출
     * @Method Name : 
     * @Date : 2019. 10. 21.
     * @작성자 : 이준혁
     * @return call jsp view
     */
   
   @GetMapping(value = "/mypageMyProject")
   public String mypageMyProject() {

      log.info("Welcome mypageMyProject!");
   
      return "front/mypageMyProject";
   }
   
   @GetMapping(value = "/profileEdit")
   public String profileEdit() {

      log.info("profileEdit!");
   
      return "front/profileEdit";
   }
   

}