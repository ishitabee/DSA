//Bubble Sort using Java.
//Bubble Sort sorts an array from the lowest value to the highest value.
//Compares the initial element with the next element and swaps if the initial element is greater than the next element until entire array is sorted.

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int sizeOfArray = sc.nextInt();
        int[] myArray = new int[sizeOfArray];
        System.out.println("Enter the elements of the array: ");
        for(int element=0; element<sizeOfArray; element++){
            myArray[element] = sc.nextInt();
        }
        sc.close();

        System.out.print("Array before sorting:  ");
        for(int element=0; element<sizeOfArray; element++){
            System.out.print(myArray[element] + " ");
        }

        for (int i=0; i<sizeOfArray;i++){
            for (int j=0; j<sizeOfArray-1;j++){
                if (myArray[j] > myArray[j+1]){
                    int tempNum= myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempNum;
                }
            }
        }

        System.out.print("\n Array after sorting: ");
        for(int element=0; element<sizeOfArray; element++){
            System.out.print(myArray[element] + " ");
        }


    }
}
