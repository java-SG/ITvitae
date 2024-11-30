package school.games;

import java.util.Arrays;
import java.util.Scanner;

/*
Some of the values have been set to variables to make them more adaptive to make the game have a flexible field size, though its not fully flexible yet
will try to make it flexible to allow any square-sized tictactoe, for higher complexity, like a 4 by 4 field.
making the regex for input checks is where im stuck currently, making the printed field flexible should be ezpz still
*/

public class tictactoe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] field = new char[3][3];
        char mark;
        char playerOneMark = 'O';
        char playerTwoMark = 'X';
        String inputCheckString = "";
        String moveInput;
        StringBuilder fieldCheckString;
        String choiceNewRound;
        boolean turnEnd = false;
        boolean roundEnd = false;
        boolean gameEnd = false;
        int moveCount = 0;
        int playerCurrent = 0;
        int playerOneVictories = 0;
        int playerTwoVictories = 0;

        while (!gameEnd) {
            while (!roundEnd) {
                // Reset field
                for (int x = 0; x < field.length; x++) {
                    for (int z = 0; z < field.length; z++) {
                        field[z][x] = '_';
                    }
                }

                // Flips a coin between 1 and 2
                playerCurrent = ((int) (Math.random() * 2) + 1);

                // Re-initialize inputCheckString to clear the String of moves already made
                inputCheckString = "";

                // Reset moveCount
                moveCount = 0;

                // Coin flip with inline if for player 1 or 2 start and empty field start
                System.out.println("The field is set and the game has started!\nPlayer One has mark [" + playerOneMark + "] and player Two has mark [" + playerTwoMark + "]\nPlayer " + playerCurrent + " makes the first move!");
                System.out.println("  A  B  C");
                System.out.println("1" + Arrays.toString(field[0]).replace(", ", "]["));
                System.out.println("2" + Arrays.toString(field[1]).replace(", ", "]["));
                System.out.println("3" + Arrays.toString(field[2]).replace(", ", "]["));

                while (!turnEnd) {
                    System.out.println("Make a move player " + playerCurrent);
                    mark = (playerCurrent == 1) ? playerOneMark : playerTwoMark; // Switches between player 1 and 2 marks
                    // Forces user to provide correct input, always a-c.ignoreCase() and 1-3 or vice versa
                    for (int i = 0; i < 1; i++) {
                        moveInput = input.nextLine();
                        if (moveInput.length() == 1) moveInput += " ";
                        // Boolean checks for the if statement, if input is a-c.ignoreCase() and 1-3 or vice versa
                        boolean CR = moveInput.length() == 2 && moveInput.substring(0, 1).toUpperCase().matches("[A-C]") && moveInput.substring(1, 2).matches("[1-3]") && !inputCheckString.contains(moveInput.substring(0, 1).toUpperCase() + moveInput.substring(1, 2));
                        boolean RC = moveInput.length() == 2 && moveInput.substring(0, 1).matches("[1-3]") && moveInput.substring(1, 2).toUpperCase().matches("[A-C]") && !inputCheckString.contains(moveInput.substring(1, 2).toUpperCase() + moveInput.substring(0, 1));
                        if (RC || CR) {
                            System.out.println("Player " + playerCurrent + " has entered: " + moveInput.toUpperCase());
                            if (!inputCheckString.equals("")) inputCheckString += ", ";
                            if (CR) {
                                // Check prints for ROW-COLUMN
                                // System.out.println((Integer.valueOf(moveInput.substring(1, 2)) - 1));
                                // System.out.println((((int) moveInput.substring(0, 1).toUpperCase().charAt(0) - 64) - 1));
                                field[Integer.valueOf(moveInput.substring(1, 2)) - 1][((int) moveInput.substring(0, 1).toUpperCase().charAt(0) - 64) - 1] = mark;
                                inputCheckString = inputCheckString + moveInput.substring(0, 1).toUpperCase().charAt(0) + moveInput.substring(1, 2);
                            } else if (RC) {
                                // Check prints for ROW-COLUMN
                                // System.out.println((((int) moveInput.substring(1, 2).toUpperCase().charAt(0) - 64) - 1));
                                // System.out.println((Integer.valueOf(moveInput.substring(0, 1)) - 1));
                                field[Integer.valueOf(moveInput.substring(0, 1)) - 1][((int) moveInput.substring(1, 2).toUpperCase().charAt(0) - 64) - 1] = mark;
                                inputCheckString = inputCheckString + moveInput.substring(1, 2).toUpperCase().charAt(0) + moveInput.substring(0, 1);
                            }
                            // System.out.println("Moves so far have been: " + inputCheckString); // Check to see the moves that have been made so far, could be useful for a game like Battleships
                            System.out.println("  A  B  C");
                            System.out.println("1" + Arrays.toString(field[0]).replace(", ", "]["));
                            System.out.println("2" + Arrays.toString(field[1]).replace(", ", "]["));
                            System.out.println("3" + Arrays.toString(field[2]).replace(", ", "]["));
                            i = 1; // To break the correct-input loop
                        } else {
                            System.out.println("Input is incorrect or has been entered already, try again");
                            --i;
                        }
                    }

                    // Move was valid, count +1
                    moveCount++;

                    if (moveCount < field.length * field[0].length) {
                        fieldCheckString = new StringBuilder();
                        // i < (2 * (field.length * field[0].length)) is for looping through the field vertically and horizontally completely
                        for (int i = 0, x = 0, y = 0; i < (2 * (field.length * field[0].length)); i++) {
                            if (i < (field.length * field[0].length)) {
                                y = i / field[0].length; // Makes sure y is +1 every time i reaches the vertical .length of the array
                                x = i % field[0].length; // Makes sure x loops through 0,1,2 for every 3 i's in i++
                            } else {
                                y = (i - (field.length * field[0].length)) % field.length; // Makes sure y loops through 0,1,2 for every 3 i's in i++
                                x = (i - (field.length * field[0].length)) / field.length; // Makes sure x is +1 every time i reaches the horizontal .length of the array
                            }
                            fieldCheckString.append(field[y][x]);
                        }

                        // Loops through diagonals
                        for (int i = 0, x = 0, y = 0; i < (field.length + field[0].length); i++) {
                            if (i < field.length) {
                                y = i; // along with x = i, moves diagonally across the field from top left to bottom right
                                x = i; // as above
                            } else {
                                y = i % field.length; // Ensures it only loops through 0 to .length - 1, setting it to y = i, causes it to exceed the boundary at i = length, before breaking out of the loop
                                x = (field.length - 1) - (i % field.length); // moves from x at 0 through .length diagonally
                            }
                            fieldCheckString.append(field[y][x]);
                        }

                        // Inserts a comma after every .length of characters in the string to create a clear split for each .length-in-a-row
                        for (int i = 1; i < ((field.length * field[0].length) - 1); i++) {
                            fieldCheckString.insert(((field[0].length + 1) * i) - 1, ",");
                        }
                        // System.out.println(fieldCheckString); // Check for Seeing the total check String
                        // System.out.println(Character.toString(playerOneMark).repeat(field.length)); // Check to see if the String it checks in the built String is going to match
                        // System.out.println(Character.toString(playerTwoMark).repeat(field.length)); // as above

                        if (fieldCheckString.indexOf(Character.toString(playerOneMark).repeat(field.length)) >= 0 || fieldCheckString.indexOf(Character.toString(playerTwoMark).repeat(field.length)) >= 0) {
                            if (playerCurrent == 1) {
                                playerOneVictories++;
                            } else {
                                playerTwoVictories++;
                            }
                            System.out.println("Player " + playerCurrent + " wins the round!");
                            System.out.println("The current scores are {Player One: " + playerOneVictories + "} - {Player Two: " + playerTwoVictories + "}");
                            turnEnd = true;
                        }
                        playerCurrent = 3 - playerCurrent; // Toggles between 1 and 2 every turn loop
                    } else {
                        System.out.println("It's a draw!");
                        System.out.println("The current scores are {Player One: " + playerOneVictories + "} - {Player Two: " + playerTwoVictories + "}");
                        turnEnd = true;
                    }
                }
                while (turnEnd) {
                    System.out.println("Start another round? [Yes/No]");
                    choiceNewRound = input.nextLine();
                    if (choiceNewRound.toLowerCase().equals("yes") || choiceNewRound.toLowerCase().equals("y")) {
                        roundEnd = false;
                        turnEnd = false;
                    } else if (choiceNewRound.toLowerCase().equals("no") || choiceNewRound.toLowerCase().equals("n")) {
                        System.out.println("Game shutting down.");
                        roundEnd = true;
                        gameEnd = true;
                        turnEnd = false;
                    } else {
                        System.out.println("Answer yes or no");
                    }
                }
            }
        }
    }
}