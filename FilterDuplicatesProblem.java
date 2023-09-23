import org.junit.Test;

import java.util.Arrays;

public class FilterDuplicatesProblem {

    public static int[] filterDuplicates(int [] ints) {
        return Arrays.stream(ints).distinct().toArray();
    }

    @Test
    public void test () {
        int [] ints = {1,2,2,3,3,5,9,9,5};

        System.out.println(Arrays.toString(filterDuplicates(ints)));
    }

    public static void main(String[] args) {

    }
}
