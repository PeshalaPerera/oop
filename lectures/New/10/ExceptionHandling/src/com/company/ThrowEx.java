package com.company;


//explicitly throw and exception
public class ThrowEx {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("you are not above 18. So you cannot vote");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try {
            validate(13);
        }
        catch (ArithmeticException e){
            System.out.println("you are not above 18. So you cannot vote");
        }
        catch (Exception e){
            System.out.println("Error Generated");
        }
        System.out.println("rest of the code...");
    }
}
