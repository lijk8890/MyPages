package cn.com.infosec.mypages;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.com.infosec.mypages.mapper")
public class MyPagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPagesApplication.class, args);
	}

}
