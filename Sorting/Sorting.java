package Sorting;

import java.util.Scanner;

public class Sorting {

    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            new Sorting().bubbleSort(arr);

            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(' ');
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
