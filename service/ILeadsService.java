package com.cg.assignment.service;

import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Leads;

@Service
public interface ILeadsService {
	
	public Leads addLead(Leads leads) throws Exception;


}
