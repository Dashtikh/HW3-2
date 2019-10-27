package com.company;

public class passexp {
    public class pass extends Throwable{

    }
    public static void pass(int a) throws CorrectExp{
        System.out.println("checking pass ...");
        if(a==1234){
            System.out.println("pass accepted !");
        }
        else throw new CorrectExp("wrong pass");
    }
}
