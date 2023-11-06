package com.stackroute.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    // write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {
        if (input <= 0) {
            return "Give proper input not zero or negative";
        } else if (input > 20) {
            return "Give proper input not greater than 20";
        } else {
            ArrayList<String> list = new ArrayList<String>();
            Queue<String> q = new LinkedList<>();
            q.add("1");

            while (input > 0) {
                String binNum = q.poll();
                list.add(binNum);
                q.add(binNum + "0");
                q.add(binNum + "1");
                input--;
            }
            return String.join(" ", list);
        }
    }
}