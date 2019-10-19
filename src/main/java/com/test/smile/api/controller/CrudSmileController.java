package com.test.smile.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.smile.api.domain.DatosSmile;
import com.test.smile.api.repository.SmileRepository;

@RestController
@RequestMapping("/api/smile")
public class CrudSmileController {
	
	@Autowired
    private SmileRepository smileRepository;
	
	
	@GetMapping("/listsmile")
    public List<DatosSmile> listsmile() {
        return smileRepository.findAll();
    }
	
	
	@GetMapping("/getsmile/{id}")
    public ResponseEntity<DatosSmile> getsmile(@PathVariable(value = "id") Long smileId)
        throws ResourceNotFoundException {
		DatosSmile smile = smileRepository.findOne(smileId);
        return ResponseEntity.ok().body(smile);
    }
	
	
	@PostMapping("/createsmiles")
    public DatosSmile createsmiles(@Valid @RequestBody DatosSmile smile) {
        return smileRepository.save(smile);
    }
	
	@PutMapping("/updatesmiles/{id}")
    public ResponseEntity<DatosSmile> updatesmiles(@PathVariable(value = "id") Long employeeId,
         @Valid @RequestBody DatosSmile smileDetails) throws ResourceNotFoundException {
		DatosSmile smile = smileRepository.findOne(employeeId);

		smile.setId_dato(smileDetails.getId_dato());
		smile.setFrase(smileDetails.getFrase());
		smile.setUrlimagen(smileDetails.getUrlimagen());
        final DatosSmile updatedEmployee = smileRepository.save(smile);
        return ResponseEntity.ok(updatedEmployee);
    }
	
	
	@DeleteMapping("/deletesmiles/{id}")
    public Map<String, Boolean> deletesmiles(@PathVariable(value = "id") Long employeeId)
         throws ResourceNotFoundException {
		DatosSmile employee = smileRepository.findOne(employeeId);

		smileRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
