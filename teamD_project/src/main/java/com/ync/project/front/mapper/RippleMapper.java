package com.ync.project.front.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.RippleVO;

/**
 * 
  * @FileName	: RippleMapper.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이승철
  * @프로그램 설명 : 댓글Mapper 작성
 */

public interface RippleMapper {
	public int insert(RippleVO vo);
	
	public RippleVO read(Long ripple_num);
	
	public int delete(Long ripple_num);
	
	public int update(RippleVO content);
	
	public List<RippleVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("project_num") Long project_num);

	public List<RippleVO> getList();

	
}
