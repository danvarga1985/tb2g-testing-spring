package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HelloWordProducer implements  WordProducer{
    @Override
    public String getWord() {
        return "Hello";
    }
}
