package algorithms.time;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

public class MissingElementTest extends TestCase {

    final MissingElement missingElement = new MissingElement();


    public void testSolution() {
        Assertions.assertThat(missingElement.solution(new int[]{2})).isEqualTo(1);
        Assertions.assertThat(missingElement.solution(new int[]{1, 2, 3, 5})).isEqualTo(4);
        Assertions.assertThat(missingElement.solution(new int[]{5, 2, 3, 4})).isEqualTo(1);
        Assertions.assertThat(missingElement.solution(new int[]{2, 3, 1, 5})).isEqualTo(4);
        Assertions.assertThat(missingElement.solution(new int[]{})).isEqualTo(1);
    }
}