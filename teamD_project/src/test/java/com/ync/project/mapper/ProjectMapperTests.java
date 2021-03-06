package com.ync.project.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;
import com.ync.project.front.mapper.ProjectMapper;

import lombok.extern.log4j.Log4j;


/**
 * 
  * @FileName	: ProjectMapperTests.java
  * @Date		: 2019. 10. 23. 
  * @Author		: 이지원
  * @프로그램 설명 : ProjectMapper의 test파일. 현재   getList는 오류 하나있음
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ProjectMapperTests {


	@Autowired
	private ProjectMapper mapper;
	
	Date time = new Date();
	
	
//	@Test
//	public void testGetList() {
//		
//		mapper.getList().forEach((project) -> {
//			log.info("================");
//			log.info(project);
//		});
//
//	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 글등록. start와 end는 임시로 sysdate했음
	  * @Method Name : testInsert
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testInsert() {
//		
//		ProjectVO board = new ProjectVO();
//		
//		board.setUserid("test");
//		board.setCategory("테크/가전");
//		board.setTitle_image("fsdfsf");
//		board.setSimple_content("심플 컨텐츠");
//		board.setDetail_content("setDetail_content");
//		board.setPhone("010-1111-1111");
//		board.setProject_start(time);
//		board.setProject_end(time);
//		board.setCurrent_invest(100000);
//		board.setAchive_invest(1000000);
//		board.setAttach_1("setAttach_1");
//		board.setAttach_2("setAttach_2");
//		board.setAttach_3("setAttach_3");
//		board.setCompany("이지컴퍼니");
//		board.setContents_image1("setContents_image1");
//		board.setContents_image2("setContents_image2");
//		
//		
//		mapper.insert(board);
//
//		log.info(board);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//
//		ProjectVO board = new ProjectVO();
//		board.setCategory("테크/가전  새로 추가한 글");
//		board.setTitle_image("fsdfsf  11-05");
//		board.setSimple_content("심플 컨텐츠  11-05");
//		board.setDetail_content("setDetail_content");
//		board.setPhone("010-1111-1111");
////		board.setProject_start(time);
////		board.setProject_end(time);
//		board.setAchive_invest(1000000);
//		board.setAttach_1("setAttach_1");
//		board.setAttach_2("setAttach_2");
//		board.setAttach_3("setAttach_3");
//		board.setCompany("이지컴퍼니");
//		board.setContents_image1("setContents_image1");
//		board.setContents_image2("setContents_image2");
//		
//		mapper.insertSelectKey(board);
//
//		log.info(board);
//	}
	
	/**
	 * 
	  * @Method 설명 : 한 게시물만 읽어오는 메소드
	  * @Method Name : testRead
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
	@Test
	public void testRead() {

		// 존재하는 게시물 번호로 테스트
		ProjectVO board = mapper.read(66L); //long형이라 L붙여줌

		log.info(board);
	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 삭제
	  * @Method Name : testDelete
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT: " + mapper.delete(3L));
//	}
	
	/**
	 * 
	  * @Method 설명 : 프로젝트 업데이트(수정)
	  * @Method Name : testUpdate
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testUpdate() {
//
//		ProjectVO board = new ProjectVO();
//		// 실행전 존재하는 번호인지 확인할 것
//		board.setProject_num(1L); //5번글
//		board.setCategory("테크/가전");
//		board.setTitle_image("fsdfsf");
//		board.setSimple_content("심플 컨텐츠 수정합니다.");
//		board.setDetail_content("setDetail_content 수정합니다.");
//		board.setPhone("010-1111-2222");
//		board.setAttach_1("setAttach_1");
//		board.setAttach_2("setAttach_2");
//		board.setAttach_3("setAttach_3");
//		board.setCompany("이지컴퍼니 수정");
//		board.setContents_image1("setContents_image1 수정이미지");
//		board.setContents_image2("setContents_image2 수정이미지");
//		
//		int count = mapper.update(board); //int형 숫자 리턴됨 그래서 update를 int형으로 선언했었음
//		log.info("UPDATE COUNT: " + count);
//
//	}
	
//	/**
//	 * 
//	  * @Method 설명 : 게시물 페이징
//	  * @Method Name : testPaging
//	  * @Date : 2019. 10. 23.
//	  * @작성자 : 이지원
//	 */
//	@Test
//	public void testPaging() {
//
//		Criteria cri = new Criteria();
//		
//	    //10개씩 1페이지 
//	    cri.setPageNum(1);
//	    cri.setAmount(10);
//
//
//		List<ProjectVO> list = mapper.getListWithPaging(cri);
//
//		list.forEach(board -> log.info(board));
//
//	}
//	
	/**
	 * 
	  * @Method 설명 : 검색 메소드 T:제목  C:카테고리 ...등등 추가해야함
	  * @Method Name : testSearch
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이지원
	 */
//	  @Test
//	  public void testSearch() {
//
//	    Criteria cri = new Criteria();
//	    cri.setKeyword("심플");
//	    cri.setType("T");
//
//	    List<ProjectVO> list = mapper.getListWithPaging(cri);
//
//	    list.forEach(board -> log.info(board));
//	  }


}

