package org.tnsif.springweb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;




@SpringBootApplication

public class PlacementManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementApplication.class, args);
	}

}
