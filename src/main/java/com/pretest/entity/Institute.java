package com.pretest.entity;

import javax.persistence.*;

@Entity
@Table(name = "INSTITUTE")
public class Institute {
	@Id
	@Column(name = "INSTITUTE_CODE")
	private String instituteCode;

	@Column(name = "INSTITUTE_NAME")
	private String instituteName;

	public String getInstituteCode () {
		return this.instituteCode;
	}

	public void setInstituteCode (String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getInstituteName () {
		return instituteName;
	}

	public void setInstituteName (String instituteName) {
		this.instituteName = instituteName;
	}

	public Institute () {
	}

	public Institute (String instituteCode, String instituteName) {
		this.instituteCode = instituteCode;
		this.instituteName = instituteName;
	}

	@Override
	public String toString () {
		return "Institute{" +
				"institute_code='" + instituteCode + '\'' +
				", institute_name='" + instituteName + '\'' +
				'}';
	}
}
