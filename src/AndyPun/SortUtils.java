package AndyPun;

public class SortUtils {

    public int[] randomIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) Math.random() * 1001;
        }

        return arr;
    }

    public static double[] randomDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (Math.random() * 1001);
        }
        return arr;
    }

    public String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void swap(int[] Arr, int i, int j) {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSorted(int[] Arr) {
        for (int x = 0; x < Arr.length - 1; x++) {
            if (Arr[x] > Arr[x + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSortedString(String[] arr) {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++) {
            if ((arr[pos].compareTo(arr[pos + 1])) > 0) {
                return true;
            }
        }
        return false;
    }

    public static String checkSum(int[] before, int[] after) {
        int sum1 = 0;
        int sum2 = 0;
        String statement = "";
        for (int i = 0; i < before.length; i++) {
            sum1 = sum1 + before[i];
        }

        for (int i = 0; i < after.length; i++) {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2) {
            statement = "The sum before and after sort is equal";
        } else {
            statement = "The sum before and after sort is not equal";
        }
        System.out.println(statement);
        return statement;
    }

    public static String doubleCheckSum(double[] before, double[] after {
        double sum1 = 0;
        double sum2 = 0;
        String statement = "";

        for (int i = 0; i < before.length; i++)
        {
            sum1 = sum1 + before[i];
        }

        for (int i = 0; i < after.length; i++)
        {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2)
        {
            statement = "The sum before and after sort is equal";
        }
        else
        {
            statement = "The sum before and after sort is not equal";
        }
        System.out.println(statement);
        return statement;
}