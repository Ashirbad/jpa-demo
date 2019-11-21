package com.jpademo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpademo.repository.UserRepository;
import com.jpademo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;

	
	public String ctlgId="123";
	public String opernm="/account";
	
	public List<String> getTestCaseIds(){
		List<String> testCaseIdList  = new ArrayList<>();
		try {
			
			testCaseIdList = userRepository.getTestCaseId(ctlgId,opernm);
			
			
			//....set others
			
		} catch (Exception exception) {
			log.error(exception.getMessage(), exception);
		}
		return testCaseIdList;
	}

	

}
