package com.stackroute.strings;
import  java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String phraseOne = scan.nextLine();
        String phraseTwo = scan.nextLine();
        Anagram anagram=new Anagram();
        String result = anagram.checkAnagrams(phraseOne,phraseTwo);
        System.out.println(result);
    }
    public String checkAnagrams(String phraseOne, String phraseTwo)
    {
        if(phraseOne.isEmpty() || phraseTwo.isEmpty())
        {
            return "Give proper input not empty phrases";
        }
        else
        {
            char[] arr1;
            char[] arr2;
            arr1 = phraseOne.toCharArray();
            arr2 = phraseTwo.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean flag = Arrays.equals(arr1, arr2);
            if (flag == true)
            {
                return "Given phrases are anagrams";
            }
            else
            {
                return "Given phrases are not anagrams";
            }
        }
    }
}
