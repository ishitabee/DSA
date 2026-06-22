//Insertion Sort using java.
/* Insertion Sort algorithm uses one part of the array to hold the sorted values,
 and the other part of the array to hold values that are not sorted yet.*/
//Time complexity for this is n^2.

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = " ";

        do {

            System.out.println("Enter the size of the array:");                    //user input for array size
            int arraySize = sc.nextInt();

            int[] myArray = new int[arraySize];

            System.out.println("Enter the elements of the array:");                //user input for elements
            for (int element = 0; element < arraySize; element++) {
                myArray[element] = sc.nextInt();
            }

            
            for (int i = 1; i < arraySize; i++) {

                int currentIndex = i;
                int previousIndex = i - 1;

                //swaps only if the previous element is greater

                while (previousIndex >= 0 &&                                         
                        myArray[previousIndex] > myArray[currentIndex]) {

                    int temp = myArray[previousIndex];
                    myArray[previousIndex] = myArray[currentIndex];
                    myArray[currentIndex] = temp;

                    currentIndex = previousIndex;
                    previousIndex--;
                }
            }

            System.out.println("Sorted Array:");
            for (int element = 0; element < arraySize; element++) {
                System.out.print(myArray[element] + " ");
            }

            System.out.println();
            System.out.print("\nDo you want to sort another array? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        
        sc.close();
    }
}
