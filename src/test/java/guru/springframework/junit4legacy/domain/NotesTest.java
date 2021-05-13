package guru.springframework.junit4legacy.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* JUnit 4 import org.junit.Before;
import org.junit.Test; */

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotesTest {

    // @Before JUnit4
    @BeforeEach
    void setUp() {
    }

    @Test
    void getId() {
        assertEquals(3, 3);
    }
}
