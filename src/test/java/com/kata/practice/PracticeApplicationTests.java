package com.kata.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class PracticeApplicationTests {

    @Test
    void testHelloWorld() {
        PracticeApplication practiceApplication = new PracticeApplication();
        assert practiceApplication.getText().equals("Hello world!");
    }

}
