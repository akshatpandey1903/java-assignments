package SquareElements;

import java.util.Scanner;

public class SortedSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = sortedSquares(arr);
        System.out.println("Sorted squares:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[index--] = arr[left] * arr[left];
                left++;
            } else {
                result[index--] = arr[right] * arr[right];
                right--;
            }
        }
        return result;
    }
}
