package algorithms;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

public class LonerElementTest extends TestCase {
    final LonerElement lonerElement = new LonerElement();

    public void testSolution() {

        Assertions.assertThat(lonerElement.solution(new int[]{9, 3, 9, 3, 9, 9, 7})).isEqualTo(7);
        Assertions.assertThat(lonerElement.solution(new int[]{})).isEqualTo(0);
    }
    }