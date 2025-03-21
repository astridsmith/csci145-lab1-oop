package lab1_main;
// pretty sure this is the object class
public class phoneKeyConvert {
    // This is where that switch statement will go
    static int getNumber(char digit){
        //System.out.println("DEBUG: getNumber has received an input of: " + digit);
        switch (Character.toUpperCase(digit)) {
            case 'A':
            case 'B':
            case 'C': return 2;
            case 'D':
            case 'E':
            case 'F': return 3;
            case 'G':
            case 'H':
            case 'I':return 4;
            case 'J':
            case 'K':
            case 'L': return 5;
            case 'M':
            case 'N':
            case 'O': return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S': return 7;
            case 'T':
            case 'U':
            case 'V': return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': return 9;
            default: System.out.println(digit + " is an invalid input! ");
                return(-1);
        }
    }
    static String processCharacters(char digit){
        if(digit == '-'){
            return "-";
        } else if(Character.isDigit(digit)) {
            return Character.toString(digit); // return numbers that are already numbers back to be appended
        } else {
            // letters only are passed to getNumber!
            return Integer.toString(getNumber(digit)); // this should be the main contact that the program has with getNumber (other than phoneTest)
        }
    }
}
