package com.task.service;
import com.task.dao.MyNumber;

public interface MyNumberService {
	
	public int incrementNumber(int index);
	
	public int getNumber(int index);
	
	public boolean isTableNotEmpty();
	
	public MyNumber insertNumber(MyNumber mynum);

}
