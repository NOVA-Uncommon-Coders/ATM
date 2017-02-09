package com.theironyard.novauc;
import java.util.Scanner;

public class ATM {
    public static Scanner input = new Scanner(System.in);
    public static Scanner choiceInput = new Scanner(System.in);
    public static ATMUser user = new ATMUser(Math.ceil(randomRange(1, 499.99)));

    public static void main(String[] args) throws Exception {
        user.Greeting();
        user.login();
        user.accessLoop();
    }
    /********************
     * Random finder
     *******************/
    public static double randomRange(double min, double max) {
        double range = (max - min);
        return (Math.random() * range) + min;
    }
    /********************
     * coinChecker
     * if statements were used
     * because today's lesson was
     * on program control
     * Still some rounding issues
     * likely caused by Math.floor()
     *******************/
    public static void coinChecker() throws Exception{
        System.out.print("Please enter a value: ");
        Scanner coinC = new Scanner(System.in);
       double checker = coinC.nextDouble();
       if (checker < 0){
           throw new Exception("Invalid coin amount");
       }
       double quarters = Math.floor(checker);
       double others = checker - quarters;
       int dimes = 0;
       int nickles = 0;
       int pennies = 0;

       quarters = quarters * 4;

       if(others >= .25){
           if (others >= .50){
               if (others >= .75){
                   others -= .75;
                   quarters += 3;
               }else {
                   others -= .50;
                   quarters += 2;
               }
           } else {
               others -= .25;
               quarters++;
           }
       }


       if(others >= .10){
           if (others >= .20){
               others -=.20;
               dimes += 2;
           } else {
               others -=.10;
               dimes++;
           }
       }
       if (others >= .05){
           others -= .05;
           nickles++;
       }
       if (others >= .01){
           if (others >= .02){
               if (others >= .03){
                   if (others >= .04 && others < .05){
                       others -= .04;
                       pennies+= 4;
                   }else {
                       others -= .04;
                       pennies += 3;
                   }
               }else {
                   others -= .02;
                   pennies += 2;
           }
           } else {
               others -= .01;
               pennies++;
           }
       }
       System.out.println("\nThe smallest number of coins is:");
       System.out.println("**********************");
       System.out.println("* Coin\t\tAmount   *");
       System.out.println("**********************");
       System.out.println("* Quarters\t\t" + (int)quarters + "\t *");
       System.out.println("* Dimes\t\t\t" + dimes + "\t *");
       System.out.println("* Nickles\t\t" + nickles + "\t *");
       System.out.println("* Pennies\t\t" + pennies + "\t *");
       System.out.println("**********************\n");



    }
}
