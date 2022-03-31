package com.cg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Admission;

public interface AdmissionRepo extends JpaRepository<Admission, Integer> {

}
