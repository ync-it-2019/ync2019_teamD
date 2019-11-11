package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.InquryVO;

/**
 * @FileName : InquryService.java
 * @Date : 2019. 10. 28.
 * @Author : 이미영
 * @프로그램 설명 : InquryService interface
 */
public interface InquryService {

	// 글 등록
	public void register(InquryVO inqury);

	// 문의답변
	public boolean update(InquryVO inqury);

	// 문의삭제
	public boolean remove(Long ino);

	// 글 상세보기
	public InquryVO get(Long ino);

	// 전체 글 목록
	public List<InquryVO> getList();

}
