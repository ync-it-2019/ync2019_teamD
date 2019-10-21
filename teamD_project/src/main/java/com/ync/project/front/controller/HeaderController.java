package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName   : HeaderController.java
  * @Date      : 2019. 10. 21. 
  * @Author      : 이준혁
  * @프로그램 설명 : 헤더 페이지 호출용 controller
  */
@Controller
@Log4j
public class HeaderController {
   
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
   
   @GetMapping(value = "/joinsuccess")
   public String joinsuccess() {

      log.info("joinsuccess!");
   
      return "front/joinsuccess";
   }
   
   @GetMapping(value = "/investorjoin")
   public String investorjoin() {

      log.info("Welcome investorjoin!");
   
      return "front/investorjoin";
   }
   
   @GetMapping(value = "/investorsuccess")
   public String investorsuccess() {

      log.info("investorsuccess!");
   
      return "front/investorsuccess";
   }
   
   
   @GetMapping(value = "/myPage")
   public String mypage() {

      log.info("Welcome mypage!");
   
      return "front/myPage";
   }
   
   @GetMapping(value = "/notice")
   public String notice() {

      log.info("Welcome notice!");
   
      return "front/notice";
   }
   

}