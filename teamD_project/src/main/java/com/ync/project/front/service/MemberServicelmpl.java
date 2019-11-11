package com.ync.project.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.MemberVO;
import com.ync.project.front.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: MemberServicelmpl.java
  * @Date		: 2019. 10. 28. 
  * @Author		: 이미영
  * @프로그램 설명      : MemberServicelmpl
  */

@Log4j
@Service
public class MemberServicelmpl implements MemberService{

	@Autowired
	private MemberMapper mapper;

	@Override
	public MemberVO get(String userid) {

		log.info("get......." + userid);
		
		return mapper.read(userid);
	}
	
	public void insert(MemberVO member) {
		log.info("insert......." + member);
		
		mapper.insert(member);
	};

	@Override
	public boolean update(MemberVO member) {
		
		log.info("update......." + member);
		
		return mapper.update(member) == 1;
	}

}
