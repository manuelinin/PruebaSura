package com.test.smile.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumeApiFotoServiceImpl implements ConsumeApiFotoService{
	
	 @Autowired
    public ConsumeApiFotoServiceImpl() {
       
    }

	@Override
	public String consumeApiFoto() {
		String variable = "Hola Manuel, \n esta es la URL de la foto";
		return variable;
	}

}
