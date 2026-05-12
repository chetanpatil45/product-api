package com.product_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI myCustomConfig(){
        return new OpenAPI()
                .info(
                        new Info().title("Product Management API's")
                                .description("Product creation, updation, deletion")
                ).tags(
                        new ArrayList<>(
                                Arrays.asList(new Tag().name("Product").description("Product related API's - CREATE, READ, UPDATE, DELETE"))
                        )
                );
    }
}
