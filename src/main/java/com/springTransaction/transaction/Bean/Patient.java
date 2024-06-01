package com.springTransaction.transaction.Bean;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Patient {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int patientNo;
	private String name;
	private String gender;
	private String mobile;
	private int age;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [patientNo=" + patientNo + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile
				+ ", age=" + age + "]";
	}
	public Patient(int patientNo, String name, String gender, String mobile, int age) {
		super();
		this.patientNo = patientNo;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.age = age;
	}
	public int getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
