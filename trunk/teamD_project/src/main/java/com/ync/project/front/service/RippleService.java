package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleVO;

public interface RippleService {

	//댓글 등록
	public void register(RippleVO ripple);
	
	//댓글 상세보기
	public RippleVO get(Long rno);

	//댓글 목록
	public List<RippleVO> getList();
	
	//글 수정
	public boolean modify(RippleVO content);
	
	//댓글 삭제
	public boolean remove(Long rno);



}
