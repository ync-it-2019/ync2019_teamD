package com.ync.project.front.mapper;

import com.ync.project.domain.InvestorVO;

/**
  * @FileName	: InvestorMapper.java
  * @Date		: 2019. 10. 23. 
  * @Author		: 이준혁
  * @프로그램 설명 : 투자자회원 정보 처리 Mapper interface
  */
public interface InvestorMapper {

	public InvestorVO read(String userid);
	
	public void insert(InvestorVO investor);
	
	public void update(InvestorVO investor);
}
