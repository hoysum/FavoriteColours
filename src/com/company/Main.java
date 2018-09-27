package com.company;
/*Favorite Colours

Write an application for a person to submit information about themselves. They should submit the following:
        - Name
        - E-mail address
        - Favourite colour
        You should be able to enter this for multiple people.
        When you are done, display the list of people, along with their e-mail addresses and favourite colours in a table.
        Work out what classes to create in this exercise.*/
//person class


import javax.xml.transform.OutputKeys;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Scanner;

public class Main {

    //while loop

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> theirInfo = new ArrayList<>();

        System.out.println("Do you want to enter a name? Yes or No");
        String answ0.er = keyboard.nextLine();
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("What is your name?");
            String userInput = keyboard.nextLine();

            //Declare variable Name

            Person thePerson = new Person(); //each person
            thePerson.setName(userInput);

            //Declare email

            System.out.println(".What is your email?");
            String userInputEmail = keyboard.nextLine();

            thePerson.setEmail(userInputEmail);


            //Declare color

            System.out.println("What is your favorite colour?");
            String userInputColour = keyboard.nextLine();


            thePerson.setColour(userInputColour);
            //assign colour comment to color variable
            theColor.setFeedback(userInput);

            //how to store list
            Grey: OK
            Blue:  That's a nice colour!
            Red:    It pops!
                    Other: No Comment

            System.out.println("Do you want to enter another name? Enter Yes or No");
            answer = keyboard.nextLine();
            theirInfo.add(thePerson);
        }

//
            for (Person eachPerson : theirInfo) {
                System.out.println(eachPerson.getName());
                System.out.println(eachPerson.getEmail());
                System.out.println(eachPerson.getColour());
            }

        //Collection.sort(theirInfo);
        //System.out.println("Sort theirInfo:\n");
//          //for (String theName:personInfo)
//
//        {
//         System.out.println();
//


    }
}
