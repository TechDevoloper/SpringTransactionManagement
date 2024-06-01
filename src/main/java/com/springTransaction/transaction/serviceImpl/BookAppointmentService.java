package com.springTransaction.transaction.serviceImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springTransaction.transaction.Bean.Appointment;
import com.springTransaction.transaction.Bean.Patient;
import com.springTransaction.transaction.dto.appointmentForm;
import com.springTransaction.transaction.repository.AppointmentRepository;
import com.springTransaction.transaction.repository.PatientRepository;



@Service
public class BookAppointmentService {
	
	@Autowired
	AppointmentRepository appointment;
	
	@Autowired
	PatientRepository patient;

	
	
	public String bookAppointment(appointmentForm form) {
		//Here we can copy the data from appointmentform to patient
		Patient p= new ObjectMapper().convertValue(form, Patient.class);
		//now save those details in the patientRepo and get the patientNo
		System.out.println("patient save succesfully");
		Integer patientNo =patient.save(p).getPatientNo();
		
		Appointment a=new Appointment();
	    a.setAppointmenDate(LocalDate.now());
	    a.setPatientNo(p.getPatientNo());
	    a.setDoctorNo(124);
	    a.setAppointmentNo(98);
		Integer AppointmentNo=appointment.save(a).getAppointmentNo();
		return "appointment Saved sucessfully : "+AppointmentNo;
	}

}
