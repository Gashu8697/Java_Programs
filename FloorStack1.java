package com.java.groupproject2;

import java.util.*;

public class FloorStack1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building: ");
        int n = sc.nextInt();
        int[] sizes = new int[n];
        List<Integer> assembled = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + ": ");
            sizes[i] = sc.nextInt();
            assembled.add(sizes[i]);
            int index = assembled.size() - 2;
            while (index >= 0 && assembled.get(index) < assembled.get(index + 1)) {
                Collections.swap(assembled, index, index + 1);
                index--;
            }
			printAssembled(assembled);
        }
        sc.close();
    }

    private static void printAssembled(List<Integer> assembled) {
        System.out.print("Day: " + assembled.size() + "\n");
        for (int i = 0; i < assembled.size(); i++) {
            System.out.print(assembled.get(i) + " ");
        }
        System.out.println();
    }
}
