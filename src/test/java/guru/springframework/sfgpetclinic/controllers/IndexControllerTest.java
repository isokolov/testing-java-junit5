package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index(), "Successful");
        assertNotEquals("index2", indexController.index(), () ->
                "For this input the method execution fails");
    }

    @Test
    void oupsHandler() {
        assertEquals("notimplemented", indexController.oupsHandler());
        assertTrue("notimplemented".equals(indexController.oupsHandler()), () -> "This is some expensive " +
                "Message to build" +
                "for my test");
    }
}
