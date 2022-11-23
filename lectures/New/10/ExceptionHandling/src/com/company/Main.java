package com.company;

public class Main {


    static void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Please Input a Age Greater than 18");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
            try{
                validate(13);
            }catch (Exception e){
                System.out.println("Exception Occured : "+e);
            }
    }
}
