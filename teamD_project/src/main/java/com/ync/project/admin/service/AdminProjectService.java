package com.ync.project.admin.service;

import java.util.List;

import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleRippleVO;
import com.ync.project.domain.RippleVO;

/**
 * 
  * @FileName	: AdminProjectService.java
  * @Date		: 2019. 12. 8. 
  * @Author		: 이승철
  * @프로그램 설명 : 어드민 프로젝트 서비스
 */
public interface AdminProjectService {
	
	public List<ProjectVO> adminProjectGet();
	
	public void ProjectStarting(long project_num);
	
	public void ProjectStopping(long project_num);
	
	public void ProjectDeleting(long project_num);
	
	public void ProjectStandBying(long project_num);
	
	public List<ProjectVO> adminOpenProjectGet();
	
	public List<ProjectVO> adminEndProjectGet();
	
	public List<ProjectVO> adminRequestProjectGet();
	
	public List<ProjectVO> adminRemoveRequestProjectGet();
	
	public ProjectVO RequestProject(long project_num);
	
	public List<RippleVO> adminCommentGet();
	
	public List<RippleRippleVO> adminRRippleGet();
	
	public ProjectVO projectDashboardCountGet();
	
	public ProjectVO projectDashboardCategoryRankGet();
	
	public List<ProjectVO> projectDashboardProjectRankGet();
	
	public ProjectVO investCountProjectCount();
	
	public void commentDelete(long ripple_num);
	
	public void RRippleDelete(long ripple_ripple_num);
}
