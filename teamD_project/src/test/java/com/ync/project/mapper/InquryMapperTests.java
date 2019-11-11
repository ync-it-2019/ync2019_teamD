package com.ync.project.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.InquryVO;
import com.ync.project.front.mapper.InquryMapper;

import lombok.extern.log4j.Log4j;


/**
 * @FileName   : InquryMapperTests.java
 * @Date       : 2019. 10. 28. 
 * @Author     : 이미영
 * @프로그램 설명      : 문의 Test
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class InquryMapperTests {

	@Autowired
	private InquryMapper mapper;

	Date time = new Date();

	@Test
	public void testGetList() {

		mapper.getList().forEach((inqury) -> {
			log.info("================");
			log.info(inqury);
		});

	}

//	@Test
//	public void testInsert() {
//		
//		InquryVO inqury = new InquryVO();
//		inqury.setTitle("문의제목");
//		inqury.setReg_date(time);
//		inqury.setAttach("문의첨부파일");
//		inqury.setUserid("user");
//		inqury.setContent("문의내용");
//		
//		mapper.insert(inqury);
//
//		log.info(inqury);
//	}

//	@Test
//	public void testRead() {
//
//		// 존재하는 게시물 번호로 테스트
//		InquryVO inqury = mapper.read(1L); 
//
//		log.info(inqury);
//	}
	
//	@Test
//	public void testUpdate() {
//
//		InquryVO inqury = new InquryVO();
//		inqury.setInqury_num(1L);
//		inqury.setRipple_content("문의답변");
//		inqury.setRipple_check("답변유무");
//		inqury.setRipple_date(time);
//		
//		int count = mapper.update(inqury); 
//		log.info("UPDATE COUNT: " + count);
//
//	}

}
