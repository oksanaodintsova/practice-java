package algorithms;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BinaryGapTest {

    final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testSolution() {
        assertThat(binaryGap.solution(1041)).isEqualTo(5);
        assertThat(binaryGap.solution(805306373)).isEqualTo(25);
        assertThat(binaryGap.solution(15)).isEqualTo(0);
        assertThat(binaryGap.solution(32)).isEqualTo(0);

    }
}