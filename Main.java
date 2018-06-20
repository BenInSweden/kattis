package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        double number = Double.parseDouble(input[0]);
        double guesses = Double.parseDouble(input[1]);
       if(Math.pow(2, guesses) >= number)
           System.out.println("Your wish is granted!");
       else System.out.println("You will become a flying monkey!");

    }
}
