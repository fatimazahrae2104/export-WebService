package com.export.Controlleurs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.export.services.*;

@RestController
public class Controlleur {
	
	exportService service;
	
	@RequestMapping(path="/test", method={RequestMethod.GET})
	@ResponseBody
	public String afficher() {
		return service.afficher();
	}
}