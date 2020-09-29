package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    HelloWordProducer helloWordProducer() {
        return new HelloWordProducer();
    }
}
