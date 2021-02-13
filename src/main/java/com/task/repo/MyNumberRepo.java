package com.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.task.dao.MyNumber;

public interface MyNumberRepo extends JpaRepository<MyNumber, Integer>{
	
	
	public MyNumber findById(int id);
	
	
	@Modifying
	@Query("Update MyNumber t set t.value=:value where t.id=:id")
	public void updateValue(@Param("id") int id, @Param("value") int value);

}
