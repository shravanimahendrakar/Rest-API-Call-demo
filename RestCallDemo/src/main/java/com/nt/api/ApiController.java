package com.nt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dao.UserDao;
import com.nt.entity.User;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private UserDao dao;

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public User getUserData(@RequestBody User u) {
		System.out.println(u.getName());		
		dao.save(u);
		return u;
	}
}