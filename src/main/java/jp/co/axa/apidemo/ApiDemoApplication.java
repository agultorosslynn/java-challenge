package jp.co.axa.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * API Demo main class
 * 
 * @author ALJ Devops
 * @version 1.0
 */
@EnableSwagger2
@SpringBootApplication
public class ApiDemoApplication {

	/**
	 * Main method
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

}
