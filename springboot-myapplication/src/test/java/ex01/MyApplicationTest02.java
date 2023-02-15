package ex01;
/*
 * Spring Boot Test Integration
 * 
 * error : Spring Boot Integration(@SpringBootTest)에서는
 * @Configuration을 달고 있는 설정 클래스를 자동스캔하지 못한다.
 * 
 */

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
