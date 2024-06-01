package com.springTransaction.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springTransaction.transaction.dto.appointmentForm;
import com.springTransaction.transaction.serviceImpl.BookAppointmentService;

@RestController
public class transactionController {
	
	@Autowired
	private BookAppointmentService service;
	
	@PostMapping("/bookappointment")
	public String bookAppointment(@RequestBody appointmentForm form) {
		
		return service.bookAppointment(form);
	}

}
