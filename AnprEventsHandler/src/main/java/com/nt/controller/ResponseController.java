package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.sensen.ResponseDTO;
import com.nt.service.ResponseService;

/**
 *
 * @author Firoj Khan
 * @since 2020-08-03
 */

@RestController
public class ResponseController {
	
	@Autowired
	ResponseService responseService ;
	
	@PostMapping(value = "/saveData")
	public ResponseDTO saveData(@RequestBody ResponseDTO rdto) {
		System.out.println("SavaData");
		ResponseDTO st = responseService.saveResponseData(rdto);
		return st;
	}
}
