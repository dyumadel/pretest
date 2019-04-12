package com.pretest.repository;


import com.pretest.entity.Institute;
import com.pretest.entity.InstituteNameOnly;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstituteRepository extends JpaRepository<Institute, Long> {

	Institute findByInstituteCode(String instituteCode);
	Institute findByInstituteName(String instituteName);
	List<InstituteNameOnly> findAllProjectedBy();
}
