package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("world")
public class WorldWordProducer implements WordProducer {
    @Override
    public String getWord() {
        return "World";
    }
}
