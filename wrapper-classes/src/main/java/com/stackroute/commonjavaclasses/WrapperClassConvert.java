package com.stackroute.commonjavaclasses;

import java.util.Scanner;

public class WrapperClassConvert {
    public Object convertToWrapper(Object object) {
        if (object == null || !(object instanceof Number || object instanceof Character || object instanceof Boolean)) {
            return "Give proper primitive type as input";
        }

        if (object instanceof Byte) {
            return (Byte) object;
        } else if (object instanceof Short) {
            return (Short) object;
        } else if (object instanceof Integer) {
            return (Integer) object;
        } else if (object instanceof Long) {
            return (Long) object;
        } else if (object instanceof Float) {
            return (Float) object;
        } else if (object instanceof Double) {
            return (Double) object;
        } else if (object instanceof Character) {
            return (Character) object;
        } else if (object instanceof Boolean) {
            return (Boolean) object;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        WrapperClassConvert converter = new WrapperClassConvert();
        Scanner scan=new Scanner(System.in);

        int primitiveValue = scan.nextInt();
        Object result = converter.convertToWrapper(primitiveValue);
        System.out.println("Wrapper class value: " + result);
    }
}

