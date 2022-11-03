package homework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void testDoSomething() {
        Person p = new Person("John", 10);
        p.doSomething();
    }

    @Test
    @DisplayName("WHEN null name is given THEN constructor throws an error")
    public void testCreatePersonWithNullName() {
        Assertions.assertThatThrownBy(() -> {
            new Person(null, 10);
        }).isInstanceOf(RuntimeException.class);
    }

}