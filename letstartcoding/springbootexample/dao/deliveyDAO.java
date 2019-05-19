package com.letstartcoding.springbootexample.dao;

import java.util.List;

import com.letstartcoding.springbootexample.model.delivery;

public interface deliveyDAO {
	
	public void save(delivery p);
	public List<delivery> getAllStudents();
	public List<delivery> getStudentsByPage(int pageid, int total);
	public delivery getStudentById(int id);
	public int count() ;
	public void update(delivery p);
	public void delete(int id);
	public void delete();

}
