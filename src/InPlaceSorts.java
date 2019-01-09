public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {

    }

    public static void selectionSort(double[] list1)
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

    public int[] randIntArr(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }
    public double[] randDoubleArr(int length)
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
}
