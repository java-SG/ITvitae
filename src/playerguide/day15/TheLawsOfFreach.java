package playerguide.day15;

/*
Day 15 Challenge The Laws of Freach

The town of Freach recently had an awful looping disaster. The lead investigator found that it was a faulty
++ operator in an old for loop, but the town council has chosen to ban all loops but the foreach loop.
Yet Freach uses the code presented earlier in this level to compute the minimum and the average value
in an int array. They have hired you to rework their existing for-based code to use foreach loops
instead.

Objectives:

    Start with the code for computing an array’s minimum and average values (see below)

int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
for (int index = 0; index < array.length; index++)
{
    if (array[index] < currentSmallest)
        currentSmallest = array[index];
}
System.out.println(currentSmallest);

int total = 0;
for (int index = 0; index < array.length; index++)
    total += array[index];
double average = (double)total / array.length;
System.out.println(average);

    Modify the code to use foreach loops instead of for loops
*/

public class TheLawsOfFreach {
    public static void main(String[] args) {
        // Old code with for loops
        System.out.println("This is the result of the old code with for loops");
        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        for (int index = 0; index < array.length; index++)
        {
            if (array[index] < currentSmallest)
                currentSmallest = array[index];
        }
        System.out.println(currentSmallest);

        int total = 0;
        for (int index = 0; index < array.length; index++)
            total += array[index];
        double average = (double)total / array.length;
        System.out.println(average);

        // New code with foreach loops
        System.out.println("This is the result of the new code with foreach loops");
        int[] array2 = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest2 = Integer.MAX_VALUE; // Start higher than anything in the array.
        // foreach loop instead of for loop, but still uses a nested if, not sure how to avoid this, if that was the purpose?
        for (int index : array2) {
            // the if causes the foreach loop to check whether currentSmallest2 is bigger than the index and thus update currentSmallest2, after looping "each" value of the array, only the biggest will remain
            if (currentSmallest2 > index) {
                currentSmallest2 = index;
            }
        }
        System.out.println(currentSmallest2);

        int total2 = 0;
        /* So my understanding is that in a foreach loop, in the following case each loop index becomes the value of the next array value (instead of representing the place inside the array)
           Then summing that value to the initially empty value of total2, then looping through all values inside array2 for the total sum of array2
        */
        for (int index : array2) {
            total2 += index;
        }
        double average2 = (double)total2 / array2.length;
        System.out.println(average2);
    }
}
