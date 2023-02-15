package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * Application Context가 구성된(로딩,설정) 이후, 
 * 실행할 코드(Application Context환경에 의존적: Bean사용 등)가 있는 경우
 * ApplicationRunner 인터페이스의 구현 클래스 빈(HelloWorldRunner) 사용하기
 */
@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
		}
	}
}
