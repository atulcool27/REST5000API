package com.task.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.dao.MyNumber;
import com.task.repo.MyNumberRepo;
import com.task.service.MyNumberService;

@Service
public class MyNumberServiceImpl implements MyNumberService{

	@Autowired
	MyNumberRepo repo;
	
	
	
	@Override
	public MyNumber insertNumber(MyNumber mynum) {
		return repo.save(mynum);
	}
	
	@Override
	public int getNumber(int index) {
		return repo.findById(index).getValue();
	}
	
	
	@Transactional
	@Override
	public synchronized int incrementNumber(int index) {
		
		if(!isTableNotEmpty())
		{
			MyNumber mynum = new MyNumber();
			mynum.setId(1);
			mynum.setValue(0);
			insertNumber(mynum);
		}
		
		int value = getNumber(index);
		++value;
		repo.updateValue(index, value);
		
		return value;
		
		
	}
	
	
	@Override
	public boolean isTableNotEmpty() {
		if(repo.findAll().size() >0) 
		{
			return true;
		}
		return false;
	}


}
