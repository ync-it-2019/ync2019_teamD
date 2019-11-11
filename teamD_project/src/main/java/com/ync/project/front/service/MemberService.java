package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.MemberVO;

/**
 * @FileName  : MemberService.java
 * @Date      : 2019. 10. 28.
 * @Author    : 이미영
 * @프로그램 설명   : MemberService
 */
public interface MemberService {
	
	//회원정보
	public MemberVO get(String userid);
	
	//회원등록
	public int register(MemberVO member);
	
	//프로필 수정
	public boolean update(MemberVO member);
	
	/**
	 * 
	  * @Method 설명 : 회원가입 서비스
	  * @Method Name : insert
	  * @Date : 2019. 11. 5.
	  * @작성자 : 이승철
	  * @param member
	  * @return
	 */
//	회원가입
	public void insert(MemberVO member);


}
