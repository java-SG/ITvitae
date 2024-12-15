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

        String[] functionArray = {"add", "remove", "peek", "empty", "size", "print", "clear", "clear n", "print reverse", "jump the queue", "to string", "equals", "index", "last"};
        while (anotherChoice) {
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

            FIFO x = new FIFO();

            switch (function) {
                case "add":
                    System.out.print("What value would you like to add to the Queue? ");
                    inputValue = input.nextInt();
                    x.add(inputValue);
                    break;
                case "remove":
                    System.out.print("What value index would you like to remove from the Queue? ");
                    indexValue = input.nextInt();
                    x.remove(indexValue);
                    break;
                case "peek":
                    x.peek();
                    break;
                case "empty":
                    x.isEmpty();
                    break;
                case "size":
                    x.size();
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
                    x.clear(indexValue);
                    break;
                case "print reverse":
                    x.printReverse();
                    break;
                case "jump the queue":
                    System.out.print("What index place and value would you like to jump the Queue? ");
                    indexValue = input.nextInt();
                    System.out.print(", ");
                    inputValue = input.nextInt();
                    System.out.println();
                    x.jumpTheQueue(indexValue, inputValue);
                    break;
                case "to string":
                    x.toString();
                    break;
                case "index":
                    System.out.print("What index value would you like the value of in the Queue? ");
                    indexValue = input.nextInt();
                    x.indexOf(indexValue);
                    break;
                case "last":
                    System.out.print("What value would you like the last index of in the Queue? ");
                    inputValue = input.nextInt();
                    x.lastIndexOf(inputValue);
                    break;
                default:
                    break;
            }

            System.out.print("Would you like to use another function? (Yes/No) ");
            for (int i = 0; i < 1; i++) {
            another = input.nextLine().toLowerCase();
                if (another.equals("no") || another.equals("n")) {
                    i = 1;
                    anotherChoice = false;
                } else if (another.equals("yes") || another.equals("y")) {
                    i = 1;
                    functionChoice = true;
                } else {
                    System.out.println("Yes or No");
                    --i;
                }
            }
        }
    }
}
