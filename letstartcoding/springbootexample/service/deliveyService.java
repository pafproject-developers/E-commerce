package com.letstartcoding.springbootexample.service;

import java.util.List;

import com.letstartcoding.springbootexample.model.delivery;

public interface deliveyService {
	
	public void save(delivery student);
	public List<delivery> getAllStudents();
	public List<delivery> getStudentsByPage(int pageid, int total);
	public delivery getStudentById(int id);
	public int count() ;
	public void update(delivery p);
	public void delete(int id);
	public void delete();

}
