package Sorting;

import java.util.Scanner;

public class Solution {

    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) min = j;
            }
            if (min != i) swap(nums, i, min);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        new Solution().selectionSort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(' ');
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
