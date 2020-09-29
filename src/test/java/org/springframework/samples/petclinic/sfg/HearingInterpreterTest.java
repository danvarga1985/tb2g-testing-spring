package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Can use just one annotation as opposed to two (commented out)
@SpringJUnitConfig(classes = {BaseConfig.class, HelloConfig.class})
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {BaseConfig.class, HelloConfig.class})
class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("Hello", word);
    }
}
