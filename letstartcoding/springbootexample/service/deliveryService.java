package com.letstartcoding.springbootexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letstartcoding.springbootexample.dao.deliveryDAO;
import com.letstartcoding.springbootexample.model.delivery;

@Service
public class deliveryService implements deliveyService {

	@Autowired
    deliveryDAO studentDao;
	
	public void save(delivery student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
		
	}

	public List<delivery> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}
	
	public List<delivery> getStudentsByPage(int pageid, int total)
	{
		return studentDao.getStudentsByPage(pageid,total);
	}

	public int count() {
		// TODO Auto-generated method stub
		return studentDao.count();
	}

	public delivery getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(id);
	}

	public void update(delivery emp) {
		// TODO Auto-generated method stub
		 studentDao.update(emp);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDao.delete(id);
	}

	public void delete() {
		// TODO Auto-generated method stub
		studentDao.delete();
	}

	

}
