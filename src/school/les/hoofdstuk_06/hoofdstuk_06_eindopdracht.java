package school.les.hoofdstuk_06;

import java.util.ArrayList;
import java.util.Scanner;

public class hoofdstuk_06_eindopdracht {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What value would you like to add to the Queue?");
        int inputValue = input.nextInt();

        FIFO x = new FIFO();
       /* for (int i = 0; i < 15; i++) {
            x.add(inputValue);
            inputValue += 1;
        }

        */

        x.add(inputValue);
        x.print();
        x.printReverse();

    }
}
