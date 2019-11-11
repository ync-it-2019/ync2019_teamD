package com.ync.project.domain;

import java.util.List;

import lombok.Data;
	
	/**
	 * 
	  * @FileName	: MemberVO.java
	  * @Date		: 2019. 10. 21. 
	  * @Author		: 이지원
	  * @프로그램 설명 : 회원가입 memberVO
	 */
	@Data
	public class MemberVO {
	
	// userid, userpw 이름은 그대로 사용하고 나머지는 프로젝트별 생성한 table 컬럼명에 맞춰 작성
	// spring security 적용으로 로그인 시 소스를 교재 소스 그대로 사용하기 위해.
	private String userid;
	private String userpw;
	private String phone;
	private String address;
	private String job;
	private String account;
	private String profile_image;
	private String interesting_category;
	private String self_introduce;
	private String name;
	private String bank;
	private String nickname;
	private String auth;
	
	private List<AuthVO> authList;

}
