package com.stone.sb_mybatis_test2;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stone.mapper.DeptMapper;
import com.stone.mapper.UserMapper;
import com.stone.model.Dept;
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

	@Autowired
	DeptMapper deptMapper;
	@Test
	public void contextLoads() {

		List<User> users = userMapper.selectAll();
		System.out.println(users);
	}

	@Test
	public void test(){
		//1、设置分页信息，包括当前页数和每页显示的总计数
		PageHelper.startPage(1, 5);
		List<Dept> depts = deptMapper.selectAll();
		PageInfo<Dept> deptPageInfo = new PageInfo<>(depts);
		System.out.println("deptPageInfo: "+deptPageInfo);
	}
}
