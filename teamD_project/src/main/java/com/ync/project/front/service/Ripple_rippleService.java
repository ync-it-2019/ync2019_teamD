package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.RippleRippleVO;

public interface Ripple_rippleService {

	//댓글 등록
	public int register(RippleRippleVO vo);
	
	//댓글 상세보기
	public RippleRippleVO get(Long ripple_ripple_num);

	//댓글 목록
	public List<RippleRippleVO> getList();
	
	//글 수정
	public int modify(RippleRippleVO vo);
	
	//댓글 삭제
	public int remove(Long ripple_ripple_num);

}
