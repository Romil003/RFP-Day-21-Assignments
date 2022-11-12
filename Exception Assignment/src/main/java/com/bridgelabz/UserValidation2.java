package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation2 {

     String firstName ="^([A-Z]{1}+)([a-z]{2,}+)$";

     String lastName ="^([A-Z]{1}+)([a-z]{2,}+)$";

     String emailId ="^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$";

     String mobileNumber ="^([0-9]{2,4}+)\\ ([0-9]{10}+)$";

     String password ="^((?=.*?[#@$?])(?=.*?[A-Z])(?=.*?[0-9])[A-za-z0-9#@$?]{8,}+)$";

    public static void main(String[] args) {

        UserValidation2 user = new UserValidation2();
        Regex regex = (x,y) -> Pattern.matches(x,y);

        if(regex.check(user.firstName, "Romil")){
            System.out.println("Correct Value !!");
        }
        else {
            System.out.println("Value is incorrect !!!");
        }

        if(regex.check(user.lastName, "ghadge")){
            System.out.println("Correct Value !!");
        }
        else {
            System.out.println("Value is incorrect !!!");
        }

        if(regex.check(user.emailId, "Rakya@11.com")){
            System.out.println("Correct Value !!");
        }
        else {
            System.out.println("Value is incorrect !!!");
        }

        if(regex.check(user.mobileNumber, "121343")){
            System.out.println("Correct Value !!");
        }
        else {
            System.out.println("Value is incorrect !!!");
        }

        if(regex.check(user.password, "bobby11")){
            System.out.println("Correct Value !!");
        }
        else {
            System.out.println("Value is incorrect !!!");
        }

    }
}
