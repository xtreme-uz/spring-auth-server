package uz.xtreme.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .securityMatcher("/resource/**")
                .authorizeHttpRequests()
                .requestMatchers("/resource/**").hasAuthority("SCOPE_resource.read")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

}
