package com.pretest.service;

import com.pretest.entity.GrntdAmtYm;
import com.pretest.entity.Institute;
import com.pretest.entity.InstituteNameOnly;
import com.pretest.repository.GrntdAmtYmRepository;
import com.pretest.repository.InstituteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service("InstituteGrntdAmtYmService")
@Transactional
public class InstituteGrntdAmtYmServiceImpl implements InstituteGrntdAmtYmService{

	@Autowired
	private InstituteRepository instituteRepository;

	@Autowired
	private GrntdAmtYmRepository grntdAmtYmRepository;

	@Override
	public Institute findByInstituteCode (String instituteCode) {
		return instituteRepository.findByInstituteCode(instituteCode);
	}

	@Override
	public Institute findByInstituteName (String instituteName) {
		return instituteRepository.findByInstituteName(instituteName);
	}

	@Override
	public void saveInstitute (Institute institute) {
		instituteRepository.save(institute);
	}

	@Override
	public List<Institute> findAllInstitute () {
		return instituteRepository.findAll();
	}
	@Override
	public List<InstituteNameOnly> findAllInstituteName(){
		return instituteRepository.findAllProjectedBy();
	}

	@Override
	public boolean isInstituteExist (Institute institute) {
		return findByInstituteName(institute.getInstituteName()) != null;
	}

	@Override
	public GrntdAmtYm findByYearAndMonth (String year, String month) {
		return grntdAmtYmRepository.findByYearAndMonth(year, month);
	}

	/*@Override
	public GrntdAmtYm findByYearAndMonthAndInstitute_code (String year, String month, String institute_code) {
		return grntdAmtYmRepository.findByYearAndMonthAndInstitute_code(year,month,institute_code);
	}*/

	@Override
	public void saveGrntdAmtYm (GrntdAmtYm grntdAmtYm) {
		grntdAmtYmRepository.save(grntdAmtYm);
	}

	@Override
	public List<GrntdAmtYm> findAllGrntdAmtYm () {
		return grntdAmtYmRepository.findAll();
	}
}
