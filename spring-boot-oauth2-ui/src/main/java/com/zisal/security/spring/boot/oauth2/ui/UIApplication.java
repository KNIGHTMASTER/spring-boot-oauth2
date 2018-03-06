package com.zisal.security.spring.boot.oauth2.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

/**
 * Created on Mar 6, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
public class UIApplication {

    public static void main(String [] args) {
        SpringApplication.run(UIApplication.class);
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
