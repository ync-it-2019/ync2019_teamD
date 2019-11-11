package com.ync.project.domain;

import java.util.Date;

import lombok.Data;

/**
 * 
  * @FileName	: RippleVO.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이승철
  * @프로그램 설명 : 댓글VO 작성
 */
@Data
public class RippleVO {
	private long ripple_num;
	private long project_num;
	
	private String content;
	private String userid;
	private Date reg_date;
}
