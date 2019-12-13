package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;


/**
 * @FileName    : InquryMapper.java
 * @Date        : 2019. 10. 28. 
 * @Author      : 이미영
 * @프로그램 설명        : 문의 처리 Mapper interface
 */
public interface InquryMapper {
	
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
