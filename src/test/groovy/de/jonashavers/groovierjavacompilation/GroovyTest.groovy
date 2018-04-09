package de.jonashavers.groovierjavacompilation

class GroovyTest extends GroovyTestCase {

    void testAccessToGroovy() {
        PlainGroovy plainGroovy = new PlainGroovy()
        assertEquals 'groovy', plainGroovy.language
    }

    void testAccessToGroovyFromJava() {
        JavaExtendingGroovy groovyFromJava = new JavaExtendingGroovy()
        assertEquals 'groovy', groovyFromJava.language
    }
}
