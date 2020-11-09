package se.iths;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CalculatorTest {

        // counter to keep track on which the tests
        int i = 0;

       @BeforeAll
        void beforeAllTest() {
            System.out.println("Testing starts");
        }

        @BeforeEach
        void beforeEachTest(){
            i++;
            System.out.println("Test number " + i + " starts");
        }

        @AfterEach
        void afterEachTest(){
            System.out.println("Test number " + i + " done");
        }


        @DisplayName("Test of method addition from class Calculator")
        @Test
        void testAddition () {
            Calculator calculator = new Calculator();
            assertEquals(100, calculator.addition(50, 50));
        }

        @DisplayName("Test of method subtraction from class Calculator")
        @Test
        @Disabled("Test not necessary anymore")
        void testSubtraction () {
            Calculator calculator = new Calculator();
            assertEquals(100, calculator.subtraction(150, 50));
        }

        @DisplayName("Test of method subtraction from class Calculator")
        @Test
        void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(2,2);
        assertTrue(result == 4);
        }

        @DisplayName("Test of method division from class Calculator")
        @RepeatedTest(5)
        void testDivisions() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator.division(10, 10));
        }

        @AfterAll
        void afterAllTest() {
        System.out.println("Testing finished");
        }

    }