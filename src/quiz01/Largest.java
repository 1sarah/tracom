package quiz01;

public class Largest {

    public static void main (String[] args) {

        int [] testArr = {1, 3, 7, 2, 9};
        int max = maxVal(testArr);
        System.out.println(max);
    }

    // Returns largest value in an array of integers
    public static int maxVal (int[] arr) {
        int max = 0;
        for (int i: arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
