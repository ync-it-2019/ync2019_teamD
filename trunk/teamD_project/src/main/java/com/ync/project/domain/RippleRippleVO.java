package com.ync.project.domain;

import java.util.Date;

import lombok.Data;

/**
 * 
  * @FileName	: RippleVO.java
  * @Date		: 2019. 10. 23. 
  * @Author		: 이준혁
  * @프로그램 설명 : 대댓글VO 작성
 */
@Data
public class RippleRippleVO {
	private long ripple_num;
	private long project_num;
	private long ripple_ripple_num;
	
	private String userid;
	private String content;
	private Date reg_date;
}
