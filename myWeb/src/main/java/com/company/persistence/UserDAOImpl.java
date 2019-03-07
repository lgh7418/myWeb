package com.company.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.company.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "mappers.userMapper";
	
	@Override
	public String regdate() {
		return sqlSession.selectOne(namespace + ".regdate"); 
	}

	@Override
	public void insertUser(UserVO vo) {
		sqlSession.insert(namespace + ".insertUser", vo);
	}

	@Override
	public UserVO readUser(String id) throws Exception {
		UserVO vo = (UserVO) sqlSession.selectOne(namespace + ".selectUser", id);
		return vo;
	}

	@Override
	public UserVO readWithPw(String id, String pw) throws Exception {
		Map<String, String> params = new HashMap<>();
		UserVO vo = (UserVO) sqlSession.selectOne(namespace + ".selectUser", params);		
		return vo;
	}
	
	
}
