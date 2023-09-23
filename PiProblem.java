import org.junit.Test;

public class PiProblem {

    public static double getPi(double precision) {
        double pointsInCercle = 0;
        for (int i=0; i<precision; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x*x + y*y);

            if(distance <1) {pointsInCercle++;}
        }
        return 4 * pointsInCercle/precision ;
    }

    @Test
    public void getPiTest() {
        System.out.println(getPi(1000));
        System.out.println(getPi(1000000));
        System.out.println(getPi(100000000));
        System.out.println(getPi(1000000000));
    }
}
