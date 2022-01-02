package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile({"dev","qa"})
//--spring.profiles.active=dev
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))//starter path like com
				/**
				 * RestController class level path
				 * . means single character and * means more characters..
				 */
				.paths(PathSelectors.regex("/.*")) 
				/**
				 * Disabling defualt Response messages
				 * 401	:    Unauthorized
				 * 403	:    Forbidden
				 * 404	:    Not Found
				 */
				.build().useDefaultResponseMessages(false)
				//meta data
				.apiInfo(apiInfo())
				;
	}
	/**
	 * Meta data,
	 * only display content 
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"TestApp", //title
				"Testing for URLs", //Description 
				"swagger 3.0", //version
				"https://github.com/karrasankar158 ", // Service URL
				contactInfo(),  //contact
				"own", //  license
				"https://github.com/karrasankar158", // License URL
				expressionInfo()); // Vendor Expressions
	}

	//Contact info
	private Contact contactInfo() {
		return new Contact("sankar","https://github.com/karrasankar158","sankar@gmail");
	}

	
	// expression
	@SuppressWarnings("rawtypes")
	private List<VendorExtension> expressionInfo() {
		ArrayList<VendorExtension> list=new ArrayList<VendorExtension>();
		list.toString();
		return list;
	}

}
