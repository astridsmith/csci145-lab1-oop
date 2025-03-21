// Owen Smith - Lab 1
package lab1_main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chooser
        Scanner choice = new Scanner(System.in); //create scanner obj
        System.out.println("-- Choose Assignment to run (1 or 2): --");
        String input = choice.nextLine();
        if(input.equals("1")){
            assignmentOne();
        } else if(input.equals("2")){
            assignmentTwo();
        } else {
            System.out.println("Selection Error. Please Choose 1 or 2.");
            main(new String[]{}); // needs to be called this way for recursion to work, curly braces and all. inferred correctly based off of weird chatgpt response.
        }
    }

    public static void assignmentOne(){
        //"Phone Keypads"
        //let's get user input with the inputManager class
        String phoneInput = InputManager.getUserInput();
        String convertedPhoneNumber = InputManager.convertPhoneNumber(phoneInput); // refactored so that a lot of code that was reusable in main is now available in convertPhoneNumber and usable independently.
        System.out.println(convertedPhoneNumber);
    }

    public static void assignmentTwo() {

    }
}