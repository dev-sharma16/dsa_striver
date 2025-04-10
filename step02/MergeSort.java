package step02;

import java.util.*;

class MeregSort {

    // Merge Sort Function
    void mergeSort(int arr[], int l, int r) {
        if (l == r) return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        mS(arr, l, mid, r);
    }

    // Merge Two Sorted Halves
    void mS(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy sorted elements back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Main Method for Testing
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};

        System.out.print("Unsorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        MeregSort sorter = new MeregSort();
        sorter.mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

