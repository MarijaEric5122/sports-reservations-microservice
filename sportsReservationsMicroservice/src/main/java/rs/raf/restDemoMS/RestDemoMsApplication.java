package rs.raf.restDemoMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestDemoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoMsApplication.class, args);
	}

}
