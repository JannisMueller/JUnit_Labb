package se.iths;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CalculatorTest  {

        // counter to keep track on which the tests
        int i = 0;

       @BeforeAll
        void beforeAllTest() {
            System.out.println("Testing starts...");
        }

        @BeforeEach
        void beforeEachTest(TestInfo testInfo){
            i++;
            System.out.println("Test number " + i + ": "
            + testInfo.getDisplayName());
            System.out.println("Method " + testInfo.getTestMethod() + " was tested!");
        }

        @AfterEach
        void afterEachTest(TestInfo testInfo){
            System.out.println(testInfo.getDisplayName() + " done!");
        }

        @DisplayName("Test of method addition from class Calculator")
        @ParameterizedTest
        @ValueSource(ints = {50,100,200})
        @Order(3)
        void testAddition (int number) {
            Calculator calculator = new Calculator();
            assertEquals(50 + number, calculator.addition(50, number));
        }

        @DisplayName("Test of method subtraction from class Calculator")
        @Test
        @Disabled("Test not necessary anymore")
        @Order(4)
        void testSubtraction () {
            Calculator calculator = new Calculator();
            assertNotEquals(75, calculator.subtraction(150, 50));
        }

        @DisplayName("Test of method subtraction from class Calculator")
        @Test
        @Order(1)
        void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(2,2);
        assertTrue(result == 4);
        }

        @DisplayName("Test of method division from class Calculator")
        @RepeatedTest(5)
        @Order(2)
        void testDivisions() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator.division(10, 10));
        }

        @AfterAll
        void afterAllTest() {
        System.out.println("Testing finished");
        }

    }