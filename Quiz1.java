

/* Quiz 4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * My name is Jisun Yun
 */

import java.util.Arrays;

public class Quiz1 {
	// set the conditions. let's sort the values. 
    public static void setarray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
    // find the first 1 from the right. 
            while (left < right && array[right] == 1)
            	right--;

    // find the first 0 from the left. 
        	while (left < right && array[left] == 0 )
                left++;
    // sort the remaining values. 
            if (left < right) {
            	array[right] = 1;
            	array[left] = 0;
            	right--;
            	left++;
                

            }
        }
        }
    
    
        
    // calculate the result. 
    public static void main(String[] args) {
    // set the test array. 
        int[] array1 = {1, 1, 1, 0, 0, 0, 0, 1};
        System.out.println("last array is " + Arrays.toString(array1));
    // apply the upper function. to the test array. 
        setarray(array1);
        System.out.println("\nnew array is " + Arrays.toString(array1));
    }
}
    // the end. 