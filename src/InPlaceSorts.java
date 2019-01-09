public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {

    }

    public static void selectionSort(double[] list1)
    {

    }

    public static void bubbleSort(String[] list1)
    {

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
}
