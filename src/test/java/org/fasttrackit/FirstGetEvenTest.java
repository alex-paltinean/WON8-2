package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstGetEvenTest {

    @Test
    @DisplayName("WHEN null list is given THEN empty list is returned")
    public void testGetEvenNullWithAssertJ() {
        First first = new First();

        Assertions.assertThatThrownBy(() -> {
            List<Integer> even = first.getEven(null);
        }).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("WHEN null list is given THEN empty list is returned")
    public void testGetEvenNullWithJunit() {
        First first = new First();

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            List<Integer> even = first.getEven(null);
        });
    }

    @Test
    @DisplayName("WHEN empty list is given THEN empty list is returned")
    public void testGetEvenEmpty() {
        First first = new First();

        List<Integer> even = first.getEven(new ArrayList<>());

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("WHEN list with no even number is given THEN empty list is returned")
    public void testGetEvenNoEven() {
        First first = new First();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);

        List<Integer> even = first.getEven(list);

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("WHEN list with even numbers is given THEN list with even numbers is returned")
    public void testGetEven() {
        First first = new First();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);

        List<Integer> even = first.getEven(list);

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).hasSize(2);
        Assertions.assertThat(even).containsExactly(2, 6);
    }
}
