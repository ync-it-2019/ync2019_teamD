package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InvestorVO;
import com.ync.project.domain.ProjectVO;

/**
 * 
  * @FileName	: InvestorService.java
  * @Date		: 2019. 12. 05. 
  * @Author		: 이승철
  * @프로그램 설명 : Investor의 Service 파일
 */
public interface InvestorService {
	//투자자 상세보기
	public InvestorVO get(Long pno);

	//투자자 목록
	public List<InvestorVO> getList(Long pno);
	//마이페이지 프로젝트
	public List<InvestorVO> myPageProject(String userid);
	//투자하기
	public void funding(InvestorVO investor);
	
	public void update_current(InvestorVO investor);
	

}
