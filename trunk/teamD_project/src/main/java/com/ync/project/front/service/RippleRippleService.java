package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.RippleRippleVO;

/**
 * 
  * @FileName	: RippleRippleService.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이지원
  * @프로그램 설명 : 대댓글 service
 */
public interface RippleRippleService {

	//댓글 등록
	public void register(RippleRippleVO rripple);
	
	//댓글 상세보기
	public RippleRippleVO get(Long rno);

	//댓글 목록
	public List<RippleRippleVO> getList();
	
	//글 수정
	public boolean modify(RippleRippleVO content);
	
	//댓글 삭제
	public boolean remove(Long rno);



}
