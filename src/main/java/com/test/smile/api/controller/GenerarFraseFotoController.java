package com.test.smile.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.smile.api.domain.DatosSmile;
import com.test.smile.api.domain.ResponseApiFrase;
import com.test.smile.api.service.ConsumeApiFotoService;
import com.test.smile.api.service.ConsumeApiFraseService;


@RestController
@RequestMapping("/generar")
public class GenerarFraseFotoController {
	
	private final ConsumeApiFraseService ConsumeApiFraseService;
	private final ConsumeApiFotoService  consumeApiFotoService;
	
	
	 @Autowired
    public GenerarFraseFotoController(final ConsumeApiFraseService ConsumeApiFraseService, ConsumeApiFotoService consumeApiFotoService) {
        this.ConsumeApiFraseService = ConsumeApiFraseService;
        this.consumeApiFotoService = consumeApiFotoService;
    }

	 
	 @GetMapping("/frase_foto")
	 DatosSmile getGeneraFrase_Foto() {
        return ConsumeApiFraseService.consumeApiFrase();
    }
}
