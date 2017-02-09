package com.theironyard.novauc;

import java.util.Scanner;

public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static User user = new User();

    public static void main(String[] args) throws Exception {
        // write your code here
        user.setMoney(350);

        System.out.println("Welcome ATM User");

        user.chooseName();
        user.chooseOption();








    }
}
