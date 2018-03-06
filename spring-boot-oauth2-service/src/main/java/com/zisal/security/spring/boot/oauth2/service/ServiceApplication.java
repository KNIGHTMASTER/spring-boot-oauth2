package com.zisal.security.spring.boot.oauth2.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created on Mar 6, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableResourceServer
public class ServiceApplication {

    public static void main(String [] args) {
        SpringApplication.run(ServiceApplication.class);
    }
}
