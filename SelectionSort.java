//Selection Sort using Java.
//Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.

import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");       //user input for size of array
        int sizeOfArray= sc.nextInt();

        int[] myArray= new int[sizeOfArray];                                   //creating array with user given size


        System.out.println("Enter the elements of the array:");                //user input for elements of array
        for(int element=0; element<sizeOfArray; element++){
            myArray[element]= sc.nextInt();
        }


        for(int i=0; i<sizeOfArray-1; i++){                                       
            int SmallestIndex= i;
            for(int j=i+1; j<sizeOfArray; j++){
                if(myArray[j]<myArray[SmallestIndex]){
                    SmallestIndex= j;
                }
            }
            int temp= myArray[SmallestIndex];                                  //that's how you swap using temporary variables :)
            myArray[SmallestIndex]= myArray[i];
            myArray[i]= temp;
        }

        System.out.println("Sorted array:");                                              
        for(int element=0; element<sizeOfArray; element++){
            System.out.print(myarray[element]+ " ");
        }




    }
}
