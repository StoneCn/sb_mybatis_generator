package com.stone.sb_mybatis_test2;

import com.stone.mapper.UserMapper;
import com.stone.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbMybatisTest2ApplicationTests {


	@Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {

		List<User> users = userMapper.selectAll();
		System.out.println(users);
	}

}
