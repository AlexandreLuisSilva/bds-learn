package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Enrollment;

public interface EnrollmentPK extends JpaRepository<Enrollment, EnrollmentPK>{

	
}
