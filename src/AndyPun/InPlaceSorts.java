package AndyPun;

import static AndyPun.SortUtils.*;

public class InPlaceSorts {

    public static String[] bubbleSort(String[] StringArr){
        for(int n = 0; n < StringArr.length - 1; n++){
            if (0 > StringArr[n + 1].compareTo(StringArr[n])) {
                swapString(StringArr, n, n + 1);
                n = -1;
            }
        }
        return StringArr;
    }

    public static double[] selectionSort(double[] doubleArr) {
        int lowest;
        for (int i = 0; i < doubleArr.length - 1; i++) {
            lowest = i;
            for (int j = 1; j < doubleArr.length - i; j++) {
                if (doubleArr[lowest] > doubleArr[i + j]) {
                    lowest = i + j;
                }
            }
            swapDouble(doubleArr, i, lowest);
        }
        return doubleArr;
    }

    public static int[] insertionSort(int[] intArr){

        for(int x = 1; x < intArr.length; x++){
            for(int y = x; y > 0; y--){

                if (intArr[y] < intArr[y-1])
                {
                    swap(intArr, y,y-1);
                }
            }
        }
        return intArr;
    }
}