package lab1_main;

import java.util.Scanner;

public class InputManager {
    // this file acts as the manager class
    public static String getUserInput() {
        Scanner inputObj = new Scanner(System.in); //create scanner obj
        System.out.println("-- Input Phone Number: --");
        String input = inputObj.nextLine(); //actually get user input
        return input;
    }
    public static String convertPhoneNumber(String phoneNumber){
        String[] phoneNumberInputCharStrArray = phoneNumber.split(""); // split the string of the user's input into a string array

        // use a for loop to convert the entire user input to numbers
        // we need to do very frustrating type conversion for this to work
        char[] phoneNumberInputCharArray = new char[phoneNumberInputCharStrArray.length];
        char[] finalPhoneNumberArray = new char[phoneNumberInputCharArray.length];
        for(int i = 0; i < phoneNumberInputCharStrArray.length; i++){
            phoneNumberInputCharArray[i] = phoneNumberInputCharStrArray[i].charAt(0);
        }

        for(int i = 0; i < phoneNumberInputCharArray.length; i++){ //finally -_-
            String toAppend = phoneKeyConvert.processCharacters(phoneNumberInputCharArray[i]);
            char toAppendChar = toAppend.charAt(0);
            finalPhoneNumberArray[i] = toAppendChar;

        }
        // finally, convert the finalPhoneNumberArray character array to a string:
        String finalPhoneNumber = new String(finalPhoneNumberArray);
        return finalPhoneNumber;
    }
}
