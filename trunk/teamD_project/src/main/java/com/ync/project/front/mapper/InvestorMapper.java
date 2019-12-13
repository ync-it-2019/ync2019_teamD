package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.InvestorVO;

/**
  * @FileName	: InvestorMapper.java
  * @Date		: 2019. 12. 04. 
  * @Author		: 이지원
  * @프로그램 설명 : 투자자회원 정보 처리 Mapper interface 현재 진행중. getList만 함
  */
public interface InvestorMapper {
	public List<InvestorVO> getList(Long pno);
	
	public InvestorVO investor_read(Long pno);
	
	public void insert(InvestorVO investor);
	
	public void funding(InvestorVO investor);
	
	public void update_current(InvestorVO investor);
	
	public List<InvestorVO> myPageProject(String userid);
}
