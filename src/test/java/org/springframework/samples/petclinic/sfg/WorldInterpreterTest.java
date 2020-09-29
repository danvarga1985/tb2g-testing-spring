package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Can use just one annotation as opposed to two (commented out)
@SpringJUnitConfig(classes = {BaseConfig.class, WorldConfig.class})
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {BaseConfig.class, WorldConfig.class})
class WorldInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("World", word);
    }
}
