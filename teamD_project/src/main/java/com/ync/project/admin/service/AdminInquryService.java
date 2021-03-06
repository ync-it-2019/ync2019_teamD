package com.ync.project.admin.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;


 /**
  * @FileName   : AdminInquryService.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 :
  */
public interface AdminInquryService {

	// 글 등록
	public void register(InquryVO inqury);

	// 문의답변
	public boolean update(InquryVO inqury);

	// 문의삭제
	public void InquryDeleting(long inqury_num);

	// 글 상세보기
	public InquryVO get(Long ino);

	// 전체 글 목록
	public List<InquryVO> getList();

	public List<InquryVO> getListWithPaging(Criteria cri);

	public int getTotal(Criteria cri);

	//public int getTotal(Criteria cri);

}
