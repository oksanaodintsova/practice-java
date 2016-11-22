package algorithms.time;

        import java.math.BigInteger;
        import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
public class MissingElement {
    public int solution(int[] A) {
        // write your code in Java SE 8
        //TODO:: still failing with timeotu
        final BigInteger length = new BigInteger(String.valueOf(A.length));
        final BigInteger actualSum = (length.multiply(length.add(BigInteger.ONE))).divide(new BigInteger("2"));
        return Arrays.stream(A).mapToObj(i -> new BigInteger(String.valueOf(i))).reduce(BigInteger::add)
                .map(givenSum -> new BigInteger(String.valueOf(A.length + 1)).subtract(givenSum.subtract(actualSum)).intValue()).orElse(1);
    }
}
