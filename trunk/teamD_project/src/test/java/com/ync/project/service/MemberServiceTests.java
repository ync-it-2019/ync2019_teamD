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
	
	/*
	 * @Test public void testRegist() { MemberVO member = new MemberVO();
	 * member.setUserid("erty"); member.setUserpw("erty"); member.setName("erty");
	 * member.setPhone("erty"); member.setNickname("erty"); member.setJob("erty");
	 * member.setAddress("erty"); service.regist(member); log.info("회원등록......."); }
	 */
	
	@Test
	public void testRegistInvestor() {
		MemberVO member = service.get("abc18");
		if (member == null) {
			return;
		} 
		
		member.setBank("이공은행");
		member.setAccount("295");
		
	}

	/*
	 * @Test public void testUpdate() { MemberVO member = service.get("abc18"); if
	 * (member == null) { return; } member.setProfile_image("20191030.jpg");
	 * member.setInteresting_category("애니메이션");
	 * member.setSelf_introduce("HelloWorld!"); log.info("UPDATE RESULT: " +
	 * service.update(member)); }
	 */

}
