package junittest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import service.TestService;

//test只能读取src/test/resources下的配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:*.xml", "classpath*:spring/*.xml", "classpath*:META-INF/spring/*.xml" })
@WebAppConfiguration
public class BaseTest {
	@Autowired
	TestService t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("base test is runing");
	}

	@Test
	public void testTest1() {
		// fail("Not yet implemented");
		t.test1();
		System.out.println("bb!!");
	}

}
