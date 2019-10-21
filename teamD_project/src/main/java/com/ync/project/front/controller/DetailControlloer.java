package com.ync.project.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
  * @FileName   : DetailController.java
  * @Date      : 2019. 10. 21. 
  * @Author      : 이준혁
  * @프로그램 설명 : 상세 페이지 호출용 controller
  */
@Controller
@Log4j
public class DetailControlloer {
   
   /**
     * @Method 설명 : front/*.jsp (Detail) 호출
     * @Method Name : 
     * @Date : 2019. 10. 21.
     * @작성자 : 이준혁
     * @return call jsp view
     */
   
   @GetMapping(value = "/single")
   public String single() {

      log.info("Welcome single!");
   
      return "front/single";
   }
   
   
}