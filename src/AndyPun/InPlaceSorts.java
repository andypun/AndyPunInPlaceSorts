package AndyPun;

import static AndyPun.SortUtils.isSorted;
import static AndyPun.SortUtils.swapInt;
import static AndyPun.SortUtils.swapString;
import static AndyPun.SortUtils.isSortedString;

public class InPlaceSorts {

    public static void bubbleSort(String [] stringArr)
    {
        int len = stringArr.length;

        while (isSortedString(stringArr) )
        {
            for (int i = 0; i < len - 1; i++)
            {
                if ((stringArr[i].compareTo(stringArr[i+1]))>0)
                {
                    swapString(stringArr,i,i+1);
                }

            }
        }
    }

    public static void selectionSort(int[]arr) {
        while (isSorted(arr)) {
            for (int index = 0; index < arr.length; index++)
                minimumIndex(arr, index);
        }
    }

    public static int minimumIndex(int arr[], int ind)
    {
        int minInd = ind;
        for (int i = ind + 1; i <arr.length; i++)
        {
            if (arr[i] < arr[minInd])
            {
                swapInt(arr,i,minInd);
            }
        }
        return minInd;
    }

    public static void insertionSort(int[]arr){
        while(isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swapInt(arr, j, j - 1);
                    }
                }
            }
        }

    }

}