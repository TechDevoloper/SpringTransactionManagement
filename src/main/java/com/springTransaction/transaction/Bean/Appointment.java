package com.springTransaction.transaction.Bean;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
public class Appointment {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentNo;
	private LocalDate appointmenDate;
	private int doctorNo;
	private int patientNo;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointmentNo, LocalDate appointmenDate, int doctorNo, int patientNo) {
		super();
		this.appointmentNo = appointmentNo;
		this.appointmenDate = appointmenDate;
		this.doctorNo = doctorNo;
		this.patientNo = patientNo;
	}
	public int getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public LocalDate getAppointmenDate() {
		return appointmenDate;
	}
	public void setAppointmenDate(LocalDate date) {
		this.appointmenDate = date;
	}
	public int getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(int doctorNo) {
		this.doctorNo = doctorNo;
	}
	public int getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentNo=" + appointmentNo + ", appointmenDate=" + appointmenDate + ", doctorNo="
				+ doctorNo + ", patientNo=" + patientNo + "]";
	}
	
	
}
