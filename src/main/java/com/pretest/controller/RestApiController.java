package com.pretest.controller;

import com.pretest.entity.GrntdAmtYm;
import com.pretest.entity.Institute;
import com.pretest.entity.InstituteNameOnly;
import com.pretest.service.InstituteGrntdAmtYmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class RestApiController {

	@Autowired
	InstituteGrntdAmtYmService instituteGrntdAmtYmService;

	@RequestMapping("/")
	public String index() {

		Institute ins = new Institute("001","신한은행");
		instituteGrntdAmtYmService.saveInstitute(ins);

		GrntdAmtYm grnt = new GrntdAmtYm("2019","01",ins,12);
		instituteGrntdAmtYmService.saveGrntdAmtYm(grnt);

		ins = new Institute("002","국민은행");
		instituteGrntdAmtYmService.saveInstitute(ins);

		grnt = new GrntdAmtYm("2019","01",ins,52);
		instituteGrntdAmtYmService.saveGrntdAmtYm(grnt);

		return "PreTest API test!";
	}

	@RequestMapping(value = "/institute/", method = RequestMethod.GET)
	public ResponseEntity<List<InstituteNameOnly>> listAllInstitute () {
		List<InstituteNameOnly> institute = instituteGrntdAmtYmService.findAllInstituteName();
		if ( institute.isEmpty() ) {
			return new ResponseEntity<List<InstituteNameOnly>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<InstituteNameOnly>>(institute, HttpStatus.OK);
	}
}