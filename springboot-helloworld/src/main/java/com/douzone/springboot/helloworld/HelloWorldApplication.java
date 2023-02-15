package com.douzone.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 *  1. 스프링 애플리케이션의 부트스트래핑 역할을 하는 클래스 : Bootstrapping Class
 *  2. 설정 클래스 역할 : Configuration Class
 *  
 */
@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		/*
		 * SpinrgApplication.run(...) 안에서 일어나는 일(BootStrap)
		 * 
		 *  1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 *  2. 만약, 웹 애플리케이션이라면 웹어플리케이션 타입을 결정(SpringMVC 또는 Reactive)
		 *  3. 어노테이션 스캐닝(Auto) + Configuration Class를 통한
		 *  	빈 생성, 등록, 와이어링 작업
		 *  4. 만약 웹 애플리케이션이고 type이 Spring Mvc 이면
		 *  - 내장(embedd) 서버(TomcatEmbededServiceServletContainer)에 웹 애플리케이션 배포
		 *  - 서버 인스턴스에 웹 애플리케이션 배포
		 *   - 서버 인스턴스 실행
		 *  5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행
		 */
//		ConfigurableApplicationContext ac =null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);			
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		//try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
	}

}
