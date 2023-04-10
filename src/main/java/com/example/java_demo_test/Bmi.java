package com.example.java_demo_test;

import java.text.DecimalFormat;
import java.util.Scanner;

//BMI
        public class Bmi {

            private static final DecimalFormat DF = new DecimalFormat("0.00");

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("請輸入你的體重(公斤):");
                double weight = scanner.nextDouble();

                System.out.print("請輸入你的身高(公分):");
                double height = scanner.nextDouble() / 100;

                double BMI = Double.parseDouble(DF.format(weight / (height * height)));
                System.out.println("您的BMI數值為" + BMI);

                if (BMI < 18.5) {
                    System.out.println("您屬於過輕類型");
                } else if (BMI < 24) {
                    System.out.println("您屬於正常類型");
                } else if (BMI < 30) {
                    System.out.println("您屬於微胖類型");
                } else {
                    System.out.println("您屬於過胖類型");
                }
            }
        }
