package cn.medsci.paas;


import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableServiceComb
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MedsciDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MedsciDemoApplication.class, args);
	}
}
