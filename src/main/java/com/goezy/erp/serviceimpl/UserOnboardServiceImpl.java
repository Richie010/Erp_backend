package com.goezy.erp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goezy.erp.model.ContractorDto;
import com.goezy.erp.repo.UserOnboardRepo;
import com.goezy.erp.service.UserOnboardService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserOnboardServiceImpl implements  UserOnboardService{

	
	@Autowired
	private UserOnboardRepo onboardRepo;
	
}
