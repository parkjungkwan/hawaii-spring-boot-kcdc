package com.parksrazor.web.user;

import java.util.List;

public interface UserService {

	public List<User> findAll();

	public User findOne(String userid);

}
