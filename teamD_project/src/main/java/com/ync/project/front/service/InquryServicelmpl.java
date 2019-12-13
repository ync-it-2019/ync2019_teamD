package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.InquryVO;
import com.ync.project.front.mapper.InquryMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * @FileName : InquryServicelmpl.java
 * @Date : 2019. 10. 28.
 * @Author : 이미영
 * @프로그램 설명 : 문의서비스lmpl
 */

@Log4j
@Service
@AllArgsConstructor
public class InquryServicelmpl implements InquryService {

	@Autowired
	private InquryMapper mapper;

	@Override
	public void register(InquryVO inqury) {

		log.info("register......." + inqury);

		mapper.insert(inqury);
	}

	@Override
	public InquryVO get(Long ino) {

		log.info("get......." + ino);

		return mapper.read(ino);
	}
	
	@Override
	public void InquryDeleting(long inqury_num) {
		log.info("inqury delete Standby......");
		
		mapper.InquryDeleting(inqury_num);
	}

	@Override
	public List<InquryVO> getList() {

		log.info("getList.......");

		return mapper.getList();
	}

	@Override
	public boolean update(InquryVO inqury) {

		log.info("update......." + inqury);

		return mapper.update(inqury) == 1;
	}

	@Override
	public List<InquryVO> getListWithPaging(Criteria cri) {
		log.info("get List with criteria: " + cri);
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

}
