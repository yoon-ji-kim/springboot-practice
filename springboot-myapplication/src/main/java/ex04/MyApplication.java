package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*
 * SpringBootApplication 메타 어노테이션
 * 
 * + @SpringBootConfiguration  		참고 ex01, 02
 * + @ComponentScan :하부 패키지 스캔   참고 ex03, ex04
 * + @EnableAutoConfiguration : 
 * 		1. MVC, AOP, Security, JPA 등을 자동으로 설정한다.
 * 		--> 자동: default 설정
 * 		2. 발견된 Starter Dependency(Library) 기반으로 설정핟.
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
		}
	}
}
