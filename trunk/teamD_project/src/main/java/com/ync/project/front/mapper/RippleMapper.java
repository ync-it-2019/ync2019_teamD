package com.ync.project.front.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.RippleVO;

/**
 * 
  * @FileName	: RippleMapper.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이준혁
  * @프로그램 설명 : 댓글Mapper 작성
 */

public interface RippleMapper {
	public int insert(RippleVO vo); //등록
	
	public RippleVO read(String userid);
	
	public RippleVO read2(Long project_num);
	
	public int remove(Long ripple_num);
	
	public int update(RippleVO content);
	
	public List<RippleVO> getList(Long project_num);
	
	public List<RippleVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("project_num") Long project_num);

	public int getCountByBno(Long project_num);
	
}
