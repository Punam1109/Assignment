package com.cg.assignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment.entity.Leads;
import com.cg.assignment.service.ILeadsService;
import com.cg.assignment.util.LeadsDTOConvertor;

@RestController
@RequestMapping("/leads")
@CrossOrigin(origins = {"http://localhost:4200","htttp://localhost:9090"},allowedHeaders = "*")

public class LeadsController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ILeadsService leadsService;

	
	@PostMapping("/addlead")
	public ResponseEntity<Leads> addLead(@RequestBody Leads leads) throws Exception {
		return new ResponseEntity<Leads>(leadsService.addLead(leads), HttpStatus.OK);
	}



}
