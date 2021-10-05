package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric(0);
        String input = "f(x)= x + 3";
        Scanner scan = new Scanner(input);

        scan.useDelimiter("");

        for (int i = 0; i < 0; i++){
            String karakter = scan.next();
            if (karakter.equals("(")){
                stack.push("(");
            }else if (karakter.equals("(")){
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("valid");
        }else{
            System.out.println("tidak valid");
        }
    }
}
