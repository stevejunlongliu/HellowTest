package dao.impl;

import org.springframework.stereotype.Repository;

import dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao {

	@Override
	public void test1() {
		System.out.println("this test1 function");
	}

}
