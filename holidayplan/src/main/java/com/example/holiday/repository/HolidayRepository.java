package com.example.holiday.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.holiday.model.Holiday;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Long>{

	
}
