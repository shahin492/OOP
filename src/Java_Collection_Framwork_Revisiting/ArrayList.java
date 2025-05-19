package Java_Collection_Framwork_Revisiting;

import java.util.*;
import java.util.Collections;

public class ArrayList {
    public static int findKthSmallest(java.util.ArrayList<Integer> list, int k) {
        if (k <= 0 || k > list.size()) {
            throw new IllegalArgumentException("Invalid value of k: " + k);
        }

        // Sort the ArrayList
        Collections.sort(list);

        // Return the kth smallest element (index is k-1)
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        try {
            int kthSmallest = findKthSmallest(list, k);
            System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}