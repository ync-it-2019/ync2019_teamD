package com.ync.project.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ync.project.admin.mapper.AdminNoticeMapper;
import com.ync.project.domain.Criteria;
import com.ync.project.domain.NoticeVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

 /**
  * @FileName   : AdminNoticeServiceImpl.java
  * @Date      : 2019. 12. 8. 
  * @Author      : 김현진
  * @프로그램 설명 :
  */
@Log4j
@Service
@AllArgsConstructor
public class AdminNoticeServiceImpl implements AdminNoticeService {

	@Autowired //Inject
	private AdminNoticeMapper mapper;

	@Override
	public void register(NoticeVO board) {
		
		log.info("register......." + board);
		
		mapper.insertSelectKey(board);
	}

	@Override
	public List<NoticeVO> getList() {
		
		log.info("getList.......");
		
		return mapper.getList();
	}

	@Override
	public NoticeVO get(Long notice_num) {
		
		log.info("get......." + notice_num);
		
		return mapper.read(notice_num);
	}

	@Override
	public boolean modify(NoticeVO board) {

		log.info("modify......." + board);
		
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long notice_num) {

		log.info("remove......." + notice_num);
		
		return mapper.delete(notice_num) == 1;
	}

	@Override
	public List<NoticeVO> getListWithPaging(Criteria cri) {
        log.info("get List With Criteria: " + cri);
		
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}


}
