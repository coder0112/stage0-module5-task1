package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int n[] = new int[length];
        for (int i = 0; i < length; i++) {
            n[i] = i+1;
        }
        return n;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                n = i;
                break;
            }
        }
        return n;
    }


    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int n = arr.length;
        String s[] = new String[n--];
        for (String i : arr) {
            s[n--] = i;
        }
        return s;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int n = arr.length, a[] = new int[n], k = 0;

        for(int i : arr) {
            if (i > 0) {
                a[k++] = i;
            }
        }
        int b[] = new int[k];
        int t = 0;
        for (int i : a) {
            b[t] = i;
            t++;
            if (t == k) break;
        }
        System.out.println(b.length);
        return b;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int m = arr[i].length;
            for (int j = 0; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int r = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = r;
                    }
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length > arr[j].length) {
                    int a[] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
