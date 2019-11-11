package com.ync.project.domain;

import java.util.List;

import lombok.Data;
	
	/**
	 * 
	  * @FileName	: InvestorVO.java
	  * @Date		: 2019. 10. 23. 
	  * @Author		: 이준혁
	  * @프로그램 설명 : 투자자 investorVO
	 */
	@Data
	public class InvestorVO {
	
	private String investor_num;
	private String project_num;
	private String amount;
	private String score;
	private String job;
	private String userid; 
	
	private List<AuthVO> authList;

}
