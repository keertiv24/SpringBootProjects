package com.org.application.controller;

import org.springframework.web.bind.annotation.RestController;

import com.org.application.Service.GetEmpDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/get")
public class GetEmpDataController {
	
	@Autowired
	private GetEmpDataService getEmpDataService;
	
	
	
	@GetMapping("/all")
	public String getData()
	{
		return getEmpDataService.getService();
		 
	}
		
	
    
    
    
}
