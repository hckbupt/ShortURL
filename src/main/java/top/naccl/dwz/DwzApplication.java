package top.naccl.dwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DwzApplication {

	//测试
	public static void main(String[] args) {
		SpringApplication.run(DwzApplication.class, args);
	}

}
