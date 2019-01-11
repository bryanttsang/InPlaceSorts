public class Runner
{
    public static void main(String args[])
    {
        int[] array = InPlaceSorts.randIntArr(9999);
        int[] copy = InPlaceSorts.copyIntArray(array);

        //print initial array
        System.out.println("Before: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        //sort with selection sort
        long time = System.nanoTime();
        InPlaceSorts.insertionSort(copy);
        time = System.nanoTime() - time;

        //print final array
        System.out.println("After: ");
        for (int num:copy)
            System.out.println(num + " ");
        System.out.println();

        //check and print
        System.out.println("Insertion Sort");
        System.out.println("isSorted: " + InPlaceSorts.isSorted(copy));
        System.out.println("checkSum: " + InPlaceSorts.checkSum(array, copy));
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}
