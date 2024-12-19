package school.les.hoofdstuk_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hoofdstuk_06_eindopdracht {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputValue;
        int indexValue;
        String function = "";
        String another;
        boolean anotherChoice = true;
        boolean functionChoice = true;

        FIFO x = new FIFO();

        String[] functionArray = {"add", "remove", "peek", "empty", "size", "print", "clear", "clear n", "print reverse", "jump the queue", "to string", "equals (disabled)", "index", "last", "exit"};
        while (anotherChoice) {
            function = "";
            while (functionChoice) {
                System.out.println("What action would you like to preform:\nEntry is exactly as in the list, not case sensitive");
                for (String functionIndex : functionArray) {
                    System.out.print(" - " + functionIndex + "\n");
                }
                function = input.nextLine().toLowerCase();
                if (Arrays.toString(functionArray).contains(function)) {
                    functionChoice = false;
                } else {
                    System.out.println("This function does not match any available function, try again.");
                }
            }

            switch (function) {
                case "exit":
                    System.out.println("Exiting program.");
                    anotherChoice = false;
                    break;
                case "add":
                    System.out.print("What value would you like to add to the Queue? ");
                    inputValue = input.nextInt();
                    input.nextLine();
                    x.add(inputValue);
                    break;
                case "remove":
                    System.out.print("What value index would you like to remove from the Queue? ");
                    indexValue = input.nextInt();
                    input.nextLine();
                    x.remove(indexValue);
                    break;
                case "peek":
                    System.out.println(x.peek() + " is the first number in the Queue.");
                    break;
                case "empty":
                    System.out.println((x.isEmpty()) ? "The Queue is empty." : "The Queue is not empty.");
                    break;
                case "size":
                    System.out.println("The Queue is currently " + x.size() + " numbers long.");
                    break;
                case "print":
                    x.print();
                    break;
                case "clear":
                    x.clear();
                    break;
                case "clear n":
                    System.out.print("What value index would you like to clear from the Queue? ");
                    indexValue = input.nextInt();
                    input.nextLine();
                    x.clear(indexValue);
                    break;
                case "print reverse":
                    x.printReverse();
                    break;
                case "jump the queue":
                    System.out.print("What index place would you like to jump to in the Queue?\n(The Queue is currently: " + x.size() + " numbers long and consists of: ");
                    x.print();
                    indexValue = input.nextInt();
                    System.out.println("and which value would you like to jump in to the Queue?");
                    inputValue = input.nextInt();
                    input.nextLine();
                    x.jumpTheQueue(indexValue, inputValue);
                    break;
                case "to string":
                    System.out.println(x);
                    break;
                case "index":
                    System.out.print("What index value would you like the value of in the Queue? ");
                    indexValue = input.nextInt();
                    input.nextLine();
                    System.out.println(x.indexOf(indexValue) + " is the value of the index value " + indexValue);
                    break;
                case "last":
                    System.out.print("What value would you like the last index of in the Queue? ");
                    inputValue = input.nextInt();
                    input.nextLine();
                    System.out.println(x.lastIndexOf(inputValue) + " is the last index value of the value " + inputValue);
                    break;
                /* Didnt understand the point of this function?
                case "equals":
                    Queue q[] = new Queue(); // Queue is abstract? No idea whats going on, but Queue is never mentioned to become a class or method to be called so how could it be instantiated for the equals method with (Queue q) parameters?
                    q = {1, 2, 3};
                    System.out.println(x.equals(q));
                    break;
                */
                default:
                    break;
            }

            // Sleep for 2 seconds so user can see output of function properly
            /*
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("-- Something went wrong --");
            }
            */

            if (anotherChoice) {
                functionChoice = true;
            }

        }
    }
}