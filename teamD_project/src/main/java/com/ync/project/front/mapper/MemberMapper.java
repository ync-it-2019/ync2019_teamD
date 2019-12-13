package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.MemberVO;
import com.ync.project.domain.ProjectVO;

/**
  * @FileName	: MemberMapper.java
  * @Date		: 2019. 11. 25. 
  * @Author		: 이승철
  * @프로그램 설명 : 회원 정보 처리용 Mapper interface
  */
public interface MemberMapper {

	public MemberVO read(String userid);
	
	public int insert(MemberVO member);
	
	public int update(MemberVO member);
	
	// 투자회원 등록용
	public void signupInvest(MemberVO member);
	
	// 마이 페이지
	public MemberVO myPage(String userid);
	
	public List<ProjectVO> myPageProject(String userid);
	
	public List<ProjectVO> myPageProjectEnd(String userid);
	
	public int member_total();

}
