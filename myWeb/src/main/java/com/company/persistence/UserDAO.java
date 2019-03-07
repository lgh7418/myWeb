package com.company.persistence;

import com.company.domain.UserVO;

public interface UserDAO {
	public String regdate();
	
	public void insertUser(UserVO vo);
	
	public UserVO readUser(String id) throws Exception;
	public UserVO readWithPw(String id, String pw) throws Exception;
}
