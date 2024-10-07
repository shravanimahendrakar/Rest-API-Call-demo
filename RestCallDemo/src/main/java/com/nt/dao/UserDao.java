package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.entity.User;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate template;
	
	public void save(User u) {
		Object[] args = {u.getId(),u.getName(),u.getSalary()};
		template.update("insert into emp values(?,?,?)",args);
		System.out.println("saved");
	}
}
