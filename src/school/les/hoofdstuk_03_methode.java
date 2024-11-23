package school.les;

import java.util.Arrays;

public class hoofdstuk_03_methode {

    public int[] lucasGetallen = new int[50];

    public hoofdstuk_03_methode(int natuurlijkGetal) {
        if (natuurlijkGetal > 0 && natuurlijkGetal <= lucasGetallen.length) {
            // Re-used code from Test
            lucasGetallen[0] = 2;
            lucasGetallen[1] = 1;
            boolean stopGoing = false;
            int n = 2;
            while (!stopGoing) {
                if ((lucasGetallen[n - 1] + lucasGetallen[n - 2]) < 0) {
                    break;
                }
                lucasGetallen[n] = lucasGetallen[n - 1] + lucasGetallen[n - 2];
                if (lucasGetallen[n] < 0) {
                    // Swapped System.out.println()'s from old and test code
                    // System.out.println(lucasGetallen[n - 1] + " is the final Integer within range of Integer values for lucasNumbers");
                    break;
                }
                n++;
            }
            for (int i = 0; i < natuurlijkGetal; i++) {
                System.out.print(lucasGetallen[i] + (i < natuurlijkGetal - 1 ? ", " : "\n"));
            }
        } else if (natuurlijkGetal < 0) {
            System.out.println("The number is negative!");
        }
    }

        // Old code from hardcoded array: int[] LucasGetallen = {2, 1, 3, 4, 7, 11, 18};
        /*
        if (natuurlijkGetal > 0 && natuurlijkGetal <= lucasGetallen.length) {
            for (int i = 0; i < natuurlijkGetal; i++) {
                System.out.print(lucasGetallen[i] + (i < natuurlijkGetal - 1 ? ", " : "\n"));
            }
        } else if (natuurlijkGetal < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("This is not a number or its out of bound of the array!");
        }
        */
    }