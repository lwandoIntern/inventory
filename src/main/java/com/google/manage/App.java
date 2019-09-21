package com.google.manage;



import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void weighted(){
        Scanner input = new Scanner(System.in);
        double earthWeight = 0.0;

        System.out.println("enter a planet: ");
        String planet = input.next();

        System.out.println("enter earth weight: ");
        earthWeight = input.nextDouble();
        double weight = 0.0;
        switch (planet){
            case "Mecury":
                weight = earthWeight * 0.38;
                System.out.println(weight);
                break;
            case "Venus":
                weight = earthWeight * 0.91;
                System.out.println(weight);
                break;
            case "Mars":
                weight = earthWeight * 0.38;
                System.out.println(weight);
                break;
            case "Jupiter":
                weight = earthWeight * 2.36;
                System.out.println(weight);
                break;
            case "Saturn":
                weight = earthWeight * 0.92;
                System.out.println(weight);
                break;
            case "Uranus":
                weight = earthWeight * 0.89;
                System.out.println(weight);
                break;
            case "Neptune":
                weight = earthWeight * 1.13;
                System.out.println(weight);
                break;
            default:
                System.out.println("Invalid input");
        }

        input.close();
    }
    public static void main( String[] args )
    {

        //1.
        int x = 7;
        boolean val = x >= 8 ? false: true;
        System.out.println(val);
        //2.

        Scanner input = new Scanner(System.in);
/*
        System.out.println("enter first digit: ");
        double num1 = input.nextDouble();

        System.out.println("enter second digit: ");
        double num2 = input.nextDouble();

        System.out.println("enter operand: ");
        char insert = input.next().charAt(0);

        double total = 0.0;

        /*switch (insert){
            case '*':
                total = num1 * num2;
                System.out.println(total);
                break;
            case  '/':
                if (num2 == 0){
                    System.out.println("invalid val enter again: ");
                    num2 = input.nextDouble();
                }
                total = num1 / num2;
                System.out.println(total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println(total);
                break;
            case '+':
                total = num1 + num2;
                System.out.println(total);
                break;
            case '%':
                total = num1 % num2;
                System.out.println(total);
                break;
            default:
                System.out.println("Invalid operand");
        }*/

        //2.2
        /*if (insert == '/') {
            if (num2 == 0) {
                System.out.println("invalid val enter again: ");
                num2 = input.nextDouble();
            }
            total = num1 / num2;
            System.out.println(total);
        }else if (insert == '*'){
            total = num1 * num2;
            System.out.println(total);
        }else if (insert == '-'){
            total = num1 - num2;
            System.out.println(total);
        }else if (insert == '+'){
            total = num1 + num2;
            System.out.println(total);
        }else {
            System.out.println("Invalid operand");
        }*/

       // total = insert =='/' ? num1 / num2 : insert == '*' ? num1 * num2 : insert == '-' ? num1 - num2 : insert == '+' ? num1 + num2 : 0;
        //System.out.println(total);
        //3. False


        /*
        double earthWeight = 0.0;

        System.out.println("enter a planet: ");
        String planet = input.next();

        System.out.println("enter earth weight: ");
        earthWeight = input.nextDouble();
        double weight = 0.0;
        switch (planet){
            case "Mercury":
                weight = earthWeight * 0.38;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Venus":
                weight = earthWeight * 0.91;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Mars":
                weight = earthWeight * 0.38;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Jupiter":
                weight = earthWeight * 2.36;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Saturn":
                weight = earthWeight * 0.92;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Uranus":
                weight = earthWeight * 0.89;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            case "Neptune":
                weight = earthWeight * 1.13;
                System.out.println("You weigh "+weight+" kgs on "+planet);
                break;
            default:
                System.out.println("Invalid input");
        }*/

        //5.
//        System.out.println("-------------------------------------------------------5-------------------------------");
//
//        System.out.println("enter a size of your school in terms of student numbers: ");
//        int schoolSize = input.nextInt();
//        System.out.println("Which Were you, a valedicorian or salutatorian? ");
//        String studentPosition = input.next();
//        System.out.println("enter gpa: ");
//        double gpa = input.nextDouble();
//        System.out.println("enter SAT score: ");
//        int satScore = input.nextInt();
//        if (schoolSize >= 1400 && (studentPosition.equalsIgnoreCase("Valedictorian")||(studentPosition.equalsIgnoreCase("Salutatorian")))){
//            System.out.println("You qualify for Mountville University");
//        }else if (gpa >=4.0 && satScore >= 1100){
//            System.out.println("You qualify for Mountville University");
//        }else if (gpa >= 4.5 && satScore >=1300){
//            System.out.println("You qualify for Mountville University");
//        }else if (gpa >= 3.0 && satScore >= 1500){
//            System.out.println("You qualify for Mountville University");
//        }else {
//            System.out.println("Invalid input");
//        }
//
//        //6.
//        System.out.println("enter the score average in %: ");
//        double score = input.nextDouble();
//
//        System.out.println("How many classes have you missed");
//        int missedClasses = input.nextInt();

//        if (score >= 90 && missedClasses <= 3){
//            System.out.println("You may be excused from the final exam");
//        }else if (score >= 80 && missedClasses == 0){
//            System.out.println("You may be excused from the final exam");
//        }else {
//            System.out.println("You have to write the final exam");
//        }
//
        //rewrite
//        double average;
//        int daysAbsent;
//        System.out.println("This program will determine if you can get out of the final exam.");
//        System.out.println("Please answer the following questions.");
//        System.out.println("What is your average in the class?");
//        average=input.nextDouble();
//        System.out.println("How class lectures have you missed?");
//        daysAbsent=input.nextInt();
//        if((average>=80 && daysAbsent ==0) || (average >= 90 &&daysAbsent <= 3)) {
//            System.out.println("Congratulations! You are exempt from the final exam.");
//        }else {
//            System.out.println("You are not exempt from the final exam.");
//        }

        //7.
        System.out.println("Please enter height of room: ");
        double height = input.nextDouble();

        System.out.println("Enter width: ");
        double width = input.nextDouble();

        System.out.println("Enter lenghth: ");
        double lenght = input.nextDouble();

        //area without the roof
        double area = 0;

        area = width * lenght;
        area = area + (height * lenght );
        area = area + (height *  width);
        area = area * 2;
        area = area - (width * lenght);

        double numOfBuckets = 0;
        double bucketCoverage = 1500;
        double bucketPrice = 15.0;
        double numOfCans = 0;
        double canCoverage = 300;
        double canPrice = 4.0;

        numOfBuckets = area / bucketCoverage;
        numOfCans = area / canCoverage;

        System.out.println("you need "+numOfBuckets+ " buckets");
        System.out.println("you need "+numOfCans+ " buckets");
        input.close();


    }
}
