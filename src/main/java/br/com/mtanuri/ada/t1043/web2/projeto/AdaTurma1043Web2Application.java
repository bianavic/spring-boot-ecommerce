package br.com.mtanuri.ada.t1043.web2.projeto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info=@Info(title="Ecommerce API Documentation"))
public class AdaTurma1043Web2Application {

	public static void main(String[] args) {
		SpringApplication.run(AdaTurma1043Web2Application.class, args);
	}

}
