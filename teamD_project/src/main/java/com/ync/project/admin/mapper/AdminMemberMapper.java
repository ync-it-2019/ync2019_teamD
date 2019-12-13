package com.ync.project.admin.mapper;

import java.util.List;

import com.ync.project.domain.MemberVO;

/**
 * 
  * @FileName	: MemberMapper.java
  * @Date		: 2019. 12. 7. 
  * @Author		: 이승철
  * @프로그램 설명 : 어드민 Member관련 매퍼
 */
public interface AdminMemberMapper {

	public List<MemberVO> adminUserGet();
	
	public MemberVO investorCountGet();
	
	public List<MemberVO> investRankGet();
}
