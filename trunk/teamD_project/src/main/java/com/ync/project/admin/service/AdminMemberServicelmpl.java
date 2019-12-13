package com.ync.project.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.admin.mapper.AdminMemberMapper;
import com.ync.project.domain.Criteria;
import com.ync.project.domain.MemberVO;

import lombok.extern.log4j.Log4j;

/**
  * @FileName	: MemberServicelmpl.java
  * @Date		: 2019. 12. 06. 
  * @Author		: 이승철
  * @프로그램 설명      : MemberServicelmpl
  */

@Log4j
@Service
public class AdminMemberServicelmpl implements AdminMemberService{

	@Autowired
	private AdminMemberMapper mapper;

	@Override
	public List<MemberVO> adminUserGet() {
		log.info("user list get......" + mapper.adminUserGet());
		
		return mapper.adminUserGet();
	}

	@Override
	public MemberVO investorCountGet() {
		// TODO Auto-generated method stub
		log.info("investor count get......" + mapper.investorCountGet());
		
		return mapper.investorCountGet();
	}

	@Override
	public List<MemberVO> investRankGet() {
		// TODO Auto-generated method stub
		log.info("investor rank get......");
		
		return mapper.investRankGet();
	}

}
