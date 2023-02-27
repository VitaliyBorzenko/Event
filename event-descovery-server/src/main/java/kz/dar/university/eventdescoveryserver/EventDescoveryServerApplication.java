package kz.dar.university.eventdescoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EventDescoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventDescoveryServerApplication.class, args);
	}

}
