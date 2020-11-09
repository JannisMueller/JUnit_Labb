package se.iths;

import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CalculatorTest {

       @BeforeAll
        void beforeAllTest() {
            System.out.println("Testing starts");
        }

        @DisplayName("Test of method addition from class Calculator")
        @Test
        void testAddition () {
            Calculator calculator = new Calculator();
            assertEquals(100, calculator.addition(50, 50));
        }

        @DisplayName("Test of method subtraction from class Calculator")
        @Test
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
        @Test
        void testDivisions() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator.division(10, 10));
        }

        @AfterAll
        void afterAllTest() {
        System.out.println("Testing finished");
        }

    }