package com.jpademo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.dto.APIResponseDTO;
import com.jpademo.dto.UserDTO;
import com.jpademo.service.UserService;
import com.jpademo.service.impl.UserServiceImpl;
import com.jpademo.util.CommonConstants;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserService userService;

	private static final String USER_URL = "/get-testids";
	
	@ApiOperation(value = "ids", notes = "To fetch user based on ...", response = APIResponseDTO.class, produces = "application/json")
	@RequestMapping(value = USER_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<APIResponseDTO> getUser() {
		APIResponseDTO _response = new APIResponseDTO();
		try {
			 List<String> data = userService.getTestCaseIds();
			 if(!data.isEmpty()) {
				_response.setBody(data);
				_response.setSuccess();
			} else {
				throw new Exception(CommonConstants.RECORD_NOT_FOUND_MESSAGE);
			}
		} catch (Exception exception) {
			log.error("Exception in getUser()", exception);
			_response.setFail();
		}
		return new ResponseEntity<APIResponseDTO>(_response, HttpStatus.OK);
	}


}
