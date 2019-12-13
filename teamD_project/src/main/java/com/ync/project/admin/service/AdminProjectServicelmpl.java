package com.ync.project.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.admin.mapper.AdminProjectMapper;
import com.ync.project.domain.Criteria;
import com.ync.project.domain.MemberVO;
import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleRippleVO;
import com.ync.project.domain.RippleVO;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: AdminProjectServicelmpl.java
  * @Date		: 2019. 12. 8. 
  * @Author		: 이승철
  * @프로그램 설명 : 어드민 프로젝트 서비스
 */
@Log4j
@Service
public class AdminProjectServicelmpl implements AdminProjectService{

	@Autowired
	private AdminProjectMapper mapper;

	@Override
	public List<ProjectVO> adminProjectGet() {
		// TODO Auto-generated method stub
		log.info("project list...");
		
		return mapper.adminProjectGet();
	}

	@Override
	public void ProjectStarting(long project_num) {
		// TODO Auto-generated method stub
		log.info("project starting......");
				
		mapper.ProjectStarting(project_num);
	}
	
	@Override
	public void ProjectStopping(long project_num) {
		// TODO Auto-generated method stub
		log.info("project stopping......");
		
		mapper.ProjectStopping(project_num);
	}

	@Override
	public void ProjectDeleting(long project_num) {
		// TODO Auto-generated method stub
		log.info("project delete Standby......");
		
		mapper.ProjectDeleting(project_num);
	}

	@Override
	public List<ProjectVO> adminOpenProjectGet() {
		// TODO Auto-generated method stub
		log.info("open project list...");
		
		return mapper.adminOpenProjectGet();
	}

	@Override
	public List<ProjectVO> adminEndProjectGet() {
		// TODO Auto-generated method stub
		log.info("end project list......");
		
		return mapper.adminEndProjectGet();
	}

	@Override
	public void ProjectStandBying(long project_num) {
		// TODO Auto-generated method stub
		log.info("project is standBying......");
		
		mapper.ProjectStandBying(project_num);
	}

	@Override
	public List<ProjectVO> adminRequestProjectGet() {
		// TODO Auto-generated method stub
		log.info("Requested project list......");
		
		return mapper.adminRequestProjectGet();
	}

	@Override
	public ProjectVO RequestProject(long project_num) {
		// TODO Auto-generated method stub
		log.info("No." + project_num + " / project content......");
		
		return mapper.RequestProject(project_num);
	}

	@Override
	public List<ProjectVO> adminRemoveRequestProjectGet() {
		// TODO Auto-generated method stub
		log.info("remove requested project list......");
		
		return mapper.adminRemoveRequestProjectGet();
	}

	@Override
	public List<RippleVO> adminCommentGet() {
		// TODO Auto-generated method stub
		log.info("ripple & ripple_ripple list......");
		
		return mapper.adminCommentGet();
	}

	@Override
	public ProjectVO projectDashboardCountGet() {
		// TODO Auto-generated method stub
		log.info("project count & user count get");
		
		return mapper.projectDashboardCountGet();
	}

	@Override
	public ProjectVO projectDashboardCategoryRankGet() {
		// TODO Auto-generated method stub
		log.info("ripple & ripple_ripple list......");
		
		return mapper.projectDashboardCategoryRankGet();
	}

	@Override
	public List<ProjectVO> projectDashboardProjectRankGet() {
		// TODO Auto-generated method stub
		log.info("project ranking list......");
		
		return mapper.projectDashboardProjectRankGet();
	}

	@Override
	public ProjectVO investCountProjectCount() {
		// TODO Auto-generated method stub
		log.info("invest & project count......");
		
		return mapper.investCountProjectCount();
	}

	@Override
	public List<RippleRippleVO> adminRRippleGet() {
		// TODO Auto-generated method stub
		
		return mapper.adminRRippleGet();
	}

	@Override
	public void commentDelete(long ripple_num) {
		// TODO Auto-generated method stub
		
		mapper.commentDelete(ripple_num);
	}

	@Override
	public void RRippleDelete(long ripple_ripple_num) {
		// TODO Auto-generated method stub
		
		mapper.RRippleDelete(ripple_ripple_num);
	}
}
