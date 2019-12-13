package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;


public interface ProjectMapper {
	
	public List<ProjectVO> getList(Criteria cri);
	
	public List<ProjectVO> home_slide();
	
	public List<ProjectVO> getListWithPaging(Criteria cri);
	
	public List<ProjectVO> getListWithPagingCategory(Criteria cri);
	
	public void insert(ProjectVO board);
	
	public ProjectVO read(Long pno);
	
	public int delete(Long pno);
	/**
	 * 
	  * @Method 설명 : 글 삭제를 위한 상태 변경.
	  * @Method Name : state_change
	  * @Date : 2019. 12. 3.
	  * @작성자 : 이지원
	  * @param pno
	  * @return
	 */
	public int state_change(Long pno);
	
	public int update(ProjectVO board);
	
	public Integer insertSelectKey(ProjectVO board);
	
	public int getTotalCount(Criteria cri);
	
	public int project_getTotalCount(Criteria cri);
	
	public List<ProjectVO> getHomeOpenProject();
}
