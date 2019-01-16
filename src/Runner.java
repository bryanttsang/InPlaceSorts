public class Runner
{
    public static void main(String args[])
    {
        int[] array = InPlaceSorts.randIntArr(20);
        int[] copy = InPlaceSorts.copyIntArray(array);
        int[] copy2 = InPlaceSorts.randIntArr(20);
        int[] array2 = InPlaceSorts.copyIntArray(copy2);
        //print initial array
        System.out.println("Before: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        System.out.println("Before: ");
        for (int num:array2)
            System.out.println(num + " ");
        System.out.println();

        //sort with selection sort
        long time = System.nanoTime();
        InPlaceSorts.insertionSort(copy);
        time = System.nanoTime() - time;
        InPlaceSorts.selectionSort(copy2);
        long time2 = System.nanoTime();
        time2 = System.nanoTime() - time2;
        //print final array
        System.out.println("After Insertion: ");
        for (int num:copy)
            System.out.println(num + " ");
        System.out.println();

        System.out.println("After Selection: ");
        for (int num:copy2)
            System.out.println(num + " ");
        System.out.println();

        //check and print
        System.out.println("Insertion Sort");
        System.out.println("isSorted: " + InPlaceSorts.isSorted(copy));
        System.out.println("checkSum: " + InPlaceSorts.checkSum(array, copy));
        System.out.println("Time taken: " + time + " nanoseconds");

        System.out.println("Selection Sort");
        System.out.println("isSorted: " + InPlaceSorts.isSorted(copy2));
        System.out.println("checkSum: " + InPlaceSorts.checkSum(array2, copy2));
        System.out.println("Time taken: " + time2 + " nanoseconds");
    }
}
