package com.stackroute.basics;
import java.util.Scanner;
import java.lang.*;
public class PhoneNumberValidator {
    public String input;
    public static void main(String[] args) {
        PhoneNumberValidator validator= new PhoneNumberValidator();
        String input = validator.getInput();
        int result = validator.validatePhoneNumber(input);
        validator.displayResult(result);
        validator.closeScanner();
    }

    public String getInput() {
        Scanner scanner= new Scanner(System.in);
        input=scanner.nextLine();
        return input;
    }

    public void displayResult(int result) {
        if(result==1)
        {
            System.out.println("Valid");
        }
        else if(result==0)
        {
            System.out.println("Invalid");
        }
        else if(result==-1)
        {
            System.out.println("Empty string");
        }
    }

    public int validatePhoneNumber(String input) {
        if(input == null || input.isEmpty())
        {
            return -1;
        }
        char[] arr;
        arr=input.toCharArray();
        int d=0;
        for(char i : arr)
        {
            if(Character.isDigit(i))
            {
                d++;

            } else if(i != '-')
            {
                return 0;
            }
        }
        if(d == 10)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public void closeScanner(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
