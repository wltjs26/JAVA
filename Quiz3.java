/* Quiz 4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * My name is Jisun Yun
 */


 import java.util.Arrays;
 
 public class Quiz3 {
 
    // to make an array 
     public static int second(int[] array3) {
         int thelargest = Integer.MIN_VALUE;
         int secondLargestnumber = Integer.MIN_VALUE;
    // Specify the conditions for the array to find the second largest number. 
         for (int j = 0; j < array3.length; j++) {
    // first, find the largest number in the array. then define the conditions for identifying the second largest one. 
             if (array3[j] > thelargest) {
                 secondLargestnumber = thelargest;
                 thelargest = array3[j];
             } else if (array3[j] > secondLargestnumber && array3[j] != thelargest) {
                 secondLargestnumber = array3[j];
             }
         }
 
         return secondLargestnumber;
     }
    // to create the test array. 
     public static void main(String[] args) {
         int[] test = {91, 2, 6, 82, 201, 1205};
    // apply the function to find the second largest element. 
         int secondLargesttest = second(test);
    // print the result if there is a values that meet these conditions, and then print it out. 
    // otherwise, print nothing. 
         System.out.println("The test array is " + Arrays.toString(test));
         
         if (secondLargesttest != Integer.MIN_VALUE) {
             System.out.println("The second largest element is " + secondLargesttest + ".");
         } else {
             System.out.println("There is no element followed these conditions.");
         }
     }
 }
 
     // the end. 
 