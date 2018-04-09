package de.jonashavers.groovierjavacompilation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaTest {

    @Test
    public void testAccessToGroovy() {
        PlainGroovy plainGroovy = new PlainGroovy();
        assertEquals("groovy", plainGroovy.getLanguage());
    }

    @Test
    public void testAccessToGroovyFromJava() {
        JavaExtendingGroovy groovyFromJava = new JavaExtendingGroovy();
        assertEquals("groovy", groovyFromJava.getLanguage());
    }
}
