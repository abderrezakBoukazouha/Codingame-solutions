import org.junit.Test;

public class calculateSommeProblem {
    public static int sumRange(int [] ints) {
        int sum = 0;

        for (int i=0; i<ints.length; i++) {
            int n = ints[i];
            if(n >=10 && n<=100) {
                sum +=n;
            }
        }

        return sum;
    }

    @Test
    public void sommeTest() {
        int[] nums1 =   {1,20,3,10,-2,100};
        int[] nums2 = {30,4,9,12,98,-10,10};

        System.out.println("expected result 130, your result : " + sumRange(nums1));
        System.out.println("expected result 150, your result : " + sumRange(nums2));
    }
}
