package br.com.mtanuri.ada.t1043.web2.projeto.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(
                new Info().title("Fake API Product Service")
                        .description("API to fetch fake data for a given product")
                        .version("v0.0.1")
                        .contact(contactDetails()));
    }

    public Contact contactDetails() {
        return new Contact().name("sala-3");
    }

}
