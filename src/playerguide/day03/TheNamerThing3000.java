package playerguide.day03;

/*
Day 3 Challenge: The Thing Namer 3000

As you walk through the city of Commenton, admiring its forward-slash-based architectural buildings, a
young man approaches you in a panic. “I dropped my Thing Namer 3000 and broke it. I think it’s mostly
working, but all my variable names got reset! I don’t understand what they do!” He shows you the
following program:

System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

“You gotta help me figure it out!”

Objectives:
Rebuild the program above on your computer.
Add comments near each of the four variables that describe what they store. You must use at least one of each comment type.
Find the bug in the text displayed and fix it.
Answer this question: Aside from comments, what else could you do to make this code more understandable?
*/

// importing the Java Scanner utility for user input
import java.util.Scanner;

public class TheNamerThing3000 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            /* Changed input.next() to input.nextLine() to force the next System.out.println
             * But it will discard any input passed the first whitespace
             */
            System.out.println("What kind of thing are we talking about?");
            String a = input.nextLine();
            System.out.println("How would you describe it? Big? Azure? Tattered?");
            // Same change to input.nextLine()
            String b = input.nextLine();
            String c = "of Doom";
            String d = "3000";
            // Removed "of" as it is duplicate in the print string due to String c already containing it
            System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
        }
    }
