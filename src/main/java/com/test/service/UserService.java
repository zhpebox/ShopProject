package com.test.service;

import org.springframework.stereotype.Service;

import com.test.model.User;

@Service
public interface UserService {

	public int insertUser(User user);
}
