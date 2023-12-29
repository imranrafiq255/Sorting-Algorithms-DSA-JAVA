public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1, 12, 11, 13, 5, 6};
        Sortings s = new Sortings();
//        s.insertionSort(arr);
//        s.selectionSort(arr);
          s.bubbleSort(arr);
        for(int value : arr)
        {
            System.out.print(value + " ");
        }
    }
}
