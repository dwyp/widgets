package com.kata.practice;

import org.junit.jupiter.api.Test;

class PracticeApplicationTests {

    @Test
    void testHelloWorld() {
        PracticeApplication practiceApplication = new PracticeApplication();
        assert practiceApplication.getText().equals("Hello world!");
    }

}
