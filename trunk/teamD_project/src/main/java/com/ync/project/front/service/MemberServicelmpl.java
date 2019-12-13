package com.ync.project.front.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.domain.MemberVO;
import com.ync.project.domain.ProjectVO;
import com.ync.project.front.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: MemberServicelmpl.java
  * @Date		: 2019. 12. 06. 
  * @Author		: 이승철
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
//	
	public void regist(MemberVO member) {
		log.info("regist......." + member);
		
		mapper.insert(member);
	};

	@Override
	public boolean update(MemberVO member) {
		
		log.info("update......." + member);
		
		return mapper.update(member) == 1;
	}
	@Override
	public void signupInvest(MemberVO member) {
		// TODO Auto-generated method stub
		
		log.info("invester......" + member);
		
		mapper.signupInvest(member);
	}
	@Override
	public MemberVO myPage(String userid) {
		// TODO Auto-generated method stub
		log.info("myPage......." + userid);
		
		return mapper.myPage(userid);
	}
	@Override
	public List<ProjectVO> myPageProject(String userid) {
		// TODO Auto-generated method stub
		log.info("myPageProject......." + userid);
		
		return mapper.myPageProject(userid);
	}
	@Override
	public List<ProjectVO> myPageProjectEnd(String userid) {
		// TODO Auto-generated method stub
		
		return mapper.myPageProjectEnd(userid);
	}
	@Override
	public int member_total() {
		log.info("get member_total");
		return mapper.member_total();
	}

//	@Override
//	public int insert(MemberVO member) {
//		log.info("insert......." + member);
//		
//		return mapper.insert(member);
//	}
	
	

	
}
