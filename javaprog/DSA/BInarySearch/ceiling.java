package javaprog.DSA.BInarySearch;

import java.util.Scanner;

public class ceiling {

    public static int solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int start = 0, result = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                result = arr[mid];
                end = mid - 1;

            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }

        }
        return result;
    }
}
