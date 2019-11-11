package com.ync.project.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.service.MemberService;

import lombok.extern.log4j.Log4j;

/**
 * @FileName : MemberServiceTests.java
 * @Date     : 2019. 10. 28.
 * @Author   : 이미영
 * @프로그램 설명 : MemberServiceTests
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberServiceTests {

	@Autowired
	private MemberService service;

	@Test
	public void testGet() {
		
		log.info(service.get("abc18"));
		
	}
	
	@Test
	public void testInsert() {
		MemberVO member = new MemberVO();
		member.setUserid("abc18");
		member.setUserpw("abc10");
		member.setName("이초코");
		member.setPhone("01044445555");
		member.setNickname("choco");
		member.setJob("요리사");
		member.setAddress("한방통닭");
		member.setAuth("TEST");
		service.register(member);
		log.info("회원등록.......");	
	}

	@Test
	public void testUpdate() {
		MemberVO member = service.get("abc18");
		if (member == null) {
			return;
		} 
		member.setProfile_image("20191030.jpg");
		member.setInteresting_category("애니메이션");
		member.setSelf_introduce("HelloWorld!");
		log.info("UPDATE RESULT: " + service.update(member));
	}

}
