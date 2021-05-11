package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", indexController.index(), "Successful");
        assertNotEquals("index2", indexController.index(), () ->
                "For this input the method execution fails");
    }

    @DisplayName("Test exception")
    @Test
    void oupsHandler() {
        assertEquals("notimplemented", indexController.oupsHandler());
        assertTrue("notimplemented".equals(indexController.oupsHandler()), () -> "This is some expensive " +
                "Message to build" +
                "for my test");
    }

    @Test
    @DisplayName("Test throws exception")
    void oupsHandler2() {
        assertThrows(RuntimeException.class, () -> {
            indexController.oopsHandler2();
        });
    }

    @Test
    void testAssumptionTrue() {

        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueAssumptionIsTrue() {

        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }
}
