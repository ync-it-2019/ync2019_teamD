package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;
import com.ync.project.front.mapper.ProjectMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
/**
 * 
  * @FileName	: ProjectServiceImpl.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이지원
  * @프로그램 설명 : 대댓글 serviceImpl
 */
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService{

	@Autowired 
	private ProjectMapper mapper;
	
	@Override
	public void register(ProjectVO project) {
		
		log.info("register....." + project);
		
		mapper.insertSelectKey(project);
	}

	@Override
	public ProjectVO get(Long pno) {
		
		log.info("get....." + pno);
		
		return mapper.read(pno);
	}
	
	@Override
	public List<ProjectVO> getList(Criteria cri) {
			
		log.info("getList.....");
			
		return mapper.getList(cri);	
	}
	
	@Override
	public List<ProjectVO> homeGetList() {
			
		log.info("homeGetList.....");
			
		return mapper.home_slide();	
	}
	
	@Override
	public boolean modify(ProjectVO project) {
		log.info("modify......." + project);
		return mapper.update(project) == 1;
	}
	
	@Override
	public boolean remove(Long pno) {
		log.info("remove......." + pno);
		return mapper.delete(pno) == 1;
	}

	/**
	 * 12-03일 삭제대기 상태로 만드는 메소드 생성. 데이터테이블 project_distinct추가
	 */
	@Override
	public boolean remove_standBy(Long pno) {
		log.info("state_change......." + pno);
		return mapper.state_change(pno) == 1;
	}

	/**
	 * 10-31추가
	 */
	@Override
	public List<ProjectVO> getListWithPaging(Criteria cri) {
		log.info("get List with criteria: " + cri + "확인용 " + cri.getP_type());
		return mapper.getListWithPaging(cri);
	}
	
	/**
	 * 11-04일 추가
	 */
	@Override
	public List<ProjectVO> getListWithPagingCategory(Criteria cri) {
		log.info("get List with criteria: " + cri);
		return mapper.getListWithPagingCategory(cri);
	}
	
	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	
	@Override
	public int project_getTotal(Criteria cri) {
		log.info("project get total count");
		return mapper.project_getTotalCount(cri);
	}

	@Override
	public List<ProjectVO> getHomeOpenProject() {
		log.info("Home page open project list of year......");

		return mapper.getHomeOpenProject();
	}

}
