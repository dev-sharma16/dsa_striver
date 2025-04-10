package step02;

class QuickSort {

    // Function to sort an array using quick sort algorithm
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Partition function (Lomuto-style with first element as pivot)
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot with arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.print("Unsorted array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

