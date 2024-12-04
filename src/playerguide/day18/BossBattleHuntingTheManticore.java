package playerguide.day18;

import java.util.Scanner;

public class BossBattleHuntingTheManticore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Player 1
        // Declare variables
        String posStringManticore;
        int posManticore = 0;

        // Input
        System.out.println("Player 1, how far away from the city do you want to station the Manticore??");
        for (int i = 0; i < 1; i++) {
            posStringManticore = input.nextLine();
            if (posStringManticore.matches("[0-9]+")) {
                if (Integer.parseInt(posStringManticore) >= 25 && Integer.parseInt(posStringManticore) <= 100) {
                    System.out.println("The Manticore has been stationed at a distance of " + posStringManticore + " metres.\nThe battle is about to start.");
                    i = 1;
                    posManticore = Integer.parseInt(posStringManticore);
                    try {
                        Thread.sleep(3000); // Goes to sleep for x milliseconds
                    } catch (InterruptedException e) {
                        System.out.println("The Manticore crashed!");
                    }
                    System.out.println("\n".repeat(50)); // At roughly 1125000 is really clears the console but stores like 1GB memory for all those empty lines, not very useful
                } else if (Integer.parseInt(posStringManticore) < 25) {
                    System.out.println("The Manticore will be stationed way too close to the city!\nThe close range heavy artillery will surely destroy the Manticore in mere seconds, station the Manticore between 25 and 100 metres.");
                    System.out.println("Input is incorrect, make sure the input is a whole number within the desired range (25-100), try again.");
                    --i;
                } else if (Integer.parseInt(posStringManticore) > 100) {
                    System.out.println("The Manticore is stationed too far, re-station the Manticore at a closer range to commence the battle on the city of Consolas");
                    System.out.println("Input is incorrect, make sure the input is a whole number within the desired range (25-100), try again.");
                    --i;
                }
            }
        }

        // Player 2
        // Declare and initialize variables
        int turn = 1;
        int cityLives = 15;
        int cityLivesMax = 15;
        int manticoreLives = 10;
        int manticoreLivesMax = 10;
        int cannonDamage;
        int posAtk = 0;
        String posStringAtk;
        String cannonAmmo;
        boolean battleEnd = false;

        // Input and start
        System.out.println("Player 2, it is your turn to defend the city\nMan the cannons!");
        while (!battleEnd) {
            System.out.println("Status Update:\nTurn = " + turn + "\nCity lives = (" + cityLives + "/" + cityLivesMax + ")\nManticore lives = (" + manticoreLives + "/" + manticoreLivesMax + ").\nTake a shot player 1!");
            for (int i = 0; i < 1; i++) {
                posStringAtk = input.nextLine();
                if (posStringAtk.matches("[0-9]+")) {
                    posAtk = Integer.parseInt(posStringAtk);
                    if (posAtk >= 25 && posAtk <= 100) {

                        // Attack is valid
                        if (posAtk == posManticore) {
                            // Only when the Manticore gets hit cannonAmmo and cannonDamage are re-calculated to save processing time if it's not valid
                            cannonAmmo = (turn % 3 != 0 && turn % 5 != 0 ? "Normal" : turn % 3 == 0 && turn % 5 == 0 ? "\u001B[30mThermal Electrocution\u001B[0m" : turn % 3 == 0 ? "\u001B[31mFire\u001B[0m" : turn % 5 == 0 ? "\u001B[33mElectric\u001B[0m" : "There is no ammo!");
                            cannonDamage = (turn % 3 != 0 && turn % 5 != 0 ? 1 : turn % 3 == 0 && turn % 5 == 0 ? 5 : turn % 3 == 0 ? 3 : turn % 5 == 0 ? 3 : 1);
                            manticoreLives -= cannonDamage; // Manticore takes damage
                            System.out.println("The round was a DIRECT HIT!\nThe Manticore has taken " + cannonAmmo + " (" + cannonDamage + " damage)"); // Update player about how much damage is dealt
                        } else if ((posAtk >= (posManticore - 2)) && (posAtk <= (posManticore + 2)) && !(posAtk == posManticore)) {
                            System.out.println("The cannon round " + ((posAtk < posManticore) ? "slightly fell short!" : "slightly overshot!"));
                        } else {
                            System.out.println("The cannon round missed it's mark, try again before the Manticore destroys the City!");
                        }

                        // No matter if the player 1 hits the target, the manticore will always fire first!
                        --cityLives;
                        // Update turn only when the turn was valid
                        turn++;
                        // To ensure the for loop break to end the turn after a valid entry
                        i = 1;
                    } else {
                        System.out.println("The attack position is not within boundary\n" + ((posAtk < 25) ? "Within 25 metres, the heavy STA would step in and obliterate any aerial object or aircraft in seconds, \nthe Manticore is definitely not that close!" : "The cannon rounds cannot reach targets beyond 100 metres!"));
                        --i;
                    }
                }

                if (cityLives <= 0) {
                    System.out.println("The City of Consolas has been destroyed!\nPlayer 1 is victorious!");
                    battleEnd = true;
                } else if (manticoreLives <= 0) {
                    System.out.println("The Manticore has been terminated, the City of Consolas is safe!\nPlayer 2 is victorious!");
                    battleEnd = true;
                } else if (cityLives <= 0 && manticoreLives == 0) {
                    System.out.println("Against all odds, the Manticore and the City of Consolas have met their end in mutual destruction.");
                    battleEnd = true;
                }
            }
            System.out.println("-".repeat(30));
        }
    }
}