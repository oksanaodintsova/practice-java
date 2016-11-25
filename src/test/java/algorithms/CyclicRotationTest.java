package algorithms;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

public class CyclicRotationTest extends TestCase {
    final CyclicRotation cyclicRotation = new CyclicRotation();

    public void testSolution() {
        assertThat(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 4)).isEqualTo(new int[]{8, 9, 7, 6, 3});
        assertThat(cyclicRotation.solution(new int[]{}, 4)).isEqualTo(new int[]{});
        assertThat(cyclicRotation.solution(new int[]{0, 0, 0}, 4)).isEqualTo(new int[]{0, 0, 0});
        assertThat(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4)).isEqualTo(new int[]{1, 2, 3, 4});
    }
}