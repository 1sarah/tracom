package myproject;

public class ArrayExp1 {

    public static void main (String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int [] number;
        number = new int[4];

        number[0]  = 6;
        number[1]  = 7;
        number[2]  = 8;
        number[3]  = 9;

        int totals = 0;
        for (int i: number) {
            totals = totals + i;
            System.out.println(totals);
        }

        System.out.println("Total value: " + totals);

        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e){
            ;
        }
    }

    static int[] getArray(){
        return new int[] {1,2,3};
    }
}
