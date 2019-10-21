package com.ync.project.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 
  * @FileName	: ProjectVO.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이지원
  * @프로그램 설명 : 프로젝트 작성 VO
 */
@Data
public class ProjectVO {
	private int project_num;
	private String category;
	private String title_image;
	private String simple_content;
	private String phone;
	private String email;
	private Date project_start;
	private Date project_end;
	private int current_invest;
	private int achive_invest;
	private String company;
	private Date project_modified;
	private String content_image1;
	private String content_image2;
	
	private String attach_1;
	private String attach_2;
	private String attach_3;
	
	private String detail_content;
	private Date project_record;
	private char project_check;
}
