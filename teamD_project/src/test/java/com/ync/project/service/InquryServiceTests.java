package com.ync.project.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.InquryVO;
import com.ync.project.front.service.InquryService;

import lombok.extern.log4j.Log4j;

 /**
  * @FileName   : InquryServiceTests.java
  * @Date      : 2019. 11. 20. 
  * @Author      : 이미영
  * @프로그램 설명      : InquryServiceTests 파일
  */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class InquryServiceTests {

   @Autowired
   private InquryService service;
   
//   @Test
//   public void testGet() {
//      log.info(service.get(24L));   
//   }
   
//   @Test
//   public void testGetList() {
//      service.getList().forEach(inqury -> log.info(inqury));
//      }
   
//   @Test
//   public void testRegister() {
//      InquryVO inqury = new InquryVO();
//      inqury.setTitle("문의제목");
//      inqury.setReg_date(null);
//      inqury.setAttach("문의첨부파일");
//      inqury.setUserid("user");
//      inqury.setContent("문의내용");
//      
//      service.register(inqury);   
//      log.info("생성된 게시물의 번호 : " + inqury.getInqury_num());
//   }
   
   @Test
   public void testUpdate() {
      InquryVO inqury = service.get(72L);
      if (inqury == null) {
         return;
      }
      inqury.setRipple_date(null);
      inqury.setRipple_content("문의답변");
      inqury.setRipple_check("Y");
      log.info("UPDATE RESULT: " + service.update(inqury));
   }
   
}