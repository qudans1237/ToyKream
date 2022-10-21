package com.toykream.service.user.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.toykream.service.domain.User;
import com.toykream.service.user.UserService;




@RunWith(SpringJUnit4ClassRunner.class)
//==> Meta-Data 를 다양하게 Wiring 하자...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration(locations = { "classpath:config/context-common.xml", "classpath:config/context-aspect.xml",
		"classpath:config/context-mybatis.xml", "classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class UserServiceTest {

 //==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Test
	public void testAddUser() throws Exception {
		User user = new User();
		
		user.setUserEmail("test@test.com");
		user.setPassword("testtest");
		user.setSizeId(1);
		user.setUserName(null);
		
		System.out.println("addUserTest : "+user);
		userService.addUser(user);
		String userEmail = user.getUserEmail();
		Assert.assertEquals("test@test.com", userEmail);
		
	}
}
