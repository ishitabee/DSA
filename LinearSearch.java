//Linear Search using Java.
//Searches the element you are looking for in the array and provides you with its position/index.

import java.util.Scanner;

public class LinearSearch{
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);   //scanner object 

        System.out.println("Enter the size of the array: ");              //number of elements in the array
        int sizeOfArray = sc.nextInt();                                     //user input
        int [] myArray = new int [sizeOfArray];
 
        System.out.println("Enter the elements of the array: ");        //elements of the array
        for (int i=0; i<sizeOfArray;i++){                        
            myArray[i] = sc.nextInt();                                    //user input
        }

        System.out.println("Enter the element to be searched: ");     //element to be searched
        int elementSearched = sc.nextInt();                             //user input
         
        for (int i=0; i<sizeOfArray;i++){                        
            if (myArray[i] == elementSearched){                         
                System.out.println("Element found at position: " + (i + 1) + " \nIt can be said that index of element is : " + i);   
                return;                                                 
            }
        

            sc.close();   
        }

        System.out.println("Element does not exist in the array.");
    } 
}