package com.inani.vijay;

public class RearrangePositiveAndNegativeNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 5, 3, -12, -31, 4, 6, -37, 2, 1, 39, 44, -23, -23, 49, 39, 42, 11, -36, 43, 2, 1, -444};
        new RearrangePositiveAndNegativeNumbers().rearrangePositiveAndNegativeNumbers(array);
        for (int val : array) {
            System.out.print(val + " ");
        }

        System.out.println();

        array = new int[]{3, 2, 5, 5, 3, -12, -31, 4, 6, -37, 2, 1, 39, 44, -23, -23, 49, 39, 42, 11, -36, 43, 2, 1, -444};
        new RearrangePositiveAndNegativeNumbers().rearrangePositiveAndNegativeNumbersDivideAndMerge(array);
        for (int val : array) {
            System.out.print(val + " ");
        }

    }

    private void rearrangePositiveAndNegativeNumbersDivideAndMerge(int[] array) {
        rearrange(array, 0, array.length - 1);
    }

    private void rearrange(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            rearrange(array, low, mid);
            rearrange(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int firstSize = mid - low + 1;
        int secondSize = high - mid;

        int[] first = new int[firstSize];
        int[] second = new int[secondSize];

        for (int i = 0; i < firstSize; i++) {
            first[i] = array[i + low];
        }
        for (int i = 0; i < secondSize; i++) {
            second[i] = array[i + mid + 1];
        }

        int i = 0, j = 0, k = low;
        while (i < firstSize && first[i] < 0) {
            array[k++] = first[i++];
        }
        while (j < secondSize && second[j] < 0) {
            array[k++] = second[j++];
        }
        while (i < firstSize) {
            array[k++] = first[i++];
        }
        while (j < secondSize) {
            array[k++] = second[j++];
        }

    }

    private void rearrangePositiveAndNegativeNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                int key = input[i];
                int j = i - 1;
                while (j >= 0 && input[j] >= 0) {
                    input[j + 1] = input[j];
                    j--;
                }
                input[j + 1] = key;
            }
        }
    }
}
