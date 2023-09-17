package me.sasikirannallapu.movies;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Define the URL patterns to which CORS should apply
                .allowedOrigins("http://localhost:3000") // Specify your allowed origins here
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Define allowed HTTP methods
                .allowedHeaders("*"); // Define allowed headers
    }
}
