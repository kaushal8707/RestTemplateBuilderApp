package com.always.learner.RestTemplateBuilderApp;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

import java.time.Duration;

@Configuration
public class Config
{
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder)
    {
        UriTemplateHandler uriTemplateHandler=new RootUriTemplateHandler("http://localhost:8083/springDataDemo");
        return restTemplateBuilder
                .uriTemplateHandler(uriTemplateHandler)
                .setReadTimeout(Duration.ofMillis(1000))
                .build();
    }
}
