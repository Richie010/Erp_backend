package com.goezy.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goezy.erp.model.ContractorDto;
import com.goezy.erp.model.SubContractorDto;
import com.goezy.erp.request.RequestMessage;
import com.goezy.erp.response.ResponseDto;
import com.goezy.erp.response.ResponseMessage;
import com.goezy.erp.service.UserOnboardService;

import jakarta.validation.Valid;
import lombok.val;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author RICHIE
 */

@RestController
@RequestMapping("/api/user")
@SuppressWarnings("unused")
public class UserOnboardControler {
	
	@Autowired
	private UserOnboardService onboardService;
	
	
	@PostMapping("/create")
	public ResponseMessage addUser(@RequestBody RequestMessage message) {

		SubContractorDto subContractorDto = new SubContractorDto();

		if(message.getRequestmessage().getUserid()!=null) {
		
		subContractorDto.setAddress1("Chennai");
		subContractorDto.setAddress2("Arunachalam Appartment");
		subContractorDto.setUserid(Long.parseLong("1010"));
		subContractorDto.setFirstname("Richard");
		subContractorDto.setLastname("J");
		subContractorDto.setEmail("richie@gmail.com");
		}
		
		return ResponseMessage.builder().statusCode("M200").statusDesc("Api Sucess").responseMessage(ResponseDto.builder().subContractorDto(subContractorDto).build()).build() ;
	}
	
				
	

}
