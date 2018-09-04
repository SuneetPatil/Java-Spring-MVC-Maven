package com.spring.service;

import org.springframework.stereotype.Service;

@Service("serviceLayer")
public class ServiceLayer{
	public String getMessage(String name,String gender){
		String message;
		if(gender.equals("male")){
			message = "Hi "+name+ ", Looking Handsome...!!!";
		}else{
			message = "Hi "+name+ ", Looking Beautiful...!!!";
		}
		return message;
	}
}
