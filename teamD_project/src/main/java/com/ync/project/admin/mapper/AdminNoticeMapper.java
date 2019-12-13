package com.ync.project.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;


 /**
  * @FileName   : AdminNoticeMapper.java
  * @Date      : 2019. 12. 07. 
  * @Author      : 김현진
  * @프로그램 설명 : 공지사항 처리 Mapper interface
  */

public interface AdminNoticeMapper {
	
	public List<NoticeVO> getList();
	
	public List<NoticeVO> getListWithPaging(Criteria cri);

	public void insert(NoticeVO board);

	public void insertSelectKey(NoticeVO board);
	
	public NoticeVO read(Long notice_num);
	
	public int delete(Long notice_num);
	
	public int update(NoticeVO board);

	public int getTotalCount(Criteria cri);
	
}
