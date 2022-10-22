package br.com.blog.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
					.info(new Info()
						.title("Projeto My - Blog")
						.description("Projeto Blog Pessoal")
						.version("v0.0.1")
					.license(new License()
						.name("Digital House")
						.url("https://www.digitalhouse.com/br"))
					.contact(new Contact()
						.name("Conteudo Digital House")
						.url("https://github.com/Jefferson-Itajahy")
						.email("itajahy@gmail.com")))
					.externalDocs(new ExternalDocumentation()
						.description("Github")
						.url("https://github.com/Jefferson-Itajahy"));
	}
}
