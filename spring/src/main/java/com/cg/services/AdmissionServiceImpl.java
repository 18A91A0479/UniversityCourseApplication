package com.cg.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Admission;
import com.cg.repos.AdmissionRepo;

public class AdmissionServiceImpl implements AdmissionService {
	@Autowired
	private AdmissionRepo repo;
	

	@Transactional
	public Admission addAdmission(Admission admin) {
		Admission admission=repo.save(admin);
		return admission;
	}


	@Transactional
	public Admission updateAdmission(Admission admin) {
		Admission admission=repo.save(admin);
		return admission;
	}


	@Transactional
	public void cancleAdmission(int admissionId) {
		repo.deleteById(admissionId);

	}


	@Transactional
	public List<Admission> showAllAdmissionByCourseId(int courseId) {
		
		return null;
	}


	@Transactional
	public List<Admission> showAllAdmissionByDate(LocalDate local) {
		// TODO Auto-generated method stub
		return null;
	}

}
