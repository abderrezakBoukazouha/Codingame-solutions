import org.junit.Test;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class TemperatureProblem {

        public static int closestToZero(int [] ints) {


            return Arrays.stream(ints).reduce(
                    (a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b)).getAsInt();
        }

        @Test
        public void test () {
            int [] ints = {4,-1,-2,3,3,5,9,9,5};

            System.out.println(closestToZero(ints));
        }
    }

