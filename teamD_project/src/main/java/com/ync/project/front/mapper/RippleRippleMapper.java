package com.ync.project.front.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.RippleRippleVO;
import com.ync.project.domain.RippleVO;

/**
 * 
  * @FileName	: RippleRippleMapper.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이지원
  * @프로그램 설명 : 대댓글 Mapper
 */

public interface RippleRippleMapper {
	public int insert(RippleRippleVO vo);
	
	public RippleRippleVO read(Long ripple_num);
	
	public int delete(Long ripple_num);
	
	public int update(RippleRippleVO content);
	
	public List<RippleRippleVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("ripple_num") Long ripple_num);

	public List<RippleRippleVO> getList();

	
}
