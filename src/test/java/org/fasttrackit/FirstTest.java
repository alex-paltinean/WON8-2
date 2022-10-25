package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class FirstTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @Test
    @DisplayName("WHEN sum is called on two numbers THEN sum is returned")
    public void sumTest() {
        System.out.println("sumTest");
        // GIVEN
        int a = 2;
        int b = 3;
        First first = new First();

        // WHEN
        int result = first.sum(a, b);

        // THEN
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("WHEN sum is called on two negative numbers THEN sum is returned")
    public void sumNegativeNumbersTest(){
        System.out.println("sumNegativeNumbersTest");
        // GIVEN
        int a = -3;
        int b = -1;
        First first = new First();

        // WHEN
        int result = first.sum(a, b);

        //THEN
        Assertions.assertThat(result).isEqualTo(-4);
    }
}
