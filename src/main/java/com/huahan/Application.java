package com.huahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application {
	//跨域问题 https://blog.csdn.net/y532798113/article/details/83068485
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
					.allowedOrigins("*") //可访问ip，ip最好从配置文件中获取，
					.allowedMethods("PUT", "DELETE","GET","POST")
					.allowedHeaders("*")
					.exposedHeaders("access-control-allow-headers",
							"access-control-allow-methods",
							"access-control-allow-origin",
							"access-control-max-age",
							"X-Frame-Options")
					.allowCredentials(false).maxAge(3600);
				}
			};
		}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

