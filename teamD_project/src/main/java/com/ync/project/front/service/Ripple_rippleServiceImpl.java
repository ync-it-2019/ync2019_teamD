package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.Criteria;
import com.ync.project.domain.ProjectVO;
import com.ync.project.domain.RippleRippleVO;
import com.ync.project.domain.RippleVO;
import com.ync.project.front.mapper.RippleMapper;
import com.ync.project.front.mapper.Ripple_rippleMapper;

import lombok.extern.log4j.Log4j;

/**
 * 
  * @FileName	: Ripple_rippleServiceImpl.java
  * @Date		: 2019. 10. 30. 
  * @Author		: 이승철
  * @프로그램 설명 : 대댓글 서비스Impl
 */

@Log4j
@Service
public class Ripple_rippleServiceImpl implements Ripple_rippleService {

	@Autowired
	private Ripple_rippleMapper mapper;

	@Override
	public int register(RippleRippleVO ripple) {
		
		log.info("register......." + ripple);

		return mapper.insert(ripple);
	}

	@Override
	public RippleRippleVO get(Long ripple_num) {

		log.info("get......." + ripple_num);

		return mapper.read(ripple_num);
	}

	@Override
	public List<RippleRippleVO> getList() {

		log.info("getList.......");

		return mapper.getList();
	}

	@Override
	public int modify(RippleRippleVO content) {
		log.info("modify......." + content);
		return mapper.update(content);
	}
	
	@Override
	public int remove(Long ripple_num) {
		log.info("remove......." + ripple_num);
		return mapper.delete(ripple_num);
	}

}
