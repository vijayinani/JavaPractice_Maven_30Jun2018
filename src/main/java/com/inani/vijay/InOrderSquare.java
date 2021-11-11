package com.inani.vijay;

public class InOrderSquare {

    public static void main(String[] args) {

        int[] result = new InOrderSquare().inOrderSort(new int[]{-6, -3, 1, 2, 5, 10});
        // int[] result = new PayPal().inOrderSort(new int[]{-9, -4, -2, -1});
        // int[] result = new PayPal().inOrderSort(new int[]{3, 4, 5, 7, 8, 11});
        for (int x : result) {
            System.out.println(x + " ");
        }
    }

    public int[] inOrderSort(int[] input) {

        int left = 0;
        int right = input.length - 1;
        int[] output = new int[input.length];
        int outIndex = right;

        while (left <= right) {
            if (Math.abs(input[left]) < Math.abs(input[right])) {
                output[outIndex] = input[right] * input[right];
                right--;
            } else {
                output[outIndex] = input[left] * input[left];
                left++;
            }
            outIndex--;
        }

        return output;
    }
}
