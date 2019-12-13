package com.ync.project.domain;

import java.util.Date;

import lombok.Data;

/**
 * 
  * @FileName	: InquryVO.java
  * @Date		: 2019. 10. 23 
  * @Author		: 이미영
  * @프로그램 설명      : 1:1문의 작성 VO
 */

@Data
public class InquryVO {
	
	private Long inqury_num;
	
	private String userid;
	private String title;
	private Date reg_date;
	private String attach;
	private Date ripple_date;
	private String content;
	private String ripple_content;
    private String ripple_check;
    
	}

