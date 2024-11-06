package playerguide.day05;

/*
Day 5: 2/2-Challenge - The Triangle Farmer

As you pass through the fields near Arithmetica City, you encounter P-Thag, a triangle farmer, scratching
numbers in the dirt.
“What is all of that writing for?” you ask.
“I’m just trying to calculate the area of all of my triangles. They sell by their size. The bigger they are, the
more they are worth! But I have many triangles on my farm, and the math gets tricky, and I sometimes
make mistakes. Taking a tiny triangle to town thinking you’re going to get 100 gold, only to be told it’s
only worth three, is not fun! If only I had a program that could help me….” Suddenly, P-Thag looks at you
with fresh eyes. “Wait just a moment. You have the look of a Programmer about you. Can you help me
write a program that will compute the areas for me, so I can quit worrying about math mistakes and get
back to tending to my triangles? The equation I’m using is this one here,” he says, pointing to the formula,
etched in a stone beside him:

Area = base x height / 2

Objectives:
Write a program that lets you input the triangle’s base size and height.
Compute the area of a triangle by turning the above equation into code.
Write the result of the computation.
*/

// importing the Java Scanner utility for user input
import java.util.Scanner;

public class TheTriangleFarmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the triangle's base");
        String inputBase = input.nextLine();
        float valueBase = Float.valueOf(inputBase);

        System.out.println("Enter the value of the triangle's height");
        String inputHeight = input.nextLine();
        float valueHeight = Float.valueOf(inputHeight);

        System.out.println("The area of this triangle = " + (valueBase * valueHeight / 2));
    }
}
