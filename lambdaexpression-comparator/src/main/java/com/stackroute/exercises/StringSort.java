package com.stackroute.exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {

    public String stringSorter(List<String> strList, String sortOrder) {
        if (strList == null || sortOrder == null || strList.isEmpty() || sortOrder.isEmpty()
                || sortOrder.contains(" ")) {
            return "Given stringList or sortingOrder is empty, null or blank space";
        }
        if (strList.isEmpty() || strList.contains("") || strList.contains(" ")) {
            return "The list contains an empty or blank space value";
        }
        if (strList.size() == 1) {
            return "The list contains only one value";
        }

        switch (sortOrder.trim().toLowerCase()) {
            case "asc":
                Collections.sort(strList, Comparator.naturalOrder());
                break;
            case "desc":
                Collections.sort(strList, Comparator.reverseOrder());
                break;
            default:
                return "No sorting order present for given string '" + sortOrder
                        + "' , 'asc' for ascending order sort and 'desc' for descending order sort";
        }
        return strList.toString();
    }
}
