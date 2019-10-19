package com.test.smile.api.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.test.smile.api.domain.DatosSmile;
import com.test.smile.api.domain.RequestApiFrase;
import com.test.smile.api.domain.ResponseApiFrase;
import com.test.smile.api.repository.SmileRepository;

@Service
public class ConsumeApiFraseServiceImpl implements ConsumeApiFraseService{
	
	@Autowired
    private SmileRepository smileRepository;
	
	 static final String URL_API_FRASE = "https://andruxnet-random-famous-quotes.p.rapidapi.com/";
	
	@Autowired
    public ConsumeApiFraseServiceImpl() {
       
    }

	@Override
	public DatosSmile consumeApiFrase() {
		
		DatosSmile datosSmile = new DatosSmile();
		ResponseApiFrase responseApiFrase = new ResponseApiFrase();
		RequestApiFrase newRquest = new RequestApiFrase(1,"Famous");
		String response = "";
		
		try {
			
		
		// HttpHeaders
        HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-rapidapi-host", "andruxnet-random-famous-quotes.p.rapidapi.com");
        headers.set("x-rapidapi-key", "aca72ce7b8msh6d191e8f9ac2a9bp191756jsnd2e4fc467918");
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<RequestApiFrase> requestBody = new HttpEntity<>(newRquest, headers);
 
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with POST method.
        response =  restTemplate.postForObject(URL_API_FRASE, requestBody, String.class);
        
        datosSmile.setFrase(response);
        datosSmile.setUrlimagen("https://github.com/manuelinin/ProyectoDemo");
       
        
        persistirsmile(datosSmile);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return datosSmile;
	}
	
	
	public void persistirsmile(DatosSmile smile) {
		smileRepository.save(smile);
	}

}
