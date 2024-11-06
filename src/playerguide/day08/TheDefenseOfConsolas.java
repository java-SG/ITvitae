package playerguide.day08;

/*
Day 8: Challenge - The Defense of Consolas

The Uncoded One has begun an assault on the city of Consolas; the
situation is dire. From a moving airship called the Manticore,
massive fireballs capable of destroying city blocks are being
catapulted into the city.
The city is arranged in blocks, numbered like a chessboard. You can assume its defenders are smart, so they can also move outside the city to say row -1 if needed.
The city’s only defense is a movable magical barrier, operated by a
squad of four that can protect a single city block by putting
themselves in each of the target’s four adjacent blocks, as shown in
the picture to the right.
For example, to protect the city block at (Row 6, Column 5), the
crew deploys themselves to (Row 6, Column 4), (Row 5, Column 5),
(Row 6, Column 6), and (Row 7, Column 5). (you may want to make a sketch of the situation on a piece of paper)

The good news is that if we can compute the deployment locations fast enough, the crew can be
deployed around the target in time to prevent catastrophic damage to the city for as long as the siege
lasts. The City of Consolas needs a program to tell the squad where to deploy, given the anticipated
target. Something like this:

Target Row? 6
Target Column? 5
Deploy to:
(6, 4)
(5, 5)
(6, 6)
(7, 5)

Objectives:
Ask the user for the target row and column.
Compute the neighboring rows and columns of where to deploy the squad.
Display the deployment instructions in a different color of your choosing.
Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.
 */

// importing the Java Scanner utility for user input
import java.util.Scanner;
import java.awt.Toolkit;

public class TheDefenseOfConsolas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What row is to be defended?");
        int RowTarget = input.nextInt();
        System.out.println("What column is to be defended?");
        int ColumnTarget = input.nextInt();
        System.out.println("R" + RowTarget + "C" + ColumnTarget + " is the target to be defended, the crew will be deployed to " +
                "R" + (RowTarget - 1) + "C" + (ColumnTarget + 0) + ", " +
                "R" + (RowTarget + 0) + "C" + (ColumnTarget + 1) + ", " +
                "R" + (RowTarget + 0) + "C" + (ColumnTarget - 1) + " and " +
                "R" + (RowTarget + 1) + "C" + (ColumnTarget + 0)
        );
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Toolkit is working!");
    }
}