package com.stackroute.exercises;


import java.util.Scanner;

public class StringParse {
    //Write logic to find the character from the sentence at specified location
    static Scanner  sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Sentence");
        String sentence=sc.nextLine();
        System.out.println("Enter Location");
        String location=sc.nextLine();
        char result = characterLocator(sentence,location);
        System.out.println(result);
    }
    public static char characterLocator(String sentence, String location) {
        try {
            Integer position = Integer.parseInt(location);
            /*char[] ch = sentence.toCharArray();
            char result = ch[position];*/
            return sentence.charAt(position);
        }
        catch (NumberFormatException n){
            throw new NumberFormatException("NumberFormatException");
        }
        catch (StringIndexOutOfBoundsException s){
            throw new StringIndexOutOfBoundsException("StringIndexOutOfBoundsException");
        }
    }
}
