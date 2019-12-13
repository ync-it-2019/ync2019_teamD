package com.ync.project.admin.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.MemberVO;

/**
 * 
  * @FileName	: MemberService.java
  * @Date		: 2019. 12. 06. 
  * @Author		: 이승철
  * @프로그램 설명 : MemberService
 */
public interface AdminMemberService {
	
	public List<MemberVO> adminUserGet();
	
	public MemberVO investorCountGet();
	
	public List<MemberVO> investRankGet();
}
