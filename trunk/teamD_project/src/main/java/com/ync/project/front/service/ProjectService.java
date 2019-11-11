package com.ync.project.front.service;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;

/**
 * 
  * @FileName	: ProjectService.java
  * @Date		: 2019. 10. 23. 
  * @Author		: 이지원
  * @프로그램 설명 : Project의 Service 파일
 */
public interface ProjectService {
	//글등록
	public void register(ProjectVO project);
	
	//글 상세보기
	public ProjectVO get(Long pno);

	//전체 글 목록
	public List<ProjectVO> getList();
	
	//글 수정
	public boolean modify(ProjectVO project);
	
	//글 삭제
	public boolean remove(Long pno);
	
	/**
	 * 
	  * @Method 설명 : 페이징 추가
	  * @Method Name : getListWithPaging
	  * @Date : 2019. 10. 31.
	  * @작성자 : 이지원
	  * @param cri
	  * @return
	 */
	//글 목록 페이징
	public List<ProjectVO> getListWithPaging(Criteria cri);
	
	//글 목록 페이징
		public List<ProjectVO> getListWithPagingCategory(Criteria cri);
		
	//추가
	public int getTotal(Criteria cri);

	

}
