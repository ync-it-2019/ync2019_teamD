package com.ync.project.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ync.project.domain.RipplePageDTO;
import com.ync.project.domain.RippleVO;
import com.ync.project.domain.Criteria;
import com.ync.project.front.mapper.RippleMapper;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

	@Service
	@Log4j
	//@AllArgsConstructor
	public class RippleServiceImpl implements RippleService{
		
		@Setter(onMethod_ = @Autowired)
		private RippleMapper mapper;
		
		
		@Override
		public void register(RippleVO vo) {
			
			log.info("register......" + vo);
		
			
			mapper.insert(vo);
			
		}
		
		@Override
		public RippleVO get(String userid) {
			
			log.info("get...." + userid);
			
			return mapper.read(userid);
		}
		
		@Override
		public int modify(RippleVO vo) {
			
			log.info("modify......" + vo);
			
			return mapper.update(vo);
			
		}
		
		
		@Override
		public int remove(Long ripple_num) {
			
			log.info("remove...." + ripple_num);
			
			return mapper.remove(ripple_num);
		}
		
		@Override
		public List<RippleVO> getList(Long project_num) {
			
			log.info("get Reply List of ad Board" + project_num);
			
			return mapper.getList(project_num);
		}

		@Override
		public RipplePageDTO getListPage(Criteria cri, Long project_num) {
			// TODO Auto-generated method stub
			return new RipplePageDTO(
					mapper.getCountByBno(project_num),
					mapper.getListWithPaging(cri, project_num));
		}
		
	}
