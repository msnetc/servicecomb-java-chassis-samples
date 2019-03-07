package cn.medsci.paas;


import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class PrivilegeAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrivilegeAuthApplication.class, args);
	}
}
