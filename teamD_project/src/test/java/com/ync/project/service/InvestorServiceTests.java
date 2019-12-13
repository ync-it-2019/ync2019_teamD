package com.ync.project.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.front.service.InvestorService;

import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class InvestorServiceTests {

	@Autowired
	private InvestorService service;

	
	/**
	 * 
	  * @Method 설명 : 프로젝트 글 상세보기
	  * @Method Name : testGet
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testGet() {
//		log.info(service.get(11L));
//		}
	
	/**
	 * 
	  * @Method 설명 : 게시물 전체 조회
	  * @Method Name : testGetList
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
	@Test
	public void testGetList() {
		service.getList(66L).forEach(board -> log.info(board));
		}
	

	
	
	
	


}