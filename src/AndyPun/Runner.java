package AndyPun;

public class Runner {

    public static void main(String[] args) {
        String[] testArr ={"this","is","a","test","array"};

        System.out.print("Before: ");
        for  (String str:testArr)
        {System.out.print(str+" ");}
        System.out.println();

        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(testArr);
        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (String str:testArr) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("Time taken: "+time+" nanoseconds");

        /****************************************************/

        int [] testArr2 = {7,5,3,5,2,4,2,1,3,4,4};

        System.out.print("Before: ");
        for  (int num:testArr2)
        {System.out.print(num+" ");}
        System.out.println();

        long time2 = System.nanoTime();
        InPlaceSorts.selectionSort(testArr2);
        time2 = System.nanoTime() - time2;

        System.out.print("After: ");
        for (int num:testArr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Time taken: "+time2+" nanoseconds");

        /*****************************************************/

        int [] testArr3 = {9,4,6,3,2,7,5,4,2,7,31,9};

        System.out.print("Before: ");
        for  (int num:testArr3)
        {System.out.print(num+" ");}
        System.out.println();

        long time3 = System.nanoTime();
        InPlaceSorts.insertionSort(testArr3);
        time3 = System.nanoTime() - time3;

        System.out.print("After: ");
        for (int num:testArr3) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Time taken: "+time3+" nanoseconds");
    }

}