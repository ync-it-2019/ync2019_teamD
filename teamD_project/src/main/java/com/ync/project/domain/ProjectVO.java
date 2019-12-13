package com.ync.project.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;



/**
 * 
  * @FileName	: ProjectVO.java
  * @Date		: 2019. 12. 03. 
  * @Author		: 이지원
  * @프로그램 설명 : 프로젝트 작성 VO project_distinct추가
 */

@Data
public class ProjectVO {
	private Long project_num;
	private String category;
	private String title_image;
	private String simple_content;
	private String detail_content;
	private String phone;
	private String userid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date project_start;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date project_end;
	private int current_invest;
	private int achive_invest;
	private String company;
	private Date project_modified;
	private String contents_image1;
	private String contents_image2;
	
	private String attach_1;
	private String attach_2;
	private String attach_3;
	
	private Date project_record;
	private String project_distinct;
	
	private int su;
	
	//싱글페이지 멤버와 조인 용
	private String address;
	private String profile_image;
	private String self_introduce;
	
	// 어드민 용
	private int achive;
	
	private int countProject;
	private int countUser;
	private int rownum;
	private int cnt;
	private int inv;
}