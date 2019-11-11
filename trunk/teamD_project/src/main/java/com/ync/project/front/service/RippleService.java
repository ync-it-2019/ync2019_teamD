package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleVO;

public interface RippleService {

	//댓글 등록
	public int register(RippleVO vo);
	
	//댓글 상세보기
	public RippleVO get(Long ripple_num);

	//댓글 목록
	public List<RippleVO> getList();
	
	//글 수정
	public boolean modify(RippleVO vo);
	
	//댓글 삭제
	public boolean remove(Long ripple_num);

	public List<RippleVO> getListWithPaging(Criteria cri, Long project_num);

}
