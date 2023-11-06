package com.stackroute.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountOccurrence {
    // Complete the method signature to act as a generic method and write logic to find the count of occurrences of item in array of items
    public static <T> int findCount(T[] elements, T item) {
        int count = 0;
        for (T element : elements) {
            if (element == item || element.equals(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        Object[] elements = new Object[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements ");
            elements[i] = sc.next();
        }

        System.out.print("Enter the item to find: ");
        Object item = sc.next();

        int result = findCount(elements, item);
        System.out.println("Count of '" + item + "' in the array: " + result);
    }
}
