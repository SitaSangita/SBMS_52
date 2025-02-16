package in.sita.sangita.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	  @Bean
	    public GroupedOpenApi userApi() {
	        return GroupedOpenApi.builder()
	                .group("MsgRestContr") // Define a group
	                .pathsToMatch("/api/v1/users/**") // Include specific paths
	                .build();
	    }

	    @Bean
	    public GroupedOpenApi adminApi() {
	        return GroupedOpenApi.builder()
	                .group("Admin API")
	                .pathsToMatch("/api/v1/admin/**")
	                .pathsToExclude("/api/v1/internal/**") // Exclude certain paths
	                .build();
	    }
	
	@Bean
	public OpenAPI createSwaggerPage() {
		return new OpenAPI().info(new Info()
				.title("Rest Controller")
				.description("Book RestController")
				.contact(new Contact()
						.email("sethasangita33@gmail.com")
						.name("Sangita")
						.url("https://www.ashokit.in")
						)
				);
				
	}

}
