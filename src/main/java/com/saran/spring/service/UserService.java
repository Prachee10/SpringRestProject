package com.saran.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saran.spring.model.User;

@Service
public interface UserService {
	User findById(long id);
	User findByName(String name);
	void saveUser(User user);
	void updateUser(User user);
	void deleteUserById(long id);
	List<User> findAllUsers();
	void deleteAllUsers();
	public boolean isUserExist(User user);

}
