package com.ync.project.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.RippleRippleVO;
import com.ync.project.front.mapper.RippleRippleMapper;

import lombok.extern.log4j.Log4j;


/**
 * 
  * @FileName	: RippleRippleMapperTests.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이지원
  * @프로그램 설명 : 대댓글 MapperTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class RippleRippleMapperTests {
//	@Setter(onMethod_ = @Autowired)
	@Autowired //이렇게 명시적으로 하는 경우가 많음. 자바표준 어노테이션은 @Inject
	private RippleRippleMapper mapper;
	
	private Long[] ProjectNumArr = {1L, 2L, 3L, 4L};
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	/**
	 * 
	  * @Method 설명 : 대댓글 작성
	  * @Method Name : testCreate
	  * @Date : 2019. 10. 30.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testCreate() {
//			RippleRippleVO vo = new RippleRippleVO();
//			
//			//게시물의 번호
//			vo.setProject_num(4);
//			vo.setRipple_num(5);
//			vo.setContent("댓글 테스트");
//			vo.setUserid("user1");
//			
//			mapper.insert(vo);
//	}
	
	/**
	 * 
	  * @Method 설명 : 대댓글 출력
	  * @Method Name : testRead
	  * @Date : 2019. 10. 30.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testRead() {
//		
//		long targetRRno = 2L;
//		
//		RippleRippleVO vo = mapper.read(targetRRno);
//		
//		log.info(vo);
//	}
	
	/**
	 * 
	  * @Method 설명 : 대댓글 삭제
	  * @Method Name : testDelete
	  * @Date : 2019. 10. 30.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testDelete() {
//		Long targetRRno = 3L;
//		
//		mapper.delete(targetRRno);
//	}
	
	/**
	 * 
	  * @Method 설명 : 대댓글 수정
	  * @Method Name : testUpdate
	  * @Date : 2019. 10. 30.
	  * @작성자 : 이지원
	 */
//	@Test
//	public void testUpdate() {
//		
//		Long targetRRno = 3L;
//		
//		RippleRippleVO vo = mapper.read(targetRRno);
//		
//		vo.setContent("Update ripple_ripple");
//		
//		int count = mapper.update(vo);
//		
//		log.info("UPDATE COUNT: " + count);
//	}
	
	/**
	 * 
	  * @Method 설명 : 대댓글 리스트 출력
	  * @Method Name : testList
	  * @Date : 2019. 10. 30.
	  * @작성자 : 이지원
	 */
	@Test
	public void testList() {
		
		Criteria cri = new Criteria();
		List<RippleRippleVO> rreplies = mapper.getListWithPaging(cri, 5L);
		
		rreplies.forEach(rripple -> log.info(rripple));
	}

//	//Controler 처리 댓글작성
//	@Test
//	public void testripple() {
//
//		private rippleService service;
//			rippleVO vo = new rippleVO();
//			//{"bno":1032237,"ripple":"Hello ripple","rippleer":"user00"}
//
//			//게시물의 번호
//			vo.setBno(1032238);
//			vo.setripple("댓글 테스트123123 ");
//			vo.setrippleer("rippleer123");
//			
//			mapper.insert(vo);
//			
//			 int insertCount = service.register(vo);
//			insertCount == 1
//					   ? new ResponseEntity<>("success", HttpStatus.OK)
//					   : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	
	
}
