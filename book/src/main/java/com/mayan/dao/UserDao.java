package com.mayan.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.mayan.entity.User;

@Repository
public interface UserDao {

	public User getUser(@Param("userName")String userName,@Param("password")String password);
	public void updateInfoByID(User user);
	public void deleteByID(@Param("userID")int userID);
	public void upUserByID(@Param("userID")int userID);
	public void downUserByID(@Param("userID")int userID);
	public User getUserByName(String userName);
}
