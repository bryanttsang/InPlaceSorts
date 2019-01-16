public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {
        for (int i = 1; i < list1.length; i++)
        {
            for (int ii = i; ii > 0; ii--)
            {
                if (list1[ii] < list1[ii - 1])
                {
                    Swap(list1, ii, ii - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] list1)
    {
        int minPos;
        for (int curPos = 0; curPos < list1.length - 1; curPos++)
        {
            double minVal = list1[curPos];
            minPos = curPos;
            for (int i = curPos; i < list1.length; i++)
            {
                if (list1[i] < minVal)
                {
                    minVal = list1[i];
                    minPos = i;
                }
            }
            Swap(list1, curPos, minPos);
        }
    }

    public static void bubbleSort(String[] list1)
    {
        int swapNum = -1;
        while (swapNum != 0)
        {
            swapNum = 0;
            for (int i = 0; i < list1.length - 1; i++)
            {
                int j = i + 1;
                if (list1[i].compareToIgnoreCase(list1[j]) > 0)
                {
                    Swap(list1, i , j);
                    swapNum++;
                }
            }
        }
    }

    public static void Swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void Swap(double[] array, int x, int y)
    {
        double temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void Swap(String[] array, int x, int y)
    {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int[] randIntArr(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }
    public static double[] randDoubleArr(int length)
    {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Math.random() * 10001;
        }
        return array;
    }
    public String[] randStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int[] copyIntArray(int[] array)
    {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }
    public static double[] copyDoubleArray(double[] array)
    {
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }
    public static String[] copyStringArray(String[] array)
    {
        String[] copy = new String[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean isSorted(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(double[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(String[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i].compareToIgnoreCase(array[i + 1]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] array, int[] copy)
    {
        if (array.length != copy.length)
        {
            return false;
        }
        int arraySum = 0;
        int copySum = 0;
        for (int i = 0; i < array.length; i++)
        {
            arraySum += array[i];
            copySum += copy[i];
        }
        if (arraySum == copySum)
        {
            return true;
        }
        return false;
    }
    public static boolean checkSum(double[] array, double[] copy)
    {
        if (array.length != copy.length)
        {
            return false;
        }
        double arraySum = 0;
        double copySum = 0;
        for (int i = 0; i < array.length; i++)
        {
            arraySum += array[i];
            copySum += copy[i];
        }
        if (arraySum == copySum)
        {
            return true;
        }
        return false;
    }
    public static boolean checkSum(int[] array, double[] copy)
    {
        if (array.length != copy.length)
        {
            return false;
        }
        int arraySum = 0;
        int copySum = 0;
        for (int i = 0; i < array.length; i++)
        {
            arraySum += array[i];
            copySum += copy[i];
        }
        if (arraySum == copySum)
        {
            return true;
        }
        return false;
    }

    public static boolean checkSum(String[] array, String[] copy)
    {
        if (array.length != copy.length)
        {
            return false;
        }
        String arraySum = "";
        String copySum = "";
        for (int i = 0; i < array.length; i++)
        {
            arraySum = arraySum + array[i];
            copySum = copySum + array[i];
        }
        if (arraySum.equals(copySum))
        {
            return true;
        }
        return false;
    }
}
