package playerguide.day04;

/*
Day 4- Challenge: The Variable Shop

You see an old shopkeeper struggling to stack up variables in a window display. “Hoo-wee! All these
variable types sure are exciting but setting them all up to show them off to excited new programmers
like yourself is a lot of work for these aching bones,” she says. “You wouldn’t mind helping me set up this
program with one variable of every type, would you?”

Objectives:
Build a program with a variable of all eight primitive Java types (as well as the ‘text’ type).
Assign each of them a value using a literal of the correct type.
Use System.out.println to display the contents of each variable.
 */

// importing the Java Scanner utility for user input
import java.util.Scanner;

public class _TheVariableShop {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("The first type is 'byte', let's give it a value: ");
            String myStringByte = input.nextLine();
            byte myByte = Byte.valueOf(myStringByte);

            System.out.println("The second type is 'short', let's give it a value as well: ");
            String myStringShort = input.nextLine();
            short myShort = Short.valueOf(myStringShort);

            System.out.println("The third type is 'int', let's give it a value: ");
            String myStringInt = input.nextLine();
            int myInt = Integer.valueOf(myStringInt);

            System.out.println("The fourth type is 'long', let's give it a really long value: ");
            String myStringLong = input.nextLine();
            long myLong = Long.valueOf(myStringLong);

            System.out.println("The fifth type is 'float', let's give it a value with decimals: ");
            String myStringFloat = input.nextLine();
            float myFloat = Float.valueOf(myStringFloat);

            System.out.println("The sixth type is 'double', let's give it a value, but don't enter it doubly!: ");
            String myStringDouble = input.nextLine();
            double myDouble = Double.valueOf(myStringDouble);

            System.out.println("The seventh type is 'boolean', let's give it a value: ");
            String myStringBoolean = input.nextLine();
            boolean myBoolean = Boolean.valueOf(myStringBoolean);

            System.out.println("The eighth type is 'char', let's give it a charac- i mean value: ");
            String myStringChar = input.nextLine();
            char myChar = myStringChar.charAt(0);
            int myCharCode = (int) myChar;
            String myCharCodeString = "'\\u" + String.format("%04X", myCharCode) + "'";

            System.out.println(
                    "byte value = " + myByte + " and is a " + ((Object)myByte).getClass().getName() + " type value" +
                            "\n" +
                            "short value = " + myShort + " and is a " + ((Object)myShort).getClass().getName() + " type value" +
                            "\n" +
                            "int value = " + myInt + " and is a " + ((Object)myInt).getClass().getName() + " type value" +
                            "\n" +
                            "long value = " + myLong + " and is a " + ((Object)myLong).getClass().getName() + " type value" +
                            "\n" +
                            "float value = " + myFloat + " and is a " + ((Object)myFloat).getClass().getName() + " type value" +
                            "\n" +
                            "double value = " + myDouble + " and is a " + ((Object)myDouble).getClass().getName() + " type value" +
                            "\n" +
                            "boolean value = " + myBoolean + " and is a " + ((Object)myBoolean).getClass().getName() + " type value" +
                            "\n" +
                            "char value = " + myChar + "(" + myCharCodeString + ")" + " and is a " + ((Object)myChar).getClass().getName() + " type value");
        }
    }
