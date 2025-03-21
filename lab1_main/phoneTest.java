package lab1_main;
// test class
public class phoneTest {
    public static void main(String[] args) {
        // convert a letter directly (only works for letters):
        System.out.println("The digit is:" + phoneKeyConvert.getNumber('A'));
        // convert (or just check) any valid digit:
        System.out.println(phoneKeyConvert.processCharacters('a'));
        System.out.println(phoneKeyConvert.processCharacters('b'));
        System.out.println(phoneKeyConvert.processCharacters('c'));
        System.out.println(phoneKeyConvert.processCharacters('d'));
        // convert a phone number independently (possible after moving a lot of Main.main code into inputManager.convertPhoneNumber)
        System.out.println(InputManager.convertPhoneNumber("1-800-HelloWd"));
    }
}
