package com.ync.project.admin.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;

 /**
  * @FileName   : AdminNoticeService.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 :
  */
public interface AdminNoticeService {

		//글 등록
		public void register(NoticeVO board);
		
		//글 상세보기
		public NoticeVO get(Long notice_num);

		//글 수정
		public boolean modify(NoticeVO board);
		
		//글 삭제
		public boolean remove(Long notice_num);

		//전체 글 목록
		public List<NoticeVO> getList();
		
		//글 목록 페이징
		public List<NoticeVO> getListWithPaging(Criteria cri);
		
		//추가
		public int getTotalCount(Criteria cri);
}
