package guru.springframework.junit4legacy.controllers;

/*
JUnit4 import org.junit.Before;
import org.junit.Test; */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    // @Before JUnit4
    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void getIndexPage() {
    }
}
