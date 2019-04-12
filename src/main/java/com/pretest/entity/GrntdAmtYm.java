package com.pretest.entity;
import javax.persistence.*;

@Entity
@Table(name = "GRNTD_AMT_YM")
public class GrntdAmtYm {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "YEAR")
	private String year;
	@Column(name = "MONTH")
	private String month;

	@OneToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private Institute institute;

	@Column(name = "GRNTD_AMT")
	private Integer grntd_amt;

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	public String getYear () {
		return year;
	}

	public void setYear (String year) {
		this.year = year;
	}

	public String getMonth () {
		return month;
	}

	public void setMonth (String month) {
		this.month = month;
	}

	public Institute getInstitute () {
		return institute;
	}

	public void setInstitute (Institute institute) {
		this.institute = institute;
	}

	public Integer getGrntd_amt () {
		return grntd_amt;
	}

	public void setGrntd_amt (Integer grntd_amt) {
		this.grntd_amt = grntd_amt;
	}

	public GrntdAmtYm () {
	}

	public GrntdAmtYm (String year, String month, Institute institute, Integer grntd_amt) {
		this.year = year;
		this.month = month;
		this.institute = institute;
		this.grntd_amt = grntd_amt;
	}


}
