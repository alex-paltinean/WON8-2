package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class FirstMockitoTest {

    @Test
    public void testGetEven() {
        First first = Mockito.mock(First.class);
        Mockito.when(first.getEven(null)).thenCallRealMethod();
        Mockito.when(first.validateInput(null)).thenReturn(false);

        List<Integer> even = first.getEven(null);

        Assertions.assertThat(even).isNotNull();
    }
}
