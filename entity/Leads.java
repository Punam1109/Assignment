package com.cg.assignment.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Leads {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private LocalDate dob;
	private int pincode;
	private String gender;
	private String smoker;
	private String alcoholic;
	private String address;
	private String dependant;
	private LocalDate annualIncome;
	private int govRebate;
	private int taxRebate;
	private String idProof;
	private String financialProof;
	
	public Leads(String firstName, String lastName, long phoneNumber, String email, LocalDate dob, int pincode,
			String gender, String smoker, String alcoholic, String address, String dependant, LocalDate annualIncome,
			int govRebate, int taxRebate, String idProof, String financialProof) {
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dob = dob;
		this.pincode = pincode;
		this.gender = gender;
		this.smoker = smoker;
		this.alcoholic = alcoholic;
		this.address = address;
		this.dependant = dependant;
		this.annualIncome = annualIncome;
		this.govRebate = govRebate;
		this.taxRebate = taxRebate;
		this.idProof = idProof;
		this.financialProof = financialProof;
	}
}
