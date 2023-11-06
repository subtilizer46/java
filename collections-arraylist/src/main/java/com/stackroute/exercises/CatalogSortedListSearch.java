package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {

    // write here logic to get sorted Array List which is a global class variable
    List<String> list = new ArrayList<>();

    public String catalogListSorter(List<String> unSortedCatalogList) {

        if (unSortedCatalogList == null) {
            return "The catalog list is null";
        }
        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }

        if (unSortedCatalogList.contains(null) || unSortedCatalogList.contains("Empty") || unSortedCatalogList.isEmpty()
                || unSortedCatalogList.contains(" ") || unSortedCatalogList.contains("")) {
            return "The catalog List contains empty or null or blank space as a value";
        }

        Collections.sort(unSortedCatalogList);

        this.list = unSortedCatalogList;
        return unSortedCatalogList.toString();
    }

    // write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {

        if (value != null) {
            if (value.isEmpty() || value.contains(" ") || value.contains("empty") || value == null) {
                return "Input is not accepted";
            }
        } else {
            return "Input is not accepted";
        }

        if (list.contains(value)) {
            return "Found: " + value;
        } else {
            return "Not Found";
        }
    }
}
