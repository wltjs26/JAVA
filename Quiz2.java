/* Quiz 4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * My name is Jisun Yun
 */


 import java.util.Arrays;
 
 public class Quiz2 {
 
     public static boolean testgogo(int[] array1, int[] array2) {
    // verify that the two arrays are of the same length. 
         if (array1.length != array2.length) {
             return false;
         }
 
    // check the each element of the arrays. same or not.  
         for (int j = 0; j < array1.length; j++) {
             if (array1[j] != array2[j]) {
                 return false;
             }
         }
 
         return true;
     }
 
     public static void main(String[] args) {
    // set the arrays. 
    // array1 and array2 have same elements.
    // array3 and array4 have different elements. 
         System.out.println("Let's figure out the arrays\n");
         int[] testarray1 = {1, 2, 3, 4, 5};
         int[] testarray2 = {1, 2, 3, 4, 5};
         int[] testarray3 = {21, 33, 52, 78, 99};
         int[] testarray4 = {100, 32, 163, 894, 65}; 
 
    // give the information. 
         System.out.println("array 1 is " + Arrays.toString(testarray1));
         System.out.println("array 2 is " + Arrays.toString(testarray2));
         System.out.println();
         System.out.println("array 3 is " + Arrays.toString(testarray3));
         System.out.println("array 4 is " + Arrays.toString(testarray4));
 
    // test that the arrays are same or not. 
         boolean result1 = testgogo(testarray1, testarray2);
         boolean result2 = testgogo(testarray3, testarray4);
 
    // print the results. 
         if (result1) {
             System.out.println("\nResult: the array1 and array2 are exactly the same.");
         } else {
             System.out.println("\nResult: the array1 and array2 are not identical.");
         }
         if (result2) {
             System.out.println("\nResult: the array3 and array4 are exactly the same.");
         } else {
             System.out.println("\nResult: the array3 and array4 are not identical.");
         }
 
        
     }
 }
    // the end. 