package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class TextProcessorTest {

    @BeforeAll
    void beforeAllTest(TestInfo testInfo){
        System.out.println("Start testing... " +
                testInfo.getDisplayName());
    }

    @BeforeEach
    void beforeEachTest (TestInfo testInfo) {
        System.out.println("Start " + testInfo.getDisplayName());
    }

    @AfterEach
    void afterEachTest(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " finished" );
            System.out.println("Method " + testInfo.getTestMethod() + " was tested!");
        }

    @DisplayName("Test of method stringToUppercase from class TextProcessor")
    @RepeatedTest(2)
    @Order(3)
    void testStringToUppercase(){
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("JANNIS", textProcessor.stringToUppercase("jannis"));
    }
    @DisplayName("Test of method stringToLowercase from class TextProcessor")
    @Test
    @Order(1)
    void testStringToLowercase(){
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor.stringToLowercase("JANNIS"));
    }

    @DisplayName("Test of method stringReverse from class TextProcessor")
    @Test
    @Order(2)
    void testStringReverse(){
        TextProcessor textProcessor = new TextProcessor();
        assertFalse(textProcessor.stringReverse("jannis").equals("jannis"));
    }

    @Disabled
    @DisplayName("Additional test of method stringReverse from class TextProcessor")
    @Test
    @Order(4)
    void testStringReverseAssert(){
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("sinnaj",textProcessor.stringReverse("jannis"));
    }

    @AfterAll
    void afterAllTest(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " finished....");
    }


}