import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Nested
public class Teste {
    @Test
    void teste1() {
        List<Integer> sequence1 = Arrays.asList(23, 2, 55, 96, 4, 6, 7);
        assertEquals(Arrays.asList(2, 4, 6, 7), LIS.LIS1(sequence1));
    }

    @Test
    void teste2() {
        List<Integer> sequence1 = Arrays.asList(10, 20, 3, 4, 5, 6, 7);
        assertEquals(Arrays.asList(3, 4, 5, 6, 7), LIS.LIS1(sequence1));
    }

    @Test
    void teste3() {
        List<Integer> sequence = Arrays.asList(3, 6, 9, 4, 20, 8);
        assertEquals(Arrays.asList(3, 6, 9, 20), LIS.LIS(sequence));
    }

    @Test
    void teste4() {
        List<Integer> sequence = Arrays.asList(5, 9, 10, 1, 60);
        assertEquals(Arrays.asList(5, 9, 10, 60), LIS.LIS(sequence));
    }
}


