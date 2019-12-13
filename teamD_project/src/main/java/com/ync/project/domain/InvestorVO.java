package com.ync.project.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

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
	
	private int investor_num;
	private int project_num;
	private int amount;
	private int score;
	private String job;
	private String userid; 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invest_date;
	private String simple_content;
	
	//Member테이블과 조인을 위한 변수
	private String nickname;
	private String profile_image;
	
	private List<AuthVO> authList;

}
