package com.stackroute.exercises;

import java.util.*;
//class should have a generic list variable
public class Stringify<E> {

    //write here logic to validate the generic input
    public String inputValidator(E[] arr) {
        if (arr == null) {
            return "Given value is null";
        }

        ArrayList<E> arrayList = new ArrayList<E>();
        for (E element : arr) {
            arrayList.add(element);
        }

        if (arrayList.isEmpty() || arrayList.toString().trim().isEmpty() || arrayList.contains("")) {
            return "The given array contains one value which is empty or blank space";
        }
        if (arrayList.contains(null)) {
            return "Given array contains a null value";
        }

        return stringGenerator(arrayList);
    }

    //write here logic to convert array list to string
    public String stringGenerator(ArrayList<E> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (E element : arrayList) {
            stringBuilder.append(element).append(" ");
        }

        return stringBuilder.toString().trim();
    }

    public void main(String[] args) {
        Object obj[] = new Object[100];
        String s[] = (String[]) new Object();
        Scanner sc=new Scanner(System.in);
        s = new String[]{sc.next()};
        String result = inputValidator((E[]) s);
    }
}
