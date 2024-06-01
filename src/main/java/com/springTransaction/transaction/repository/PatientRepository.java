package com.springTransaction.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springTransaction.transaction.Bean.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
