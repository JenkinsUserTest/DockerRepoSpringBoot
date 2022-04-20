package com.synechron.service;

import com.synechron.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);

}
