import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SimulasTest {

    public enum ChestState {
        OPEN("open", "open"),
        CLOSED("closed", "close"),
        LOCKED("locked", "lock"),
        UNLOCKED("open", "unlock"),
        DESTROYED("destroyed", "destroy");

        private final String description; // For encapsulation, instead of making it public
        private final String action;

        ChestState(String description, String action) {
            this.description = description;
            this.action = action;
        }

        public String getDescription() {
            return description;
        }

        public String getAction() {
            return action;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // For input

        // Initialize the program variables
        ChestState[] states = ChestState.values();
        ChestState chestState = states[(int) (Math.random() * 3)]; // Start with random state
        boolean interactChest = true;

        while (interactChest) {
            String choiceList = ""; // Declare String for choiceList to be iterated with states[i]
            for (int i = 0; i < states.length; i++) {
                choiceList += ((i == states.length - 1) ? " or " : "") + "{" + states[i].getAction().toUpperCase() + "}" + ((i < states.length - 2) ? ", " : "");
            }

            // Todo Dump prints to a function to be called
            System.out.println("What action would you like to perform on the Chest?");
            System.out.println("Chest is currently " + chestState.getDescription());
            System.out.println("You can check the state of the Chest or try to " + choiceList +" it.");
            String action = input.nextLine().trim().toUpperCase();

//            String msgAction = "The chest " + (action.equals(chestState.getAction().toUpperCase()) ? "has already been " : "is ") + chestState.getDescription() + ".";
//            String msgState = "The chest is " + (action.equals("STATE") ? "currently " : "") + chestState.getDescription() + ".";
//
//            if (action.equals("STATE")) {
//                System.out.println(msgState);
//            }
//
//            if (action.equals(chestState.getAction().toUpperCase())) {
//                System.out.println(msgAction);
//            } else if (action.equals("OPEN") && (ChestState.CLOSED)) // Not logical to branch out logic outside ENUM without switch, put complex logic in methods inside ENUMs instead

            if (chestState == ChestState.DESTROYED) {
                System.out.println("The chest was destroyed, there is no point to look further.");
                interactChest = false;
            } else {
                switch (action) {
                    case "STATE":
                        System.out.println("The chest is currently " + chestState.getDescription() + ".");
                        break;
                    case "OPEN":
                        if (chestState == ChestState.CLOSED) {
                            chestState = ChestState.OPEN;
                            System.out.println("The chest is now " + chestState.getDescription() + ".");
                        } else if (chestState == ChestState.LOCKED) {
                            System.out.println("You can't open a " + chestState.getDescription() + " chest!");
                        } else {
                            System.out.println("The chest is already " + chestState.getDescription() + "!");
                        }
                        break;
                    case "CLOSE":
                        if (chestState == ChestState.OPEN) {
                            chestState = ChestState.CLOSED;
                            System.out.println("The chest is now closed.");
                        } else if (chestState == ChestState.LOCKED) {
                            System.out.println("You can't close a locked chest!");
                        } else {
                            System.out.println("The chest is already closed!");
                        }
                        break;
                    case "LOCK":
                        if (chestState == ChestState.CLOSED) {
                            chestState = ChestState.LOCKED;
                            System.out.println("The chest is now locked.");
                        } else if (chestState == ChestState.OPEN) {
                            System.out.println("You can't lock an open chest!");
                        } else {
                            System.out.println("The chest is already locked!");
                        }
                        break;
                    case "UNLOCK":
                        if (chestState == ChestState.LOCKED) {
                            chestState = ChestState.CLOSED;
                            System.out.println("The chest is now unlocked.");
                        } else if (chestState == ChestState.OPEN) {
                            System.out.println("The chest is already unlocked!");
                        } else {
                            System.out.println("The chest is already unlocked!");
                        }
                        break;
                    case "DESTROY":
                        chestState = ChestState.DESTROYED;
                        System.out.println("The chest has been " + chestState.getDescription() + ".");
                        break;
                    default:
                        System.out.println("Invalid action. Please enter {STATE}, {OPEN}, {CLOSE}, {LOCK}, or {UNLOCK}.");
                        break;
                }

                // Ask if the user wants to perform another action
                System.out.println("\nWould you like to perform another action on the chest? (yes/no)");
                String choice = input.nextLine().trim().toLowerCase();
                if (choice.equals("no") || choice.equals("n")) {
                    interactChest = false;
                    System.out.println("Goodbye!");
                }
            }
        }
    }
}
