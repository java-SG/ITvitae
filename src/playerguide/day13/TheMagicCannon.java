package playerguide.day13;

/*
Day 13 Challenge: The Magic Cannon

Skorin, a member of Consolas’s wall guard, has constructed a magic cannon that draws power from two
gems: a fire gem and an electric gem. Every third turn of a crank, the fire gem activates, and the cannon
produces a fire blast. The electric gem activates every fifth turn of the crank, and the cannon makes an
electric blast. When the two line up, it generates a potent combined blast. Skorin would like your help to
produce a program that can warn the crew about which turns of the crank will produce the different
blasts before they do it.

A partial output of the desired program looks like this:

1: Normal
2: Normal
3: Fire
4: Normal
5: Electric
6: Fire
7: Normal

Objectives:

    Write a program that will loop through the values between 1 and 100 and display what kind of blast
    the crew should expect. (The % operator may be of use.)
    Change the color of the output based on the type of blast. (For example, red for Fire, yellow for
    Electric, and blue for Electric and Fire).
*/

        /*
        replacing:
            if (turn % 3 != 0 && turn % 5 != 0) {
                cannon = "Normal";
                } else if (turn % 3 == 0 && turn % 5 == 0) {
                    cannon = "Thermal Electrocution";
                    } else if (turn % 3 == 0) {
                        cannon = "Fire";
                        } else if (turn % 5 == 0) {
                            cannon = "Electric";
                        } else {
                            cannon = "Something went wrong";
                            }

        with:
        turn % 3 != 0 && turn % 5 != 0 ? "Normal" : turn % 3 == 0 && turn % 5 == 0 ? "Thermal Electrocution" : turn % 3 == 0 ? "Fire" : turn % 5 == 0 ? "Electric" : "Something went wrong";
        Retaining the use of operators as is used in standard if ()'s, removing the ()'s and then replacing the {}'s for ?'s, concatenating every new if statement with :'s, with a final : to define the final else, in this case as some sort of error catcher, since it should never come to that final else in this particular case, but it is required for an inline if
        */

public class TheMagicCannon {
    public static void main(String[] args) {
        for (int turn = 1; turn <= 100; turn++) {
            System.out.println(turn + ": " + (turn % 3 != 0 && turn % 5 != 0 ? "Normal" : turn % 3 == 0 && turn % 5 == 0 ? "\u001B[30mThermal Electrocution\u001B[0m" : turn % 3 == 0 ? "\u001B[31mFire\u001B[0m" : turn % 5 == 0 ? "\u001B[33mElectric\u001B[0m" : "Something went wrong"));
    }
}
