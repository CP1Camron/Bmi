package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




        double userHeight;
        double userWeight;


        Scanner keyBoard;



        keyBoard = new Scanner(System.in);





    System.out.println("Hello, lets find out your BMI");
    System.out.println("What is  your height in meters?");
    userHeight = keyBoard.nextDouble();

    System.out.println("Alright, Now what is your weight in Kilograms?");
    userWeight = keyBoard.nextDouble();

            System.out.println("Alright so your BMI is..."+userWeight/userHeight);























    }
}
