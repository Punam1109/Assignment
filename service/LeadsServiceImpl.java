package com.cg.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Leads;
import com.cg.assignment.repository.ILeadsRepository;

@Service
public class LeadsServiceImpl implements ILeadsService{
	
	@Autowired
	ILeadsRepository leadsRepository;

	@Override
	public Leads addLead(Leads leads) throws Exception {

			return leadsRepository.save(leads);
	}


}
