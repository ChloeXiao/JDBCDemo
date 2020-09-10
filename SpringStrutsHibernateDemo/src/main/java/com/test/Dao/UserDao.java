package com.test.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.Model.Users;

public interface UserDao {

	public List<Users> selectUser(int id, String pass);

	public Boolean insertUser(Users user);

	public Boolean checkAccount(int acc);
	
	public String selectEmailByAcc(int acc);
	

}
