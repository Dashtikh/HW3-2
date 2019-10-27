package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CorrectExp {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        passexp pass = new passexp();
        usernameexp use = new usernameexp();
        System.out.println("insert your username !");
        String user=scanner.nextLine();
        System.out.println("insert your password");
        int a=scanner.nextInt();
        pass.pass(a);
        use.user(user);
    }
}
