package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloConfig {

    @Bean
    @Primary
    HelloWordProducer helloWordProducer() {
        return new HelloWordProducer();
    }
}
