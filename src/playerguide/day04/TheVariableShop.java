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

public class TheVariableShop {
    public static void main(String[] args) {

        byte myByte = -20;
        short myShort = 24;
        int myInt = 67;
        long myLong = 28749274;
        // Object casting before printing, less concise, but also works, is there a real difference? Probably less code if object is called multiple times
        Object myLongObj = (Object) myLong;
        float myFloat = 66.66667f;
        double myDouble = 3845737456738438473d;
        boolean myBoolean = true;
        char myChar = '\u0447';
        int myCharCode = (int) myChar;
        String myCharCodeString = "'\\u" + String.format("%04X", myCharCode) + "'";

        System.out.println(
                "byte value = " + myByte + " and is a " + ((Object) myByte).getClass().getName() + " type value" + "\n" +
                        "short value = " + myShort + " and is a " + ((Object) myShort).getClass().getName() + " type value" + "\n" +
                        "int value = " + myInt + " and is a " + ((Object) myInt).getClass().getName() + " type value" + "\n" +
                        "long value = " + myLong + " and is a " + myLongObj.getClass().getName() + " type value" + "\n" +
                        "float value = " + myFloat + " and is a " + ((Object) myFloat).getClass().getName() + " type value" + "\n" +
                        "double value = " + myDouble + " and is a " + ((Object) myDouble).getClass().getName() + " type value" + "\n" +
                        "boolean value = " + myBoolean + " and is a " + ((Object) myBoolean).getClass().getName() + " type value" + "\n" +
                        "char value = " + myChar + "(" + myCharCodeString + ")" + " and is a " + ((Object) myChar).getClass().getName() + " type value");
    }
}
