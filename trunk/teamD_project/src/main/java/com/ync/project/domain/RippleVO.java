package com.ync.project.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * 
  * @FileName	: RippleVO.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이준혁
  * @프로그램 설명 : 댓글VO 작성
 */
@Data
public class RippleVO {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date reg_date;		//등록일자
	private String content;		//내용
	private String userid;		//회원이메일
	
	private long ripple_num;
	private long project_num;
	
	// 어드민 전용 추가
	private String TITLE;
	private String r_content;
	private Date r_reg_date;
	private String r_userid;
	private String simple_content;
}
