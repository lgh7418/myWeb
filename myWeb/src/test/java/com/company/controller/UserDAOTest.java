package com.company.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.domain.UserVO;
import com.company.persistence.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDAOTest {
	@Inject
	private UserDAO dao;
	
	@Test
	public void testInsertUser() throws Exception {
		UserVO temp = new UserVO();
		temp.setId("spring77");
		temp.setPw("1234");
		temp.setName("홍길동");
		temp.setNickname("곰돌이");
		temp.setAddress("부산진구 양정동");
		temp.setHp("010-1111-1111");
		temp.setRegdate(dao.regdate());
		dao.insertUser(temp);
	}
	
	@Test
	public void testReadUser() throws Exception {
		UserVO temp = dao.readUser("spring");
	}
	
	@Test
	public void testReadWithPW() throws Exception {
		UserVO temp = dao.readWithPw("spring", "1234");
	}
}
