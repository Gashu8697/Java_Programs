package com.java.groupproject2;

import java.util.*;

public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        int n = sc.nextInt();
        int[] floorSizes = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the floor size given on day : " + (i+1));
            floorSizes[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int currFloorSize = n;
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && stack.peek() == currFloorSize) {
                System.out.print(stack.pop() + " ");
                currFloorSize--;
            }
            if (floorSizes[i] == currFloorSize) {
                System.out.print(floorSizes[i] + " ");
                currFloorSize--;
            } else {
                stack.push(floorSizes[i]);
            }
            System.out.println();
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
