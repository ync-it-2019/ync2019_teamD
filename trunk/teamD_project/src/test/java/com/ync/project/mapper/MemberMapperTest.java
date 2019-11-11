package com.ync.project.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


/**
 * 
  * @FileName	: MemberMapperTest.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이지원
  * @프로그램 설명 :	  MemberMapperTest의 test파일.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;

	@Test
	public void testRead() {

		MemberVO vo = mapper.read("test_r1");

		log.info(vo);
		
		vo.getAuthList().forEach(authVO -> log.info(authVO));
		
		/*authList=[AuthVO(userid=admin90, auth=ROLE_ADMIN)],[AuthVO(userid=admin90, auth=ROLE_ADMIN)] 원래 이렇게 들어갈 수 있는데 우리는 하나의 권한만 가지게 auth추가해놔서 하나만 들감*/
	}
	
	/**
	 * 
	  * @Method 설명 : 회원가입 테스트
	  * @Method Name : testInsert
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이승철
	 */
//	@Test
//	public void testInsert() {
//		
//		MemberVO member = new MemberVO();
//		
//		member.setUserid("user");
//		member.setUserpw("1234");
//		member.setPhone("010-1234-5678");
//		member.setAddress("대구 남구 대명동");
//		member.setJob("백수");
//		member.setName("이준혁");
//		member.setNickname("계대남");
//		member.setAuth("user");
//		
//		mapper.insert(member);
//		
//		log.info(member);
//	}

	/**
	 * 
	  * @Method 설명 : 회원정보 수정 테스트
	  * @Method Name : testUpdate
	  * @Date : 2019. 10. 23.
	  * @작성자 : 이승철
	 */
//	@Test
//	public void testUpdate() {
//		
//		MemberVO member = new MemberVO();
//		
//		member.setUserid("user");
//		member.setUserpw("1234");
//		member.setPhone("010-1234-5678");
//		member.setAddress("대구 남구 대명동");
//		member.setJob("백수");
//		member.setAccount("123-123456-12-123");
//		member.setProfile_image("ang.jpg");
//		member.setInteresting_category("문화");
//		member.setSelf_introduce("안녕하세요이준혁또모시마스");
//		member.setName("이준혁");
//		member.setBank("컴정은행");
//		member.setNickname("계대남");
//		member.setAuth("user");
//		
//		int count = mapper.update(member); //int형 숫자 리턴됨 그래서 update를 int형으로 선언했었음
//		
//		log.info("UPDATE COUNT: " + count);
//	}
}

