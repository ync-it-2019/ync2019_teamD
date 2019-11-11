package com.ync.project.domain;

import java.util.Date;

import lombok.Data;

 /**
  * @FileName   : NoticeVO.java
  * @Date      : 2019. 10. 27. 
  * @Author      : 김현진
  * @프로그램 설명 : 공지사항VO
  */
@Data
public class NoticeVO {
	private Long notice_num;
	private String title;
	private String userid;	
    private String content;
    private String attach;
	private Date reg_date;
		
}
