package com.yq.springcloud.euerkaMinus.service.impl;

import org.springframework.stereotype.Service;

import com.yq.springcloud.euerkaMinus.service.MinusService;

@Service
public class MinusServiceImpl implements MinusService {

	@Override
	public int getResult(int first, int second) {
		return first-second;
	}

}
