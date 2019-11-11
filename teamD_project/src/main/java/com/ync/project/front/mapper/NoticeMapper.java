package com.ync.project.front.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;


 /**
  * @FileName   : NoticeMapper.java
  * @Date      : 2019. 10. 27. 
  * @Author      : 김현진
  * @프로그램 설명 : 공지사항 처리 Mapper interface
  */

public interface NoticeMapper {
	
	public List<NoticeVO> getList();
	
	public List<NoticeVO> getListWithPaging(Criteria cri);

	public void insert(NoticeVO board);

	public void insertSelectKey(NoticeVO board);
	
	public NoticeVO read(Long notice_num);
	
	public int delete(Long notice_num);
	
	public int update(NoticeVO board);

	public int getTotalCount(Criteria cri);
	
	public void updateReplyCnt(@Param("notice_num") Long notice_num, 
			                   @Param("amount") int amount);
}
