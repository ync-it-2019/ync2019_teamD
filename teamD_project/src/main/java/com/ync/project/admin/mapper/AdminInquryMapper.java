package com.ync.project.admin.mapper;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;


 /**
  * @FileName   : AdminInquryMapper.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 :
  */
public interface AdminInquryMapper {
	
	public List<InquryVO> getList();
	
	public List<InquryVO> getListWithPaging(Criteria cri);
	
	public InquryVO read(Long ino);
	
	public void insert(InquryVO inqury);
	
	public int update(InquryVO inqury);
	
	public Integer insertSelectKey(InquryVO inqury);
	
	public int delete(Long ino);

	public int getTotalCount(Criteria cri);

	public void InquryDeleting(long inqury_num);
	
}
