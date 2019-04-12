package com.pretest.repository;

import com.pretest.entity.GrntdAmtYm;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GrntdAmtYmRepository extends JpaRepository<GrntdAmtYm, Long> {

	GrntdAmtYm findByYearAndMonth(String year, String month);
}
