package myproject;

public class ArrayExercises {

    private final int[] arr;

    public ArrayExercises (String[] args) {
        arr = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e){
            throw e;
        }

    }
    public ArrayExercises (int[] arr) {
        this.arr = arr;
    }

    public static void main (String [] args) {







//        int[] arr; int totals;
        //ArrayExercises a = new ArrayExercises();
//        arr = a.createArray(args);
//        totals = a.sumArray(arr);
//        a.printArr(arr);
//        System.out.println(totals);




//
//        int myArray[][] = new int[4][];
//        myArray[0] = new int[4];
//        myArray[1] = new int[6];
//        myArray[2] = new int[1];
//        myArray[3] = new int[3];
//
//        int count = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                myArray[i][j] = count++;
//            }
//        }
//
//        for (int y = 0; y< myArray.length; y++) {
//            for (int s = 0; s< myArray[y].length; s++) {
//                System.out.print(myArray[y][s] + "\t ");
//            }
//            System.out.println();
//        }
//
        char[] originalArr = {'L', 'R', 'U', 'A', 'V'};
        char [] rcvArr = new char[5];


        System.arraycopy(originalArr, 0, rcvArr, 0,4);

        System.out.println(String.valueOf(rcvArr));

        int[] oldarr = {12,2,37,4,55};
        int [] newarr = oldarr.clone();
        ArrayExercises clonedArr = new ArrayExercises(newarr);
        clonedArr.printArr();
    }

    int [] createArray(String[] args) {
        int [] arr = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e){
            throw e;
        }

        return arr;
    }

    int sumArray() {
        int sum = 0;
        for (int i: this.arr) {
            sum = sum + i;
        }
        return sum;
    }

    void printArr() {
        for (int i: this.arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
