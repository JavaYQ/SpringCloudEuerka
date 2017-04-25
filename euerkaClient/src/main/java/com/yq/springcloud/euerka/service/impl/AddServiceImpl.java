package com.yq.springcloud.euerka.service.impl;

import org.springframework.stereotype.Service;

import com.yq.springcloud.euerka.service.AddService;



@Service
public class AddServiceImpl implements AddService {

	@Override
	public int getResult(int first, int second) {

		return first+second;
	}

}
