package com.example.mybatispractice.mybatispractice;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class MybatispracticeApplicationTests {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	void contextLoads() {
	}

	@Test
	void connectTestWithMyBatis() {
		try (Connection con = sqlSessionFactory.openSession().getConnection()) {
			System.out.println("Success connection with mybatis!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
