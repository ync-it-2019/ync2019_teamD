package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.RippleRippleVO;
import com.ync.project.domain.RippleVO;
import com.ync.project.front.mapper.RippleRippleMapper;

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
public class RippleRippleServiceImpl implements RippleRippleService {

	@Autowired
	private RippleRippleMapper mapper;

	@Override
	public void register(RippleRippleVO rripple) {
		
		log.info("register......." + rripple);

		mapper.insert(rripple);
	}

	@Override
	public RippleRippleVO get(Long ripple_ripple_num) {

		log.info("get......." + ripple_ripple_num);

		return mapper.read(ripple_ripple_num);
	}

	@Override
	public List<RippleRippleVO> getList() {

		log.info("getList.......");

		return mapper.getList();
	}

	@Override
	public boolean modify(RippleRippleVO content) {
		log.info("modify......." + content);
		return mapper.update(content) == 1;
	}
	
	@Override
	public boolean remove(Long ripple_ripple_num) {
		log.info("remove......." + ripple_ripple_num);
		return mapper.delete(ripple_ripple_num) == 1;
	}

}
