package com.mon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class BeanConfig {
    private ClientRegistration clientRegistration(){
        return CommonOAuth2Provider.GITHUB
                .getBuilder("github")
                .clientId("f6079632912ec67e133c")
                .clientSecret("d6f2ba93f9962c9d11e62d32736f0353bf9c6c4b")
                .build();
    }

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository(){
        var clientRegistration = clientRegistration();
        return new InMemoryClientRegistrationRepository(clientRegistration);
    }
}
