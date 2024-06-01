package com.springTransaction.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springTransaction.transaction.Bean.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
