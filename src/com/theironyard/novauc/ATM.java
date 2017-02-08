package com.theironyard.novauc;

import java.util.Scanner;

public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Person person = new Person(100, 0, 0);

    public static void main(String[] args) throws Exception {
	// write your code here

    person.chooseName();
    person.chooseQuery();

    }



}
