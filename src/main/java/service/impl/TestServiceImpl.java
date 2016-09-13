package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.TestService;
import dao.TestDao;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;

	@Override
	public void test1() {
		testDao.test1();
	}

}
