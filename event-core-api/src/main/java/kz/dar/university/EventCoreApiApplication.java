package kz.dar.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EventCoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventCoreApiApplication.class, args);
	}

}
