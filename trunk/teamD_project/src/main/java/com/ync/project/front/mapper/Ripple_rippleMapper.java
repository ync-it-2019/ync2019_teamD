package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.RippleRippleVO;

/**
 * 
  * @FileName	: RippleMapper.java
  * @Date		: 2019. 10. 21. 
  * @Author		: 이승철
  * @프로그램 설명 : 댓글Mapper 작성
 */

public interface Ripple_rippleMapper {
	public int insert(RippleRippleVO vo);
	
	public RippleRippleVO read(Long ripple_ripple_num);
	
	public int delete(Long ripple_ripple_num);
	
	public int update(RippleRippleVO vo);

	public List<RippleRippleVO> getList();
}
