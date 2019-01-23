package AndyPun;

public class Runner {
    public static void main(String[] args) {
        //BubbleSort
        String[] stringArr = SortUtils.randomStringArr(10, 3);

        System.out.print("Before: ");
        for (String num : stringArr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        String[] beforeStringArr = SortUtils.copyStringArr(stringArr);
        InPlaceSorts.bubbleSort(stringArr);

        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (String num : stringArr)
            System.out.print(num + " ");

        if (SortUtils.isSortedString(stringArr)) {
            System.out.println();
            System.out.println("Time taken: " + time);
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }

        //SelectionSort
        double[] doubleArr = SortUtils.randomDoubleArr(10);

        System.out.print("Before: ");
        for (double num : doubleArr)
            System.out.print(num + " ");
        System.out.println();

        long timedouble = System.nanoTime();
        double[] beforeDoubleArr = SortUtils.copyDoubleArr(doubleArr);
        InPlaceSorts.selectionSort(doubleArr);

        timedouble = System.nanoTime() - timedouble;

        System.out.print("After: ");
        for (double num : doubleArr)
            System.out.print(num + " ");

        if (SortUtils.isSortedDouble(doubleArr)) {
            System.out.println();
            System.out.println("Time taken: " + timedouble);
            System.out.println("Same Sum: " + SortUtils.checkSumDouble(beforeDoubleArr, doubleArr));
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }

        //InsertionSort
        int[] intArr = SortUtils.randomIntArr(10);

        System.out.print("Before: ");
        for (int num : intArr)
            System.out.print(num + " ");
        System.out.println();

        long timesort = System.nanoTime();
        int[] beforeIntArr = SortUtils.copyIntArr(intArr);
        InPlaceSorts.insertionSort(intArr);

        timesort = System.nanoTime() - timesort;

        System.out.print("After: ");
        for (int num : intArr)
            System.out.print(num + " ");

        if (SortUtils.isSorted(intArr)) {
            System.out.println();
            System.out.println("Time taken: " + timesort);
            System.out.println("Same Sum: " + SortUtils.checkSum(beforeIntArr, intArr));
            System.out.println();
        }
        else {
            System.out.println("Not Sorted Correctly");
        }
    }
}