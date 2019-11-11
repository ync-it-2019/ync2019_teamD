package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleVO;
import com.ync.project.front.mapper.RippleMapper;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: RippleMapper.java
  * @Date		: 2019. 10. 23. 
  * @Author		: 이준혁
  * @프로그램 설명 : 댓글service 작성
 */

@Log4j
@Service
public class RippleServiceImpl implements RippleService {

	@Autowired
	private RippleMapper mapper;

	@Override
	public void register(RippleVO ripple) {
		
		log.info("register......." + ripple);

		mapper.insert(ripple);
	}

	@Override
	public RippleVO get(Long ripple_num) {

		log.info("get......." + ripple_num);

		return mapper.read(ripple_num);
	}

	@Override
	public List<RippleVO> getList() {

		log.info("getList.......");

		return mapper.getList();
	}

	@Override
	public boolean modify(RippleVO content) {
		log.info("modify......." + content);
		return mapper.update(content) == 1;
	}
	
	@Override
	public boolean remove(Long ripple_num) {
		log.info("remove......." + ripple_num);
		return mapper.delete(ripple_num) == 1;
	}

}
