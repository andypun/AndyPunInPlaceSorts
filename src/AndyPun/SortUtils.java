package AndyPun;

public class SortUtils {
    public static String[] randomStringArr(int count, int letters)
    {
        String[] randomStringArr = new String[count];
        while (count > 0)
        {
            String x = " ";
            for (int i = 0; i < letters; i++)
            {
                char y = (char) ((Math.random() * 26) + 97);
                x = x + y;
            }
            count--;
            randomStringArr[count] = x;
        }
        return randomStringArr;
    }

    public static String[] copyStringArr(String[] StringArr)
    {
        String[] copyStringArr = new String[10];
        for (int n = 0; n < StringArr.length ; n++) {
            copyStringArr[n] = StringArr[n];
        }
        return copyStringArr;
    }

    public static void swapString(String[] StringArr, int x, int y)
    {
        String temp = StringArr[x];
        StringArr[x] = StringArr[y];
        StringArr[y] = temp;
    }

    public static boolean isSortedString(String[] StringArr)
    {
        for (int n = 0; n < StringArr.length - 1; n++)
        {
            if (0 > StringArr[n+1].compareTo(StringArr[n]))
            {
                swapString(StringArr, n, n + 1);
            }
        }
        return true;
    }

    public static double[] randomDoubleArr(int count){
        double[] randomDoubleArr = new double[count];
        for(int n = 0; n < count - 1; n++){
            randomDoubleArr[n] = (Math.random() * 1001);
            randomDoubleArr[n] = Math.round(randomDoubleArr[n] + 100.0) / 100.0;
        }
        return randomDoubleArr;
    }

    public static double[] copyDoubleArr(double[] doubleArr)
    {
        double[] copyDoubleArr = new double[10];
        for (int n = 0; n < doubleArr.length ; n++) {
            copyDoubleArr[n] = doubleArr[n];
        }
        return copyDoubleArr;
    }

    public static void swapDouble(double[] doubleArr, int i, int j) {
        double temp = doubleArr[i];
        doubleArr[i] = doubleArr[j];
        doubleArr[j] = temp;
    }

    public static boolean isSortedDouble(double[] doubleArr)
    {
        for (int n = 0; n < doubleArr.length - 1; n++) {
            if (doubleArr[n] > doubleArr[n + 1]) {
                swapDouble(doubleArr, n, n + 1);
            }
        }
        return true;
    }

    public static boolean checkSumDouble(double[] before, double[] after) {
        double sumBefore = 0;
        double sumAfter = 0;

        for (int i = 0; i < before.length; i++) {
            sumBefore += before[i];
        }

        for (int j = 0; j < after.length; j++) {
            sumAfter += after[j];
        }

        if (sumBefore == sumAfter) {
            return true;
        } else
            {
            return false;
        }
    }


    public static int[] randomIntArr(int count){
        int[] randomIntArr = new int[count];
        for(int n = 0; n < count - 1; n++){
            randomIntArr[n] = (int)(Math.random()*1001);
        }
        return randomIntArr;
    }

    public static int[] copyIntArr(int[] intArr)
    {
        int[] copyIntArr = new int[10];
        for (int n = 0; n < intArr.length ; n++) {
            copyIntArr[n]= intArr[n];
        }
        return copyIntArr;
    }


    public static void swap(int[] intArr, int x, int y){
        int temp;
        temp = intArr[x];
        intArr[x] = intArr[y];
        intArr[y] = temp;
    }

    public static boolean isSorted(int[] intArr)
    {
        for (int n = 0; n < intArr.length - 1; n++) {
            if (intArr[n] > intArr[n + 1]) {
                swap(intArr, n, n + 1);
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



}

