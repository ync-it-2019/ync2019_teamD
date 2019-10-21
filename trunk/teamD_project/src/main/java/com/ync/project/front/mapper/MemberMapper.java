package com.ync.project.front.mapper;

import com.ync.project.domain.MemberVO;

/**
  * @FileName	: MemberMapper.java
  * @Date		: 2019. 10. 16. 
  * @Author		: 정진우
  * @프로그램 설명 : 회원 정보 처리용 Mapper interface
  */
public interface MemberMapper {

	public MemberVO read(String userid);
}
