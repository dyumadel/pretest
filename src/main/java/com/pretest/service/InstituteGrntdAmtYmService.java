package com.pretest.service;

import com.pretest.entity.GrntdAmtYm;
import com.pretest.entity.Institute;
import com.pretest.entity.InstituteNameOnly;

import java.util.List;

public interface InstituteGrntdAmtYmService {

	Institute findByInstituteCode(String instituteCode);

	Institute findByInstituteName(String instituteName);

	void saveInstitute(Institute institute);

	List<Institute> findAllInstitute();
	List<InstituteNameOnly> findAllInstituteName();

	boolean isInstituteExist(Institute institute);



	GrntdAmtYm findByYearAndMonth(String year, String month);

	void saveGrntdAmtYm(GrntdAmtYm grntdAmtYm);

	List<GrntdAmtYm> findAllGrntdAmtYm();

}
