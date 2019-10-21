//package com.ync.project.mapper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import com.ync.project.domain.ProjectVO;
//
//import com.ync.project.front.mapper.ProjectMapper;
//
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
//public class ProjectMapperTests {
//
//
//	@Autowired
//	private ProjectMapper mapper;
//	
//	//insert
//	@Test
//	public void testInsert() {
//		ProjectVO board = new ProjectVO();
//		board.setCategory("테크/가전");
//		board.setTitle_image("");
//		board.setSimple_content("심플 컨텐츠");
//		board.setPhone("010-1111-2222");
//		board.setEmail("ls10@naver.com");
//		board.setProject_start(null);
//		board.setProject_end(null);
//		board.setCurrent_invest(100000);
//		board.setAchive_invest(1000000);
//		board.setCompany("이지컴퍼니");
//		board.setContent_image1("");
//		board.setContent_image2("");
//		board.setDetail_content("디테일 내용");
//		
//		
//		mapper.insert(board);
//
//		log.info(board);
//	}
//
//
//}
