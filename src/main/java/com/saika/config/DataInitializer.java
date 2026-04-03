package com.saika.config;

import com.saika.service.LoginService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public ApplicationRunner applicationRunner(LoginService loginService) {
        return args -> loginService.createDefaultAdminIfMissing();
    }
}
