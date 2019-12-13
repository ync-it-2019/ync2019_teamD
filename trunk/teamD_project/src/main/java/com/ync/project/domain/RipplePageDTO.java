package com.ync.project.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class RipplePageDTO {
	
	private int replyCnt;
	private List<RippleVO> list;
}
