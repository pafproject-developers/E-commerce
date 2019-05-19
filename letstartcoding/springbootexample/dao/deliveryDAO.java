package com.letstartcoding.springbootexample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.letstartcoding.springbootexample.model.delivery;

@Service
public class deliveryDAO implements deliveyDAO {
	
	
	JdbcTemplate template;  
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	
	
	public void save(delivery p) {
		
//String sql="insert into world.student(firstName,lastName,sex,dob,email,section,country,firstAttempt,subjects) values('"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getSex()+"','"+p.getDob()+"','"+p.getEmail()+"','"+p.isFirstAttempt()+"','"+p.getCountry()+"',true,'"+convertListToDelimitedString(p.getSubjects())+"')"; 
		
		String sql="insert into delivey() values()";
		System.out.println(sql);
	     template.update(sql);  
	}
	
	private String convertListToDelimitedString(List<String> list) {

		String result = "";
		if (list != null) {
			result = StringUtils.arrayToCommaDelimitedString(list.toArray());
		}
		return result;

	}
	
	public List<delivery> getAllStudents() {
		
		
		return template.query("select * from deliivey",new ResultSetExtractor<List<delivery>>(){  
		    
		     public List<delivery> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<delivery> list=new ArrayList<delivery>();  
		        while(rs.next()){  
		        delivery e=new delivery();  
		        e.setId(rs.getInt(1));  
		        e.setFirstName(rs.getString(2));  
		        e.setLastName(rs.getString(3));  
		        e.setEmail(rs.getString(6));
		        e.setSection(rs.getString(7));  
		        e.setCountry(rs.getString(8));  
		        
		        e.setSubjects(convertDelimitedStringToList(rs.getString(10)));
		        
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  
		
		  }
	
	public List<delivery> getStudentsByPage(int pageid, int total) {
		// TODO Auto-generated method stub
		 String sql="select * from  "+(pageid-1)+","+total;  
		 return template.query(sql,new ResultSetExtractor<List<delivery>>(){  
		    
		     public List<delivery> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<delivery> list=new ArrayList<delivery>();  
		        
		        while(rs.next()){  
		        delivery e=new delivery();  
		        e.setId(rs.getInt(1));  
		        e.setFirstName(rs.getString(2));  
		        e.setLastName(rs.getString(3));  
		        e.setEmail(rs.getString(6));
		        e.setSection(rs.getString(7));  
		        e.setCountry(rs.getString(8));  
		        e.setFirstAttempt(rs.getBoolean(9));
		        e.setSubjects(convertDelimitedStringToList(rs.getString(10)));
		        
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }
	
	public delivery getStudentById(int id) {
		// TODO Auto-generated method stub
				 return template.query("select * from student where ID="+id,new ResultSetExtractor<delivery>(){  
					    
				     public delivery extractData(ResultSet rs) throws SQLException,  
				            DataAccessException {  
				      
				    	 delivery e=new delivery();  
				        while(rs.next()){  
				       
				        	e.setId(rs.getInt(1));  
					        e.setFirstName(rs.getString(2));  
					        e.setLastName(rs.getString(3));  
					        e.setEmail(rs.getString(6));
					        e.setSection(rs.getString(7));  
					        e.setCountry(rs.getString(8));  
					        e.setFirstAttempt(rs.getBoolean(9));
					        e.setSubjects(convertDelimitedStringToList(rs.getString(10)));     
				        }  
				        return e;  
				        }  
				    });  
			}
	
	private static List<String> convertDelimitedStringToList(String delimitedString) {

		List<String> result = new ArrayList<String>();

		if (!StringUtils.isEmpty(delimitedString)) {
			result = Arrays.asList(StringUtils.delimitedListToStringArray(delimitedString, ","));
		}
		return result;

	}
	
	public String ConvertDate(Date date){
		
		
		   
		  
		 String formatedDate ="";
	    try {
	    	DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
			date = (Date)formatter.parse(date.toString());
			 Calendar cal = Calendar.getInstance();
			   
			    cal.setTime(date);
			    
			    formatedDate=cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH) + 1)+"-"+cal.get(Calendar.DATE);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    
	    return formatedDate;

	   
	  }



	public int count() {
		String sql="select count(*) from delivery";
		int count = template.queryForObject(sql,Integer.class);
		return count;
		  }



	public void update(delivery p) {
		String sql="update delivery set firstName='"+p.getFirstName()+"',lastName='"+p.getLastName()+"',sex='"+p.getSex()+"',dob='"+ConvertDate(p.getDob())+"',email='"+p.getEmail()+"',section='"+p.getSection()+"' ,country='"+p.getCountry()+"', firstAttempt="+p.isFirstAttempt()+",subjects='"+convertListToDelimitedString(p.getSubjects())+"' where ID="+p.getId()+"";
		System.out.println(sql);
       template.update(sql);  
	}



	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from delivery where ID="+id+"";  
	    template.update(sql);  
		
	}



	public void delete() {
		// TODO Auto-generated method stub
		String sql="delete from delivey where ID>0";  
	    template.update(sql); 
	}



	

	

}
