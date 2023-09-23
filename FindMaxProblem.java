import org.junit.Test;

import java.util.Arrays;

public class FindMaxProblem {

    public static int findMax(int [] ints) {
        return Arrays.stream(ints).max().getAsInt();
    }

    @Test
    public void test () {
        int [] ints = {1,2,2,45,66,5,9,9,5};

        System.out.println(findMax(ints));
    }
}
