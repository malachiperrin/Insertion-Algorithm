// Filename: InsertionSortDemo.java
// Author: Malachi
// Date: 2/12/19

import java.util.*;

public class InsertionSortDemo
{
    public static void main(String[] args)
    {
        // Variables and constants
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // for loop that will ask the user to enter up to 5 numbers, we store those numbers in our someNums array
        for(a = 0; a < someNums.length; a++)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Calls the display method which accepts the array and the number of iterations the sort loop has done so far
        display(someNums, 0);

        // The Insertion sort algorithm
        a = 1;
        while(a < someNums.length)
        {
            temp = someNums[a];
            b = a - 1; // Corresponds to the previous value in the array
            while(b >= 0 && someNums[b] > temp)
            {
                someNums[b + 1] = someNums[b];
                b--;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            a++;
        }
    }

    public static void display(int[] someNums, int a)
    {
        System.out.print("Iteration " + a + ": ");
        // for loop simply displays all 5 array values
        for (int x = 0; x < someNums.length; x++)
        {
            System.out.print(someNums[x] + " ");
            System.out.println();
        }
    }
}
