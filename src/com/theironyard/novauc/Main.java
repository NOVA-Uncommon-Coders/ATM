package com.theironyard.novauc;

import  java.util.Scanner;

public class Main {

    public static Scanner kb = new Scanner(System.in);
    public static Account name = new Account();
    public static ATMProgram program= new ATMProgram();

    public static void main(String[] args) throws Exception{
        name.AccountName();

    }
}
