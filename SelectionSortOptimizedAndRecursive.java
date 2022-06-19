public class Main{


  //bubble sort 
    static void bubbleSort(int[] unsortedArray, int n) {
        if (n == 1) return;
        boolean swap = false;
        for (int i = 0; i < n - 1; i++) {

            if (unsortedArray[i] > unsortedArray[i + 1]) {
                int tmp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[i + 1];
                unsortedArray[i + 1] = tmp;
                swap = true;
            }

        }

        if (!swap) return;
        bubbleSort(unsortedArray, n - 1);
    }

    static void selectionSort(int[] unsortedArray, int n) {
        if(n >= unsortedArray.length) return;

            int min_idx = n;
            for (int j = n + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[min_idx] > unsortedArray[j])
                    min_idx = j;
            }
            if (min_idx == n)
                return;
            else{
                int tmp = unsortedArray[min_idx];
                unsortedArray[min_idx] = unsortedArray[n];
                unsortedArray[n] = tmp;
            }

            selectionSort(unsortedArray, n+1);

    }

    public static void main(String[] args) {

        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};
        int[] unsortedArray2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubbleSort(unsortedArray, unsortedArray.length);
        selectionSort(unsortedArray2, 0);


        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(unsortedArray2));
    }
}
