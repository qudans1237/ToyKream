package com.toykream.service.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.toykream.service.domain.User;
import com.toykream.service.user.UserDao;


@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	//field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//Constructor
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addUser(User user) throws Exception {
		System.out.println("userDaoImpl SqlSession 가기전 user: "+ user);
		sqlSession.insert("UserMapper.addUser", user);
	}
}