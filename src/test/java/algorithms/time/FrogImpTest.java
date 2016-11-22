package algorithms.time;

import algorithms.time.FrogImp;
import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

public class FrogImpTest extends TestCase {
    final FrogImp frogImp = new FrogImp();

    public void testSolution() {
        Assertions.assertThat(frogImp.solution(10, 85, 30)).isEqualTo(3);
    }
}