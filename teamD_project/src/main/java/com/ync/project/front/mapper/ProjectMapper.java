package com.ync.project.front.mapper;

import java.util.List;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;


public interface ProjectMapper {
	
	public List<ProjectVO> getList();
	
	public List<ProjectVO> getListWithPaging(Criteria cri);
	
	public List<ProjectVO> getListWithPagingCategory(Criteria cri);
	
	public void insert(ProjectVO board);
	
	public ProjectVO read(Long pno);
	
	public int delete(Long pno);
	
	public int update(ProjectVO board);
	
	public Integer insertSelectKey(ProjectVO board);
	
	public int getTotalCount(Criteria cri);
	
}
