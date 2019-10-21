//package com.ync.project.front.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ync.project.domain.Criteria;
//import com.ync.project.domain.ProjectVO;
//import com.ync.project.front.mapper.ProjectMapper;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.log4j.Log4j;
//
//@Log4j
//@Service
///**
// * 
//  * @FileName	: ProjectServiceImpl.java
//  * @Date		: 2019. 10. 21. 
//  * @Author		: 이승철
//  * @프로그램 설명 : 프로젝트 서비스
// */
////@AllArgsConstructor
//public class ProjectServiceImpl implements ProjectService{
//	
//	//spring 4.3 이상에서 자동처리
//	@Autowired // @Inject
//	private ProjectMapper mapper;
//	
//	@Override
//	public void register(ProjectVO project) {
//		
//		log.info("register....." + project);
//		
//		mapper.insertSelectKey(project);
//
//	}
//	
//	@Override
//	public List<ProjectVO> getList() {
//			
//		log.info("getList.....");
//			
//		return mapper.getList();	
//	}
//	
//	@Override
//	public ProjectVO get(Long bno) {
//		
//		log.info("get....." + bno);
//		
//		return mapper.read(bno);
//	}
//	
//	@Override
//	public boolean modify(ProjectVO project) {
//		log.info("modify......." + project);
//		return mapper.update(project) == 1;
//	}
//	
//	@Override
//	public boolean remove(Long bno) {
//		log.info("remove......." + bno);
//		return mapper.delete(bno) == 1;
//	}
//	
//	@Override
//	public List<ProjectVO> getListWithPaging(Criteria cri) {
//		log.info("get List with criteria: " + cri);
//		return mapper.getListWithPaging(cri);
//	}
//
//	@Override
//	public int getTotal(Criteria cri) {
//		log.info("get total count");
//		return mapper.getTotalCount(cri);
//	}
//}
